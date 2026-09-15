package androidx.constraintlayout.core.motion.utils;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class Utils {
    static DebugHandle sOurHandle;

    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        printStream.println(sb.toString());
    }

    public static void loge(String str, String str2) {
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" : ");
        sb.append(str2);
        printStream.println(sb.toString());
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e2) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder();
            sb.append(e2.toString());
            sb.append("\n");
            sb.append(Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
            printStream.println(sb.toString());
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int iClamp = clamp((int) (f * 255.0f));
        int iClamp2 = clamp((int) (f2 * 255.0f));
        return (iClamp << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (iClamp2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        sOurHandle = debugHandle;
    }

    public static void logStack(String str, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int iMin = Math.min(i, stackTrace.length - 1);
        String string = " ";
        for (int i2 = 1; i2 <= iMin; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder sb = new StringBuilder(".(");
            sb.append(stackTraceElement.getFileName());
            sb.append(":");
            sb.append(stackTraceElement.getLineNumber());
            sb.append(") ");
            sb.append(stackTraceElement.getMethodName());
            String string2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(" ");
            string = sb2.toString();
            PrintStream printStream = System.out;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(string);
            sb3.append(string2);
            sb3.append(string);
            printStream.println(sb3.toString());
        }
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append(methodName);
        sb.append("                  ");
        String strSubstring = sb.toString().substring(0, 17);
        String strSubstring2 = "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length());
        StringBuilder sb2 = new StringBuilder(".(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(":");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")");
        sb2.append(strSubstring2);
        sb2.append(strSubstring);
        String string = sb2.toString();
        PrintStream printStream = System.out;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(" ");
        sb3.append(str);
        printStream.println(sb3.toString());
        DebugHandle debugHandle = sOurHandle;
        if (debugHandle != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string);
            sb4.append(" ");
            sb4.append(str);
            debugHandle.message(sb4.toString());
        }
    }
}
