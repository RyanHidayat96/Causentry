package com.causentry.zygote;

import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.util.Log;

import com.v7878.r8.annotations.DoNotObfuscate;
import com.v7878.r8.annotations.DoNotObfuscateType;
import com.v7878.r8.annotations.DoNotShrink;
import com.v7878.r8.annotations.DoNotShrinkType;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Bidirectional length-prefixed JSON channel over the Companion-supplied Unix socket FD.
 * Receives real-time policy pushes from causentryd (0% idle CPU) and sends live hook telemetry.
 */
@DoNotObfuscateType
@DoNotShrinkType
public final class PolicyChannel {
    private static final String TAG = "CausentryZygote";
    private static final int MAX_FRAME_BYTES = 4 * 1024 * 1024;

    public interface PolicyListener {
        void onPolicyJson(JSONObject policy);
    }

    private static final CopyOnWriteArrayList<PolicyListener> LISTENERS = new CopyOnWriteArrayList<>();
    private static final Object WRITE_LOCK = new Object();
    private static volatile DataOutputStream sOut;
    private static volatile ParcelFileDescriptor sPfd;
    private static volatile boolean sStarted;
    private static volatile String sRole = "unknown";

    private PolicyChannel() {}

    @DoNotObfuscate
    @DoNotShrink
    private static native int nativeTakePolicyFd();

    public static void addListener(PolicyListener listener) {
        if (listener != null) {
            LISTENERS.addIfAbsent(listener);
        }
    }

    public static synchronized boolean start(String role) {
        if (sStarted) return sPfd != null;
        sStarted = true;
        sRole = role;

        int fd = -1;
        try {
            fd = nativeTakePolicyFd();
        } catch (Throwable t) {
            Log.w(TAG, "PolicyChannel nativeTakePolicyFd unavailable: " + t.getMessage());
        }
        if (fd < 0) {
            Log.w(TAG, "PolicyChannel no companion fd for role=" + role + "; cold-start fallback only");
            return false;
        }

        try {
            ParcelFileDescriptor pfd = ParcelFileDescriptor.adoptFd(fd);
            sPfd = pfd;
            sOut = new DataOutputStream(new FileOutputStream(pfd.getFileDescriptor()));

            // Handshake with causentryd
            JSONObject hello = new JSONObject();
            hello.put("type", "hello");
            hello.put("role", role);
            hello.put("pid", Process.myPid());
            sendJson(hello);

            Thread reader = new Thread(() -> readLoop(pfd), "causentry-policy");
            reader.setDaemon(true);
            reader.start();
            Log.i(TAG, "PolicyChannel started for role=" + role);
            return true;
        } catch (Throwable t) {
            Log.e(TAG, "PolicyChannel start failed", t);
            return false;
        }
    }

    private static void readLoop(ParcelFileDescriptor pfd) {
        try (DataInputStream in = new DataInputStream(new FileInputStream(pfd.getFileDescriptor()))) {
            while (true) {
                int len = in.readInt();
                if (len <= 0 || len > MAX_FRAME_BYTES) {
                    Log.w(TAG, "PolicyChannel invalid frame length=" + len);
                    break;
                }
                byte[] buf = new byte[len];
                in.readFully(buf);
                String text = new String(buf, StandardCharsets.UTF_8);
                try {
                    JSONObject obj = new JSONObject(text);
                    if ("policy".equals(obj.optString("type", "policy"))) {
                        for (PolicyListener l : LISTENERS) {
                            try {
                                l.onPolicyJson(obj);
                            } catch (Throwable err) {
                                Log.e(TAG, "PolicyChannel listener error", err);
                            }
                        }
                    }
                } catch (Throwable parseErr) {
                    Log.w(TAG, "PolicyChannel json parse error", parseErr);
                }
            }
        } catch (Throwable eof) {
            Log.i(TAG, "PolicyChannel stream closed for role=" + sRole);
        } finally {
            synchronized (WRITE_LOCK) {
                sOut = null;
            }
            try {
                pfd.close();
            } catch (Throwable ignored) {}
        }
    }

    public static void sendTelemetry(JSONObject payload) {
        if (payload == null) return;
        try {
            payload.put("type", "telemetry");
            payload.put("role", sRole);
            payload.put("pid", Process.myPid());
            sendJson(payload);
        } catch (Throwable ignored) {}
    }

    private static void sendJson(JSONObject obj) {
        DataOutputStream out;
        synchronized (WRITE_LOCK) {
            out = sOut;
            if (out == null) return;
            try {
                byte[] bytes = obj.toString().getBytes(StandardCharsets.UTF_8);
                out.writeInt(bytes.length);
                out.write(bytes);
                out.flush();
            } catch (Throwable t) {
                Log.w(TAG, "PolicyChannel write failed", t);
            }
        }
    }
}
