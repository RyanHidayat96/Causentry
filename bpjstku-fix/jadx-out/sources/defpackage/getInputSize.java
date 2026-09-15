package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class getInputSize implements Closeable {
    Writer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final File TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final File asBinder;
    private long cancel;
    private final File g;
    private final File notify;
    private long cancelAll = 0;
    final LinkedHashMap<String, TuitionPaymentFragmentspecialinlinedviewModeldefault1> b = new LinkedHashMap<>(0, 0.75f, true);
    private long INotificationSideChannel = 0;
    private ThreadPoolExecutor d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new TuitionPaymentFragmentbindingInflater1(0));
    private final Callable<Void> asInterface = new Callable<Void>() { // from class: getInputSize.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (getInputSize.this) {
                if (getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    return null;
                }
                getInputSize.this.TuitionPaymentFragmentbindingInflater1();
                getInputSize getinputsize = getInputSize.this;
                int i = getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i >= 2000 && i >= getinputsize.b.size()) {
                    getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                }
                return null;
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f947a = 1;
    final int TuitionPaymentFragmentbindingInflater1 = 1;

    public static /* synthetic */ void b(getInputSize getinputsize, b bVar, boolean z) throws IOException {
        int i;
        synchronized (getinputsize) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b != bVar) {
                throw new IllegalStateException();
            }
            if (z && !tuitionPaymentFragmentspecialinlinedviewModeldefault1.d) {
                for (int i2 = 0; i2 < getinputsize.TuitionPaymentFragmentbindingInflater1; i2++) {
                    if (bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i2]) {
                        if (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i2].exists()) {
                            b(getInputSize.this, bVar, false);
                            return;
                        }
                    } else {
                        b(getInputSize.this, bVar, false);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            for (int i3 = 0; i3 < getinputsize.TuitionPaymentFragmentbindingInflater1; i3++) {
                File file = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3];
                if (z) {
                    if (file.exists()) {
                        File file2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1[i3];
                        file.renameTo(file2);
                        long j = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3];
                        long length = file2.length();
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3] = length;
                        getinputsize.cancelAll = (getinputsize.cancelAll - j) + length;
                    }
                } else if (file.exists() && !file.delete()) {
                    throw new IOException();
                }
            }
            getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = null;
            if (!(tuitionPaymentFragmentspecialinlinedviewModeldefault1.d | z)) {
                getinputsize.b.remove(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) "REMOVE");
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(' ');
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append('\n');
            } else {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.d = true;
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) "CLEAN");
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(' ');
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append('\n');
                if (z) {
                    long j2 = getinputsize.INotificationSideChannel;
                    getinputsize.INotificationSideChannel = 1 + j2;
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface = j2;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            if (getinputsize.cancelAll > getinputsize.cancel || ((i = getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault3) >= 2000 && i >= getinputsize.b.size())) {
                getinputsize.d.submit(getinputsize.asInterface);
            }
        }
    }

    private getInputSize(File file, int i, int i2, long j) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = file;
        this.g = new File(file, "journal");
        this.notify = new File(file, "journal.tmp");
        this.asBinder = new File(file, "journal.bkp");
        this.cancel = j;
    }

    public static getInputSize TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file, long j) throws IOException {
        String strTuitionPaymentFragmentbindingInflater1;
        String strSubstring;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        getInputSize getinputsize = new getInputSize(file, 1, 1, j);
        if (getinputsize.g.exists()) {
            try {
                getCameraInternal getcamerainternal = new getCameraInternal(new FileInputStream(getinputsize.g), getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                try {
                    String strTuitionPaymentFragmentbindingInflater2 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentbindingInflater3 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentbindingInflater4 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentbindingInflater5 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentbindingInflater6 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                    if (!"libcore.io.DiskLruCache".equals(strTuitionPaymentFragmentbindingInflater2) || !"1".equals(strTuitionPaymentFragmentbindingInflater3) || !Integer.toString(getinputsize.f947a).equals(strTuitionPaymentFragmentbindingInflater4) || !Integer.toString(getinputsize.TuitionPaymentFragmentbindingInflater1).equals(strTuitionPaymentFragmentbindingInflater5) || !"".equals(strTuitionPaymentFragmentbindingInflater6)) {
                        StringBuilder sb = new StringBuilder("unexpected journal header: [");
                        sb.append(strTuitionPaymentFragmentbindingInflater2);
                        sb.append(", ");
                        sb.append(strTuitionPaymentFragmentbindingInflater3);
                        sb.append(", ");
                        sb.append(strTuitionPaymentFragmentbindingInflater5);
                        sb.append(", ");
                        sb.append(strTuitionPaymentFragmentbindingInflater6);
                        sb.append("]");
                        throw new IOException(sb.toString());
                    }
                    byte b2 = 0;
                    int i = 0;
                    while (true) {
                        try {
                            strTuitionPaymentFragmentbindingInflater1 = getcamerainternal.TuitionPaymentFragmentbindingInflater1();
                            int iIndexOf = strTuitionPaymentFragmentbindingInflater1.indexOf(32);
                            if (iIndexOf == -1) {
                                throw new IOException("unexpected journal line: ".concat(String.valueOf(strTuitionPaymentFragmentbindingInflater1)));
                            }
                            int i2 = iIndexOf + 1;
                            int iIndexOf2 = strTuitionPaymentFragmentbindingInflater1.indexOf(32, i2);
                            if (iIndexOf2 == -1) {
                                strSubstring = strTuitionPaymentFragmentbindingInflater1.substring(i2);
                                if (iIndexOf == 6 && strTuitionPaymentFragmentbindingInflater1.startsWith("REMOVE")) {
                                    getinputsize.b.remove(strSubstring);
                                }
                                i++;
                            } else {
                                strSubstring = strTuitionPaymentFragmentbindingInflater1.substring(i2, iIndexOf2);
                            }
                            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = getinputsize.b.get(strSubstring);
                            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(getinputsize, strSubstring, b2);
                                getinputsize.b.put(strSubstring, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            }
                            if (iIndexOf2 != -1 && iIndexOf == 5 && strTuitionPaymentFragmentbindingInflater1.startsWith("CLEAN")) {
                                String[] strArrSplit = strTuitionPaymentFragmentbindingInflater1.substring(iIndexOf2 + 1).split(" ");
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1.d = true;
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = null;
                                if (strArrSplit.length != getInputSize.this.TuitionPaymentFragmentbindingInflater1) {
                                    StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
                                    sb2.append(Arrays.toString(strArrSplit));
                                    throw new IOException(sb2.toString());
                                }
                                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                                    try {
                                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3] = Long.parseLong(strArrSplit[i3]);
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb3 = new StringBuilder("unexpected journal line: ");
                                        sb3.append(Arrays.toString(strArrSplit));
                                        throw new IOException(sb3.toString());
                                    }
                                }
                            } else if (iIndexOf2 != -1 || iIndexOf != 5 || !strTuitionPaymentFragmentbindingInflater1.startsWith("DIRTY")) {
                                if (iIndexOf2 != -1 || iIndexOf != 4 || !strTuitionPaymentFragmentbindingInflater1.startsWith("READ")) {
                                    break;
                                }
                            } else {
                                tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = new b(getinputsize, tuitionPaymentFragmentspecialinlinedviewModeldefault1, b2);
                            }
                            i++;
                        } catch (EOFException unused2) {
                            getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i - getinputsize.b.size();
                            if (getcamerainternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == -1) {
                                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                            } else {
                                getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(getinputsize.g, true), getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                            }
                            getInputCropRect.TuitionPaymentFragmentbindingInflater1(getcamerainternal);
                            File file4 = getinputsize.notify;
                            if (file4.exists() && !file4.delete()) {
                                throw new IOException();
                            }
                            Iterator<TuitionPaymentFragmentspecialinlinedviewModeldefault1> it = getinputsize.b.values().iterator();
                            while (it.hasNext()) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1 next = it.next();
                                if (next.b == null) {
                                    for (int i4 = 0; i4 < getinputsize.TuitionPaymentFragmentbindingInflater1; i4++) {
                                        getinputsize.cancelAll += next.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i4];
                                    }
                                } else {
                                    next.b = null;
                                    for (int i5 = 0; i5 < getinputsize.TuitionPaymentFragmentbindingInflater1; i5++) {
                                        File file5 = next.TuitionPaymentFragmentbindingInflater1[i5];
                                        if (file5.exists() && !file5.delete()) {
                                            throw new IOException();
                                        }
                                        File file6 = next.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5];
                                        if (file6.exists() && !file6.delete()) {
                                            throw new IOException();
                                        }
                                    }
                                    it.remove();
                                }
                            }
                            return getinputsize;
                        }
                    }
                    throw new IOException("unexpected journal line: ".concat(String.valueOf(strTuitionPaymentFragmentbindingInflater1)));
                } catch (Throwable th) {
                    getInputCropRect.TuitionPaymentFragmentbindingInflater1(getcamerainternal);
                    throw th;
                }
            } catch (IOException e2) {
                PrintStream printStream = System.out;
                StringBuilder sb4 = new StringBuilder("DiskLruCache ");
                sb4.append(file);
                sb4.append(" is corrupt: ");
                sb4.append(e2.getMessage());
                sb4.append(", removing");
                printStream.println(sb4.toString());
                getinputsize.close();
                getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getinputsize.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        }
        file.mkdirs();
        getInputSize getinputsize2 = new getInputSize(file, 1, 1, j);
        getinputsize2.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return getinputsize2;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
        synchronized (this) {
            Writer writer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (writer != null) {
                b(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.notify), getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f947a));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.TuitionPaymentFragmentbindingInflater1));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 : this.b.values()) {
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("DIRTY ");
                        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        sb.append('\n');
                        bufferedWriter.write(sb.toString());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        sb2.append(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        sb2.append('\n');
                        bufferedWriter.write(sb2.toString());
                    }
                }
                b(bufferedWriter);
                if (this.g.exists()) {
                    File file = this.g;
                    File file2 = this.asBinder;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (this.notify.renameTo(this.g)) {
                    this.asBinder.delete();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.g, true), getInputCropRect.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
                } else {
                    throw new IOException();
                }
            } catch (Throwable th) {
                b(bufferedWriter);
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                return;
            }
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 : new ArrayList(this.b.values())) {
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b != null) {
                    b bVar = tuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                    b(getInputSize.this, bVar, false);
                }
            }
            TuitionPaymentFragmentbindingInflater1();
            b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        }
    }

    final void TuitionPaymentFragmentbindingInflater1() throws IOException {
        while (this.cancelAll > this.cancel) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b.entrySet().iterator().next().getKey());
        }
    }

    private static void b(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        private final long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private final long[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final File[] b;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault2(getInputSize getinputsize, String str, long j, File[] fileArr, long[] jArr, byte b) {
            this(str, j, fileArr, jArr);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, long j, File[] fileArr, long[] jArr) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
            this.b = fileArr;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = jArr;
        }
    }

    public final class b {
        final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public boolean b;

        /* synthetic */ b(getInputSize getinputsize, TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1, byte b) {
            this(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        private b(TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1.d ? null : new boolean[getInputSize.this.TuitionPaymentFragmentbindingInflater1];
        }

        public final File TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
            File file;
            synchronized (getInputSize.this) {
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b != this) {
                    throw new IllegalStateException();
                }
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.d) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = true;
                }
                file = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0];
                getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.mkdirs();
            }
            return file;
        }

        public final void b() throws IOException {
            getInputSize.b(getInputSize.this, this, false);
        }
    }

    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        File[] TuitionPaymentFragmentbindingInflater1;
        final long[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        File[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        long asInterface;
        b b;
        boolean d;

        /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault1(getInputSize getinputsize, String str, byte b) {
            this(str);
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new long[getInputSize.this.TuitionPaymentFragmentbindingInflater1];
            this.TuitionPaymentFragmentbindingInflater1 = new File[getInputSize.this.TuitionPaymentFragmentbindingInflater1];
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new File[getInputSize.this.TuitionPaymentFragmentbindingInflater1];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < getInputSize.this.TuitionPaymentFragmentbindingInflater1; i++) {
                sb.append(i);
                this.TuitionPaymentFragmentbindingInflater1[i] = new File(getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, sb.toString());
                sb.append(".tmp");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i] = new File(getInputSize.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, sb.toString());
                sb.setLength(length);
            }
        }

        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements ThreadFactory {
        private TuitionPaymentFragmentbindingInflater1() {
        }

        /* synthetic */ TuitionPaymentFragmentbindingInflater1(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread;
            synchronized (this) {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            }
            return thread;
        }
    }

    public final b TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) throws IOException {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.get(str);
                byte b2 = 0;
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(this, str, b2);
                    this.b.put(str, tuitionPaymentFragmentspecialinlinedviewModeldefault1);
                } else if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b != null) {
                    return null;
                }
                b bVar = new b(this, tuitionPaymentFragmentspecialinlinedviewModeldefault1, b2);
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.b = bVar;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) "DIRTY");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(' ');
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) str);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append('\n');
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                return bVar;
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final TuitionPaymentFragmentspecialinlinedviewModeldefault2 b(String str) throws IOException {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.get(str);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    return null;
                }
                if (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.d) {
                    return null;
                }
                for (File file : tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1) {
                    if (!file.exists()) {
                        return null;
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) "READ");
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(' ');
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) str);
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append('\n');
                int i = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (i >= 2000 && i >= this.b.size()) {
                    this.d.submit(this.asInterface);
                }
                return new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, str, tuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (byte) 0);
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) throws IOException {
        synchronized (this) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.b.get(str);
                if (tuitionPaymentFragmentspecialinlinedviewModeldefault1 != null && tuitionPaymentFragmentspecialinlinedviewModeldefault1.b == null) {
                    for (int i = 0; i < this.TuitionPaymentFragmentbindingInflater1; i++) {
                        File file = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1[i];
                        if (file.exists() && !file.delete()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("failed to delete ");
                            sb.append(file);
                            throw new IOException(sb.toString());
                        }
                        this.cancelAll -= tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i];
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i] = 0;
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) "REMOVE");
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append(' ');
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append((CharSequence) str);
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.append('\n');
                    this.b.remove(str);
                    int i2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    if (i2 >= 2000 && i2 >= this.b.size()) {
                        this.d.submit(this.asInterface);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("cache is closed");
        }
    }
}
