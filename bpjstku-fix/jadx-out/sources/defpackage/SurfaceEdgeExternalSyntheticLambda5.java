package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceEdgeExternalSyntheticLambda5 {
    private static String d = "MD5";
    private static MessageDigest g;
    boolean TuitionPaymentFragmentbindingInflater1;
    long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    File b;
    private Random asInterface = new Random();
    long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
    private Comparator<File> asBinder = new Comparator<File>() { // from class: SurfaceEdgeExternalSyntheticLambda5.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long jLastModified = file.lastModified();
            long jLastModified2 = file2.lastModified();
            if (jLastModified < jLastModified2) {
                return -1;
            }
            return jLastModified2 > jLastModified ? 1 : 0;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f219a = false;
    public TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    class TuitionPaymentFragmentbindingInflater1 {
        final long TuitionPaymentFragmentbindingInflater1;

        public TuitionPaymentFragmentbindingInflater1(File file) {
            this.TuitionPaymentFragmentbindingInflater1 = file.length();
        }
    }

    private static MessageDigest TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (!"MD5".equals(d)) {
            return null;
        }
        for (Provider provider : Security.getProviders()) {
            Iterator<Provider.Service> it = provider.getServices().iterator();
            while (it.hasNext()) {
                String algorithm = it.next().getAlgorithm();
                d = algorithm;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
                    if (messageDigest != null) {
                        return messageDigest;
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
        }
        return null;
    }

    static {
        try {
            g = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e2) {
            MessageDigest messageDigestTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            g = messageDigestTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (messageDigestTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                throw new RuntimeException(e2);
            }
        }
        try {
            g = (MessageDigest) g.clone();
        } catch (CloneNotSupportedException unused) {
        }
    }

    public static String b(Object... objArr) {
        String string;
        synchronized (SurfaceEdgeExternalSyntheticLambda5.class) {
            g.reset();
            for (Object obj : objArr) {
                g.update(obj.toString().getBytes());
            }
            string = new BigInteger(1, g.digest()).toString(16);
        }
        return string;
    }

    public final File TuitionPaymentFragmentbindingInflater1() {
        File file;
        do {
            file = new File(this.b, new BigInteger(128, this.asInterface).toString(16));
        } while (file.exists());
        return file;
    }

    public static void TuitionPaymentFragmentbindingInflater1(File... fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                file.delete();
            }
        }
    }

    public final FileInputStream[] b(String str) throws IOException {
        FileInputStream[] fileInputStreamArr = new FileInputStream[2];
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                File file = this.b;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".");
                sb.append(i2);
                File file2 = new File(file, sb.toString());
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(file2.getName());
                file2.setLastModified(System.currentTimeMillis());
                fileInputStreamArr[i2] = new FileInputStream(file2);
            } catch (IOException e2) {
                for (int i3 = 0; i3 < 2; i3++) {
                    SurfaceEdgeExternalSyntheticLambda3.b(fileInputStreamArr[i3]);
                }
                int i4 = 0;
                while (true) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(".");
                    sb2.append(i4);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString()) == null) {
                        break;
                    }
                    i4++;
                }
                while (true) {
                    File file3 = this.b;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(".");
                    sb3.append(i);
                    File file4 = new File(file3, sb3.toString());
                    if (!file4.exists()) {
                        throw e2;
                    }
                    file4.delete();
                    i++;
                }
            }
        }
        return fileInputStreamArr;
    }

    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, int i) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".");
        sb.append(i);
        return new File(file, sb.toString());
    }

    public class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends SurfaceEdgeExternalSyntheticLambda2<String, TuitionPaymentFragmentbindingInflater1> {
        @Override // defpackage.SurfaceEdgeExternalSyntheticLambda2
        protected final /* synthetic */ long b(String str, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1) {
            return Math.max(SurfaceEdgeExternalSyntheticLambda5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.SurfaceEdgeExternalSyntheticLambda2
        public final /* bridge */ /* synthetic */ void b(boolean z, String str, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1, TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2) {
            String str2 = str;
            TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater3 = tuitionPaymentFragmentbindingInflater2;
            super.b(z, str2, tuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater3);
            if (tuitionPaymentFragmentbindingInflater3 != null || SurfaceEdgeExternalSyntheticLambda5.this.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            new File(SurfaceEdgeExternalSyntheticLambda5.this.b, str2).delete();
        }

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super(SurfaceEdgeExternalSyntheticLambda5.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentbindingInflater1 = true;
        try {
            File[] fileArrListFiles = this.b.listFiles();
            if (fileArrListFiles != null) {
                ArrayList<File> arrayList = new ArrayList();
                Collections.addAll(arrayList, fileArrListFiles);
                Collections.sort(arrayList, this.asBinder);
                for (File file : arrayList) {
                    String name = file.getName();
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(name, new TuitionPaymentFragmentbindingInflater1(file));
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(name);
                }
                this.TuitionPaymentFragmentbindingInflater1 = false;
                return;
            }
            this.TuitionPaymentFragmentbindingInflater1 = false;
        } catch (Throwable th) {
            this.TuitionPaymentFragmentbindingInflater1 = false;
            throw th;
        }
    }

    public SurfaceEdgeExternalSyntheticLambda5(File file, long j) {
        this.b = file;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = j;
        file.mkdirs();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, File... fileArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            File file = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(i2);
            File file2 = new File(file, sb.toString());
            if (!file2.exists()) {
                break;
            }
            file2.delete();
            i2++;
        }
        for (int i3 = 0; i3 < fileArr.length; i3++) {
            File file3 = fileArr[i3];
            File file4 = this.b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".");
            sb2.append(i3);
            File file5 = new File(file4, sb2.toString());
            if (file3.renameTo(file5)) {
                String name = file3.getName();
                int i4 = 0;
                while (true) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(name);
                    sb3.append(".");
                    sb3.append(i4);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb3.toString()) == null) {
                        break;
                    } else {
                        i4++;
                    }
                }
                int i5 = 0;
                while (true) {
                    File file6 = this.b;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(name);
                    sb4.append(".");
                    sb4.append(i5);
                    File file7 = new File(file6, sb4.toString());
                    if (file7.exists()) {
                        file7.delete();
                        i5++;
                    }
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(".");
                sb5.append(i3);
                tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(sb5.toString(), new TuitionPaymentFragmentbindingInflater1(file5));
            } else {
                if (fileArr != null) {
                    for (File file8 : fileArr) {
                        file8.delete();
                    }
                }
                int i6 = 0;
                while (true) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(".");
                    sb6.append(i6);
                    if (tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb6.toString()) == null) {
                        break;
                    } else {
                        i6++;
                    }
                }
                while (true) {
                    File file9 = this.b;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(".");
                    sb7.append(i);
                    File file10 = new File(file9, sb7.toString());
                    if (!file10.exists()) {
                        return;
                    }
                    file10.delete();
                    i++;
                }
            }
        }
    }

    public final File TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        File file = this.b;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        File file2 = new File(file, sb.toString());
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(file2.getName());
        file2.setLastModified(System.currentTimeMillis());
        return file2;
    }
}
