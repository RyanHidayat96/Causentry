package com.squareup.okhttp.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import com.squareup.okhttp.HttpUrl;
import defpackage.RotationProviderListenerWrapper;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.text.Charsets;
import okio.ByteString;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes6.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Charset UTF_8 = Charset.forName(Hex.DEFAULT_CHARSET_NAME);

    private Util() {
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!isAndroidGetsocknameError(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeAll(Closeable closeable, Closeable closeable2) throws IOException {
        closeable.close();
        th = null;
        try {
            closeable2.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (!(th instanceof Error)) {
            throw new AssertionError(th);
        }
        throw ((Error) th);
    }

    public static boolean discard(tryToComplete trytocomplete, int i, TimeUnit timeUnit) {
        try {
            return skipAll(trytocomplete, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean skipAll(tryToComplete trytocomplete, int i, TimeUnit timeUnit) throws IOException {
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = trytocomplete.timeout().getHasDeadline() ? trytocomplete.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        trytocomplete.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            while (trytocomplete.read(rotationProviderListenerWrapper, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != -1) {
                rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
                return true;
            }
            trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
                return false;
            }
            trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
            } else {
                trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static String md5Hex(String str) {
        try {
            return ByteString.TuitionPaymentFragmentbindingInflater1(MessageDigest.getInstance("MD5").digest(str.getBytes(Hex.DEFAULT_CHARSET_NAME))).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static String shaBase64(String str) {
        try {
            return ByteString.TuitionPaymentFragmentbindingInflater1(MessageDigest.getInstance("SHA-1").digest(str.getBytes(Hex.DEFAULT_CHARSET_NAME))).b();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static ByteString sha1(ByteString byteString) {
        try {
            return ByteString.TuitionPaymentFragmentbindingInflater1(MessageDigest.getInstance("SHA-1").digest(byteString.asBinder()));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: com.squareup.okhttp.internal.Util.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        List listIntersect = intersect(tArr, tArr2);
        return (T[]) listIntersect.toArray((Object[]) Array.newInstance((Class<?>) cls, listIntersect.size()));
    }

    private static <T> List<T> intersect(T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            for (T t2 : tArr2) {
                if (t.equals(t2)) {
                    arrayList.add(t2);
                    break;
                }
            }
        }
        return arrayList;
    }

    public static String hostHeader(HttpUrl httpUrl) {
        if (httpUrl.port() != HttpUrl.defaultPort(httpUrl.scheme())) {
            StringBuilder sb = new StringBuilder();
            sb.append(httpUrl.host());
            sb.append(":");
            sb.append(httpUrl.port());
            return sb.toString();
        }
        return httpUrl.host();
    }

    public static String toHumanReadableAscii(String str) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt > 31 && iCodePointAt < 127) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
                rotationProviderListenerWrapper.b(str, 0, iCharCount);
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    rotationProviderListenerWrapper.asBinder((iCodePointAt2 <= 31 || iCodePointAt2 >= 127) ? 63 : iCodePointAt2);
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return rotationProviderListenerWrapper.b(rotationProviderListenerWrapper.size, Charsets.UTF_8);
            }
        }
        return str;
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean contains(String[] strArr, String str) {
        return Arrays.asList(strArr).contains(str);
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length] = str;
        return strArr2;
    }
}
