package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.NetworkRequestHandler;
import com.squareup.picasso.Picasso;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class ExperimentalAudioApi implements Runnable {
    private static final Object INotificationSideChannelStub;
    private static final ThreadLocal<StringBuilder> INotificationSideChannelStubProxy;
    private static int MediaBrowserCompat;
    private static final FileOutputOptions RemoteActionCompatParcelizer;
    private static boolean getExtras;
    private static final AtomicInteger getInterfaceDescriptor;
    private static boolean getNotifyChildrenChangedOptions;
    private static int getRoot;
    private static char[] write;
    public Bitmap INotificationSideChannel;
    private isQualitySupported INotificationSideChannelDefault;
    private int IconCompatParcelizer;
    public findNearestHigherSupportedEncoderProfilesFor TuitionPaymentFragmentbindingInflater1;
    public Exception TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public List<findNearestHigherSupportedEncoderProfilesFor> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f139a;
    final int asBinder;
    public Picasso.LoadedFrom asInterface;
    Future<?> b;
    Picasso.Priority cancel;
    int cancelAll;
    private lowerQualityThan connect;
    public final Picasso d;
    final String g;
    final FileOutputOptions notify;
    final int onTransact = getInterfaceDescriptor.incrementAndGet();
    private FileOutputOptionsBuilder read;
    private static final byte[] $$c = {48, -110, 22, 55};
    private static final int $$d = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {77, -106, 83, 4, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
    private static final int $$b = 0;
    private static int getItem = 0;
    private static int getSessionToken = 1;
    private static int disconnect = 0;

    private static void c(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i + 4;
        int i3 = 98 - (s2 * 14);
        byte[] bArr2 = new byte[s + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = (i3 + s) - 11;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i3;
            if (i4 == s) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i2++;
                i3 = (i3 + bArr[i2]) - 11;
            }
        }
    }

    static {
        getRoot = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        INotificationSideChannelStub = new Object();
        INotificationSideChannelStubProxy = new ThreadLocal<StringBuilder>() { // from class: ExperimentalAudioApi.2
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ StringBuilder initialValue() {
                return new StringBuilder("Picasso-");
            }
        };
        getInterfaceDescriptor = new AtomicInteger();
        RemoteActionCompatParcelizer = new FileOutputOptions() { // from class: ExperimentalAudioApi.1
            @Override // defpackage.FileOutputOptions
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
                return true;
            }

            @Override // defpackage.FileOutputOptions
            public final FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2(FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder, int i) throws IOException {
                throw new IllegalStateException("Unrecognized type of request: ".concat(String.valueOf(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder)));
            }
        };
        int i = disconnect + 95;
        getRoot = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private ExperimentalAudioApi(Picasso picasso, lowerQualityThan lowerqualitythan, isQualitySupported isqualitysupported, FileOutputOptionsBuilder fileOutputOptionsBuilder, findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor, FileOutputOptions fileOutputOptions) {
        this.d = picasso;
        this.connect = lowerqualitythan;
        this.INotificationSideChannelDefault = isqualitysupported;
        this.read = fileOutputOptionsBuilder;
        this.TuitionPaymentFragmentbindingInflater1 = findnearesthighersupportedencoderprofilesfor;
        this.g = findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = findnearesthighersupportedencoderprofilesfor.d;
        this.cancel = findnearesthighersupportedencoderprofilesfor.d.asBinder;
        this.asBinder = findnearesthighersupportedencoderprofilesfor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.f139a = findnearesthighersupportedencoderprofilesfor.g;
        this.notify = fileOutputOptions;
        this.cancelAll = fileOutputOptions.TuitionPaymentFragmentbindingInflater1();
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = write;
        int i4 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = $10 + 13;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i4] = Integer.valueOf(cArr2[i7]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) i4;
                        byte b2 = (byte) (b - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ExpandableListView.getPackedPositionForChild(i4, i4) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i4, i4) == 0L ? 0 : -1)) + 31340), 2994 - TextUtils.getCapsMode("", i4, i4), TextUtils.indexOf("", "", i4, i4) + 17, 1182129903, false, $$e(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i7++;
                    i2 = 2;
                    i4 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompat)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.indexOf("", "", 0, 0) + 43325), 253 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        int i10 = 33602;
        int i11 = 1687675375;
        if (!(!getExtras)) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i12 = $10 + 9;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i11);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char cBlue = (char) (Color.blue(0) + 33602);
                    int i14 = 3085 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                    int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte b3 = (byte) ($$d & 3);
                    byte b4 = (byte) (-b3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cBlue, i14, pressedStateDuration, -2146875848, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                i11 = 1687675375;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (getNotifyChildrenChangedOptions) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cGreen = (char) (i10 - Color.green(0));
                    int i15 = 3085 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                    byte b5 = (byte) ($$d & 3);
                    byte b6 = (byte) (-b5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cGreen, i15, deadChar, -2146875848, false, $$e(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                i10 = 33602;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i16 = 0;
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        while (true) {
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i16;
            if (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 >= getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i17 = $10 + 53;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            i16 = getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str;
        String hexString;
        String str2 = "Picasso-Idle";
        int i = 2 % 2;
        try {
            try {
                try {
                    try {
                        try {
                            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            Uri uri = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelDefault;
                            if (uri != null) {
                                int i2 = getItem + 115;
                                getSessionToken = i2 % 128;
                                if (i2 % 2 == 0) {
                                    hexString = String.valueOf(uri.getPath());
                                    int i3 = 22 / 0;
                                } else {
                                    hexString = String.valueOf(uri.getPath());
                                }
                            } else {
                                hexString = Integer.toHexString(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.cancel);
                            }
                            StringBuilder sb = INotificationSideChannelStubProxy.get();
                            sb.ensureCapacity(hexString.length() + 8);
                            sb.replace(8, sb.length(), hexString);
                            Thread.currentThread().setName(sb.toString());
                            if (this.d.d) {
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Hunter", "executing", outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this));
                                int i4 = getItem + 69;
                                getSessionToken = i4 % 128;
                                int i5 = i4 % 2;
                            }
                            Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                            this.INotificationSideChannel = bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                Handler handler = this.connect.asInterface;
                                handler.sendMessage(handler.obtainMessage(6, this));
                            } else {
                                Handler handler2 = this.connect.asInterface;
                                handler2.sendMessage(handler2.obtainMessage(4, this));
                            }
                            Thread.currentThread().setName("Picasso-Idle");
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            Thread.currentThread().setName(str2);
                            throw th;
                        }
                    } catch (OutOfMemoryError e2) {
                        try {
                            StringWriter stringWriter = new StringWriter();
                            FileOutputOptionsBuilder fileOutputOptionsBuilder = this.read;
                            str = "Picasso-Idle";
                            try {
                                outputFormatToVideoMime outputformattovideomime = new outputFormatToVideoMime(fileOutputOptionsBuilder.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), fileOutputOptionsBuilder.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), fileOutputOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fileOutputOptionsBuilder.f143a, fileOutputOptionsBuilder.g, fileOutputOptionsBuilder.notify, fileOutputOptionsBuilder.cancelAll, fileOutputOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3, fileOutputOptionsBuilder.TuitionPaymentFragmentbindingInflater1, fileOutputOptionsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1, fileOutputOptionsBuilder.d, fileOutputOptionsBuilder.asInterface, fileOutputOptionsBuilder.cancel, System.currentTimeMillis());
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                printWriter.println("===============BEGIN PICASSO STATS ===============");
                                printWriter.println("Memory Cache Stats");
                                printWriter.print("  Max Cache Size: ");
                                printWriter.println(outputformattovideomime.asInterface);
                                printWriter.print("  Cache Size: ");
                                printWriter.println(outputformattovideomime.d);
                                printWriter.print("  Cache % Full: ");
                                printWriter.println((int) Math.ceil((outputformattovideomime.d / outputformattovideomime.asInterface) * 100.0f));
                                printWriter.print("  Cache Hits: ");
                                printWriter.println(outputformattovideomime.b);
                                printWriter.print("  Cache Misses: ");
                                printWriter.println(outputformattovideomime.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                printWriter.println("Network Stats");
                                printWriter.print("  Download Count: ");
                                printWriter.println(outputformattovideomime.g);
                                printWriter.print("  Total Download Size: ");
                                printWriter.println(outputformattovideomime.asBinder);
                                printWriter.print("  Average Download Size: ");
                                printWriter.println(outputformattovideomime.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                printWriter.println("Bitmap Stats");
                                printWriter.print("  Total Bitmaps Decoded: ");
                                printWriter.println(outputformattovideomime.f1317a);
                                printWriter.print("  Total Bitmap Size: ");
                                printWriter.println(outputformattovideomime.cancelAll);
                                printWriter.print("  Total Transformed Bitmaps: ");
                                printWriter.println(outputformattovideomime.notify);
                                printWriter.print("  Total Transformed Bitmap Size: ");
                                printWriter.println(outputformattovideomime.cancel);
                                printWriter.print("  Average Bitmap Size: ");
                                printWriter.println(outputformattovideomime.TuitionPaymentFragmentbindingInflater1);
                                printWriter.print("  Average Transformed Bitmap Size: ");
                                printWriter.println(outputformattovideomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                printWriter.println("===============END PICASSO STATS ===============");
                                printWriter.flush();
                                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new RuntimeException(stringWriter.toString(), e2);
                                Handler handler3 = this.connect.asInterface;
                                handler3.sendMessage(handler3.obtainMessage(6, this));
                                Thread.currentThread().setName(str);
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str;
                                Thread.currentThread().setName(str2);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            Thread.currentThread().setName(str2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    str = "Picasso-Idle";
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = e3;
                    Handler handler4 = this.connect.asInterface;
                    handler4.sendMessageDelayed(handler4.obtainMessage(5, this), 500L);
                    Thread.currentThread().setName(str);
                }
            } catch (NetworkRequestHandler.ResponseException e4) {
                str = "Picasso-Idle";
                if (!NetworkPolicy.TuitionPaymentFragmentbindingInflater1(e4.networkPolicy) || e4.code != 504) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = e4;
                    int i6 = getItem + 27;
                    getSessionToken = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 3 % 3;
                    }
                }
                Handler handler5 = this.connect.asInterface;
                handler5.sendMessage(handler5.obtainMessage(6, this));
                Thread.currentThread().setName(str);
            } catch (Exception e5) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = e5;
                Handler handler6 = this.connect.asInterface;
                handler6.sendMessage(handler6.obtainMessage(6, this));
                str = "Picasso-Idle";
                Thread.currentThread().setName(str);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d3 A[Catch: all -> 0x0429, TRY_LEAVE, TryCatch #4 {all -> 0x0429, blocks: (B:195:0x03c7, B:197:0x03d3, B:87:0x01aa, B:95:0x02af, B:111:0x02ce, B:117:0x02e0, B:118:0x02e6, B:121:0x02ee, B:124:0x02fb, B:126:0x0300, B:128:0x0305, B:135:0x0325, B:153:0x0369, B:131:0x0317, B:133:0x031e, B:134:0x0321, B:138:0x0331, B:145:0x034e, B:141:0x0342, B:143:0x0347, B:144:0x034a, B:125:0x02fe, B:122:0x02f4, B:155:0x0372, B:158:0x037a, B:160:0x037f, B:162:0x0382, B:164:0x0387, B:174:0x0399, B:163:0x0385, B:159:0x037d, B:180:0x03a7, B:182:0x03ac, B:184:0x03af, B:186:0x03b4, B:193:0x03c0, B:185:0x03b2, B:181:0x03aa, B:88:0x021c), top: B:231:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:199:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:202:0x03e2 A[Catch: all -> 0x0427, TryCatch #2 {all -> 0x0427, blocks: (B:203:0x03ef, B:205:0x03f5, B:207:0x0403, B:200:0x03dc, B:202:0x03e2), top: B:227:0x03dc }] */
    private Bitmap TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws Throwable {
        Bitmap bitmapCreateBitmap;
        Matrix matrix;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        int i2;
        float f9;
        float f10;
        float f11;
        int iCeil;
        float f12;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Bitmap bitmap;
        if (MemoryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.asBinder)) {
            bitmapCreateBitmap = this.INotificationSideChannelDefault.TuitionPaymentFragmentbindingInflater1(this.g);
            if (bitmapCreateBitmap != null) {
                this.read.asBinder.sendEmptyMessage(0);
                this.asInterface = Picasso.LoadedFrom.MEMORY;
                if (this.d.d) {
                    outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Hunter", "decoded", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), "from cache");
                }
                return bitmapCreateBitmap;
            }
        } else {
            bitmapCreateBitmap = null;
        }
        int i13 = this.cancelAll == 0 ? NetworkPolicy.OFFLINE.index : this.f139a;
        this.f139a = i13;
        FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i13);
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
            this.asInterface = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            this.IconCompatParcelizer = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            bitmapCreateBitmap = TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            if (bitmapCreateBitmap == null) {
                tryToComplete trytocomplete = TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1;
                try {
                    FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(trytocomplete);
                    boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    boolean z = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.g;
                    BitmapFactory.Options optionsB = FileOutputOptions.b(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
                    boolean z2 = optionsB != null && optionsB.inJustDecodeBounds;
                    if (zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        byte[] bArrCancelAll = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll();
                        if (z2) {
                            BitmapFactory.decodeByteArray(bArrCancelAll, 0, bArrCancelAll.length, optionsB);
                            FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor, optionsB.outWidth, optionsB.outHeight, optionsB, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
                        }
                        bitmapCreateBitmap = BitmapFactory.decodeByteArray(bArrCancelAll, 0, bArrCancelAll.length, optionsB);
                    } else {
                        InputStream inputStreamA = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3.a();
                        if (z2) {
                            FallbackStrategy1 fallbackStrategy1 = new FallbackStrategy1(inputStreamA);
                            fallbackStrategy1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
                            long jTuitionPaymentFragmentspecialinlinedviewModeldefault2 = fallbackStrategy1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(1024);
                            BitmapFactory.decodeStream(fallbackStrategy1, null, optionsB);
                            FileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.RemoteActionCompatParcelizer, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.getInterfaceDescriptor, optionsB.outWidth, optionsB.outHeight, optionsB, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
                            fallbackStrategy1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(jTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            fallbackStrategy1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                            inputStreamA = fallbackStrategy1;
                        }
                        bitmapCreateBitmap = BitmapFactory.decodeStream(inputStreamA, null, optionsB);
                        if (bitmapCreateBitmap == null) {
                            throw new IOException("Failed to decode stream.");
                        }
                    }
                    try {
                        trytocomplete.close();
                    } catch (IOException unused) {
                    }
                } catch (Throwable th) {
                    try {
                        trytocomplete.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        }
        if (bitmapCreateBitmap != null) {
            if (this.d.d) {
                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Hunter", "decoded", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
            }
            FileOutputOptionsBuilder fileOutputOptionsBuilder = this.read;
            int iB = outputFormatToMuxerFormat.b(bitmapCreateBitmap);
            Handler handler = fileOutputOptionsBuilder.asBinder;
            handler.sendMessage(handler.obtainMessage(2, iB, 0));
            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder2.RemoteActionCompatParcelizer != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder2.getInterfaceDescriptor != 0 || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder2.INotificationSideChannel != 0.0f || fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder2.INotificationSideChannelStubProxy != null || this.IconCompatParcelizer != 0) {
                Object obj = INotificationSideChannelStub;
                synchronized (obj) {
                    try {
                        FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder3.RemoteActionCompatParcelizer == 0 && fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder3.getInterfaceDescriptor == 0 && fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder3.INotificationSideChannel == 0.0f && this.IconCompatParcelizer == 0) {
                            obj = obj;
                            this = this;
                        } else {
                            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                            int i14 = this.IconCompatParcelizer;
                            int width = bitmapCreateBitmap.getWidth();
                            int height = bitmapCreateBitmap.getHeight();
                            boolean z3 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.asInterface;
                            Matrix matrix2 = new Matrix();
                            try {
                                try {
                                    if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer == 0 && fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor == 0 && fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.INotificationSideChannel == 0.0f && i14 == 0) {
                                        bitmapCreateBitmap = bitmapCreateBitmap;
                                        obj = obj;
                                        i = height;
                                        matrix = matrix2;
                                    } else {
                                        int iFloor = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer;
                                        int iFloor2 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor;
                                        float f13 = fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.INotificationSideChannel;
                                        if (f13 != 0.0f) {
                                            double d = f13;
                                            try {
                                                double dCos = Math.cos(Math.toRadians(d));
                                                double dSin = Math.sin(Math.toRadians(d));
                                                if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                                    matrix2.setRotate(f13, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.onTransact, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.notify);
                                                    double d2 = 1.0d - dCos;
                                                    double d3 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.onTransact) * d2) + (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.notify) * dSin);
                                                    double d4 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.notify) * d2) - (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.onTransact) * dSin);
                                                    double d5 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dCos) + d3;
                                                    double d6 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dSin) + d4;
                                                    double d7 = ((((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dCos) + d3) - (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dSin);
                                                    double d8 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dSin) + d4 + (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dCos);
                                                    double d9 = d3 - (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dSin);
                                                    double d10 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dCos) + d4;
                                                    double dMax = Math.max(d9, Math.max(d7, Math.max(d3, d5)));
                                                    double dMin = Math.min(d9, Math.min(d7, Math.min(d3, d5)));
                                                    double dMax2 = Math.max(d10, Math.max(d8, Math.max(d4, d6)));
                                                    double dMin2 = Math.min(d10, Math.min(d8, Math.min(d4, d6)));
                                                    iFloor = (int) Math.floor(dMax - dMin);
                                                    iFloor2 = (int) Math.floor(dMax2 - dMin2);
                                                    matrix = matrix2;
                                                } else {
                                                    matrix = matrix2;
                                                    matrix.setRotate(f13);
                                                    double d11 = ((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dCos;
                                                    double d12 = ((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dSin;
                                                    double d13 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dCos) - (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dSin);
                                                    double d14 = (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.RemoteActionCompatParcelizer) * dSin) + (((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dCos);
                                                    double d15 = -(((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dSin);
                                                    double d16 = ((double) fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.getInterfaceDescriptor) * dCos;
                                                    double dMax3 = Math.max(d15, Math.max(d13, Math.max(0.0d, d11)));
                                                    double dMin3 = Math.min(d15, Math.min(d13, Math.min(0.0d, d11)));
                                                    double dMax4 = Math.max(d16, Math.max(d14, Math.max(0.0d, d12)));
                                                    double dMin4 = Math.min(d16, Math.min(d14, Math.min(0.0d, d12)));
                                                    iFloor = (int) Math.floor(dMax3 - dMin3);
                                                    iFloor2 = (int) Math.floor(dMax4 - dMin4);
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                obj = obj;
                                                throw th;
                                            }
                                        } else {
                                            matrix = matrix2;
                                        }
                                        if (i14 != 0) {
                                            switch (i14) {
                                                case 3:
                                                case 4:
                                                    i11 = 180;
                                                    break;
                                                case 5:
                                                case 6:
                                                    i11 = 90;
                                                    break;
                                                case 7:
                                                case 8:
                                                    i11 = 270;
                                                    break;
                                                default:
                                                    i11 = 0;
                                                    break;
                                            }
                                            int i15 = (i14 == 2 || i14 == 7 || i14 == 4 || i14 == 5) ? -1 : 1;
                                            if (i11 != 0) {
                                                matrix.preRotate(i11);
                                                if (i11 == 90 || i11 == 270) {
                                                    i12 = 1;
                                                    int i16 = iFloor2;
                                                    iFloor2 = iFloor;
                                                    iFloor = i16;
                                                } else {
                                                    i12 = 1;
                                                }
                                            } else {
                                                i12 = 1;
                                            }
                                            if (i15 != i12) {
                                                matrix.postScale(i15, 1.0f);
                                            }
                                        }
                                        if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                            if (iFloor != 0) {
                                                f9 = iFloor / width;
                                                i2 = height;
                                            } else {
                                                i2 = height;
                                                f9 = iFloor2 / i2;
                                            }
                                            if (iFloor2 != 0) {
                                                f10 = iFloor2;
                                                f11 = i2;
                                            } else {
                                                f10 = iFloor;
                                                f11 = width;
                                            }
                                            float f14 = f10 / f11;
                                            if (f9 > f14) {
                                                iCeil = (int) Math.ceil(i2 * (f14 / f9));
                                                if ((fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.b & 48) == 48) {
                                                    i5 = 0;
                                                } else {
                                                    i5 = (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.b & 80) == 80 ? i2 - iCeil : (i2 - iCeil) / 2;
                                                }
                                                f12 = iFloor2 / iCeil;
                                                i3 = width;
                                                i4 = 0;
                                            } else if (f9 < f14) {
                                                int iCeil2 = (int) Math.ceil(width * (f9 / f14));
                                                if ((fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.b & 3) == 3) {
                                                    i6 = 0;
                                                } else {
                                                    i6 = (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.b & 5) == 5 ? width - iCeil2 : (width - iCeil2) / 2;
                                                }
                                                f12 = f14;
                                                i5 = 0;
                                                i3 = iCeil2;
                                                f9 = iFloor / iCeil2;
                                                i4 = i6;
                                                iCeil = i2;
                                            } else {
                                                iCeil = i2;
                                                f9 = f14;
                                                f12 = f9;
                                                i3 = width;
                                                i4 = 0;
                                                i5 = 0;
                                            }
                                            if (!z3 || ((iFloor != 0 && width > iFloor) || (iFloor2 != 0 && i2 > iFloor2))) {
                                                matrix.preScale(f9, f12);
                                            }
                                            i7 = iCeil;
                                            i8 = i4;
                                            i9 = i3;
                                            i10 = i5;
                                        } else {
                                            i = height;
                                            if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                if (iFloor != 0) {
                                                    f5 = iFloor;
                                                    f6 = width;
                                                } else {
                                                    f5 = iFloor2;
                                                    f6 = i;
                                                }
                                                float f15 = f5 / f6;
                                                if (iFloor2 != 0) {
                                                    f7 = iFloor2;
                                                    f8 = i;
                                                } else {
                                                    f7 = iFloor;
                                                    f8 = width;
                                                }
                                                float f16 = f7 / f8;
                                                if (f15 >= f16) {
                                                    f15 = f16;
                                                }
                                                if (z3 == 0 || ((iFloor != 0 && width > iFloor) || (iFloor2 != 0 && i > iFloor2))) {
                                                    matrix.preScale(f15, f15);
                                                }
                                            } else if ((iFloor != 0 || iFloor2 != 0) && (iFloor != width || iFloor2 != i)) {
                                                if (iFloor != 0) {
                                                    f = iFloor;
                                                    f2 = width;
                                                } else {
                                                    f = iFloor2;
                                                    f2 = i;
                                                }
                                                float f17 = f / f2;
                                                if (iFloor2 != 0) {
                                                    f3 = iFloor2;
                                                    f4 = i;
                                                } else {
                                                    f3 = iFloor;
                                                    f4 = width;
                                                }
                                                float f18 = f3 / f4;
                                                if (z3 == 0 || ((iFloor != 0 && width > iFloor) || (iFloor2 != 0 && i > iFloor2))) {
                                                    matrix.preScale(f17, f18);
                                                }
                                            }
                                        }
                                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, i8, i10, i9, i7, matrix, true);
                                        bitmap = bitmapCreateBitmap;
                                        if (bitmapCreateBitmap != bitmap) {
                                            bitmap.recycle();
                                        } else {
                                            bitmapCreateBitmap = bitmap;
                                        }
                                        if (this.d.d) {
                                            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Hunter", "transformed", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
                                        }
                                    }
                                    if (this.d.d) {
                                        outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Hunter", "transformed", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b());
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    throw th;
                                }
                                i9 = width;
                                i8 = 0;
                                i10 = 0;
                                i7 = i;
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, i8, i10, i9, i7, matrix, true);
                                bitmap = bitmapCreateBitmap;
                                if (bitmapCreateBitmap != bitmap) {
                                    bitmap.recycle();
                                } else {
                                    bitmapCreateBitmap = bitmap;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelStubProxy != null) {
                            bitmapCreateBitmap = b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INotificationSideChannelStubProxy, bitmapCreateBitmap);
                            if (this.d.d) {
                                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Hunter", "transformed", this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(), "from custom transformations");
                            }
                        }
                        if (bitmapCreateBitmap == null) {
                            return bitmapCreateBitmap;
                        }
                        FileOutputOptionsBuilder fileOutputOptionsBuilder2 = this.read;
                        int iB2 = outputFormatToMuxerFormat.b(bitmapCreateBitmap);
                        Handler handler2 = fileOutputOptionsBuilder2.asBinder;
                        handler2.sendMessage(handler2.obtainMessage(3, iB2, 0));
                        return bitmapCreateBitmap;
                    } catch (Throwable th5) {
                        th = th5;
                        obj = obj;
                    }
                }
            }
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r9.isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r9.isEmpty() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Hunter", "joined", r2.b(), defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, "to "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(defpackage.findNearestHigherSupportedEncoderProfilesFor r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            com.squareup.picasso.Picasso r1 = r8.d
            boolean r1 = r1.d
            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder r2 = r9.d
            findNearestHigherSupportedEncoderProfilesFor r3 = r8.TuitionPaymentFragmentbindingInflater1
            java.lang.String r4 = "to "
            java.lang.String r5 = "joined"
            java.lang.String r6 = "Hunter"
            if (r3 != 0) goto L4d
            r8.TuitionPaymentFragmentbindingInflater1 = r9
            if (r1 == 0) goto L8f
            java.util.List<findNearestHigherSupportedEncoderProfilesFor> r9 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            if (r9 == 0) goto L43
            int r1 = defpackage.ExperimentalAudioApi.getItem
            int r1 = r1 + 65
            int r3 = r1 % 128
            defpackage.ExperimentalAudioApi.getSessionToken = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L31
            boolean r9 = r9.isEmpty()
            r0 = 76
            int r0 = r0 / 0
            if (r9 != 0) goto L43
            goto L37
        L31:
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L43
        L37:
            java.lang.String r9 = r2.b()
            java.lang.String r0 = defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, r4)
            defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6, r5, r9, r0)
            return
        L43:
            java.lang.String r9 = r2.b()
            java.lang.String r0 = "to empty hunter"
            defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6, r5, r9, r0)
            return
        L4d:
            java.util.List<findNearestHigherSupportedEncoderProfilesFor> r3 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            if (r3 != 0) goto L62
            java.util.ArrayList r3 = new java.util.ArrayList
            r7 = 3
            r3.<init>(r7)
            r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r3
            int r3 = defpackage.ExperimentalAudioApi.getSessionToken
            int r3 = r3 + 103
            int r7 = r3 % 128
            defpackage.ExperimentalAudioApi.getItem = r7
            int r3 = r3 % r0
        L62:
            java.util.List<findNearestHigherSupportedEncoderProfilesFor> r3 = r8.TuitionPaymentFragmentspecialinlinedviewModeldefault3
            r3.add(r9)
            if (r1 == 0) goto L74
            java.lang.String r1 = r2.b()
            java.lang.String r2 = defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r8, r4)
            defpackage.outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r6, r5, r1, r2)
        L74:
            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder r9 = r9.d
            com.squareup.picasso.Picasso$Priority r9 = r9.asBinder
            int r1 = r9.ordinal()
            com.squareup.picasso.Picasso$Priority r2 = r8.cancel
            int r2 = r2.ordinal()
            if (r1 <= r2) goto L8f
            int r1 = defpackage.ExperimentalAudioApi.getItem
            int r1 = r1 + 93
            int r2 = r1 % 128
            defpackage.ExperimentalAudioApi.getSessionToken = r2
            int r1 = r1 % r0
            r8.cancel = r9
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalAudioApi.TuitionPaymentFragmentspecialinlinedviewModeldefault1(findNearestHigherSupportedEncoderProfilesFor):void");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0069  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor) {
        boolean z;
        findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor2;
        int size;
        Picasso.Priority priority;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        Object obj = null;
        if (this.TuitionPaymentFragmentbindingInflater1 != findnearesthighersupportedencoderprofilesfor) {
            List<findNearestHigherSupportedEncoderProfilesFor> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list != null && list.remove(findnearesthighersupportedencoderprofilesfor)) {
            }
            if (this.d.d) {
                outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Hunter", "removed", findnearesthighersupportedencoderprofilesfor.d.b(), outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, "from "));
            }
        }
        this.TuitionPaymentFragmentbindingInflater1 = null;
        if (findnearesthighersupportedencoderprofilesfor.d.asBinder == this.cancel) {
            int i5 = getSessionToken + 59;
            getItem = i5 % 128;
            if (i5 % 2 != 0) {
                Picasso.Priority priority2 = Picasso.Priority.LOW;
                obj.hashCode();
                throw null;
            }
            Picasso.Priority priority3 = Picasso.Priority.LOW;
            List<findNearestHigherSupportedEncoderProfilesFor> list2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (list2 == null || list2.isEmpty()) {
                int i6 = getItem + 11;
                getSessionToken = i6 % 128;
                int i7 = i6 % 2;
            } else {
                int i8 = getSessionToken + 49;
                getItem = i8 % 128;
                if (i8 % 2 == 0) {
                    z = true;
                }
                findnearesthighersupportedencoderprofilesfor2 = this.TuitionPaymentFragmentbindingInflater1;
                if (findnearesthighersupportedencoderprofilesfor2 == null) {
                    i2 = getItem + 99;
                    i3 = i2 % 128;
                    getSessionToken = i3;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        if (findnearesthighersupportedencoderprofilesfor2 != null) {
                            i = getItem + 15;
                            getSessionToken = i % 128;
                            if (i % 2 != 0) {
                                Picasso.Priority priority4 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                                throw null;
                            }
                            priority3 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                        }
                        if (z) {
                            size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                            for (int i9 = 0; i9 < size; i9++) {
                                priority = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i9).d.asBinder;
                                if (priority.ordinal() > priority3.ordinal()) {
                                    int i10 = getItem + 101;
                                    getSessionToken = i10 % 128;
                                    int i11 = i10 % 2;
                                    priority3 = priority;
                                }
                            }
                        }
                    } else {
                        int i12 = i3 + 79;
                        getItem = i12 % 128;
                        int i13 = i12 % 2;
                    }
                } else {
                    if (findnearesthighersupportedencoderprofilesfor2 != null) {
                        i = getItem + 15;
                        getSessionToken = i % 128;
                        if (i % 2 != 0) {
                            Picasso.Priority priority5 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                            throw null;
                        }
                        priority3 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                    }
                    if (z) {
                        size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                        while (i9 < size) {
                            priority = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i9).d.asBinder;
                            if (priority.ordinal() > priority3.ordinal()) {
                                int i14 = getItem + 101;
                                getSessionToken = i14 % 128;
                                int i15 = i14 % 2;
                                priority3 = priority;
                            }
                        }
                    }
                }
                this.cancel = priority3;
            }
            z = false;
            findnearesthighersupportedencoderprofilesfor2 = this.TuitionPaymentFragmentbindingInflater1;
            if (findnearesthighersupportedencoderprofilesfor2 == null) {
                i2 = getItem + 99;
                i3 = i2 % 128;
                getSessionToken = i3;
                if (i2 % 2 != 0) {
                    throw null;
                }
                if (z) {
                    int i16 = i3 + 79;
                    getItem = i16 % 128;
                    int i17 = i16 % 2;
                } else {
                    if (findnearesthighersupportedencoderprofilesfor2 != null) {
                        i = getItem + 15;
                        getSessionToken = i % 128;
                        if (i % 2 != 0) {
                            Picasso.Priority priority6 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                            throw null;
                        }
                        priority3 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                    }
                    if (z) {
                        size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                        while (i9 < size) {
                            priority = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i9).d.asBinder;
                            if (priority.ordinal() > priority3.ordinal()) {
                                int i18 = getItem + 101;
                                getSessionToken = i18 % 128;
                                int i19 = i18 % 2;
                                priority3 = priority;
                            }
                        }
                    }
                }
            } else {
                if (findnearesthighersupportedencoderprofilesfor2 != null) {
                    i = getItem + 15;
                    getSessionToken = i % 128;
                    if (i % 2 != 0) {
                        Picasso.Priority priority7 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                        throw null;
                    }
                    priority3 = findnearesthighersupportedencoderprofilesfor2.d.asBinder;
                }
                if (z) {
                    size = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.size();
                    while (i9 < size) {
                        priority = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get(i9).d.asBinder;
                        if (priority.ordinal() > priority3.ordinal()) {
                            int i110 = getItem + 101;
                            getSessionToken = i110 % 128;
                            int i111 = i110 % 2;
                            priority3 = priority;
                        }
                    }
                }
            }
            this.cancel = priority3;
        }
        if (this.d.d) {
            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Hunter", "removed", findnearesthighersupportedencoderprofilesfor.d.b(), outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this, "from "));
        }
    }

    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        List<findNearestHigherSupportedEncoderProfilesFor> list;
        Future<?> future;
        int i = 2 % 2;
        int i2 = getSessionToken + 67;
        getItem = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.TuitionPaymentFragmentbindingInflater1 == null && (((list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null || list.isEmpty()) && (future = this.b) != null)) {
            int i3 = getItem + 47;
            getSessionToken = i3 % 128;
            if (i3 % 2 != 0 ? future.cancel(false) : future.cancel(true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    final boolean b() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 651;
            int iAlpha = 44 - Color.alpha(0);
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr2 = new Object[1];
            c(b, (byte) (b & 52), bArr[80], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c, iResolveOpacity, iAlpha, -459846511, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, 127 - (ViewConfiguration.getLongPressTimeout() >> 16), new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, View.getDefaultSize(0, 0) + 127, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1);
            int iIndexOf = 651 - TextUtils.indexOf("", "");
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43;
            int i3 = $$b;
            byte b2 = (byte) (i3 | 51);
            byte b3 = (byte) i3;
            Object[] objArr5 = new Object[1];
            c(b2, b3, b3, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iIndexOf, i2, -873460649, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i4 = getSessionToken + 69;
            getItem = i4 % 128;
            int i5 = i4 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char cResolveSize = (char) View.resolveSize(0, 0);
                int iAxisFromString = MotionEvent.axisFromString("") + 652;
                int packedPositionType = 44 - ExpandableListView.getPackedPositionType(0L);
                int i6 = $$b;
                Object[] objArr6 = new Object[1];
                c((byte) (i6 | 51), (byte) (i6 | 37), $$a[80], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cResolveSize, iAxisFromString, packedPositionType, -1595579076, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i7 = ((int[]) objArr7[2])[0];
            int i8 = ((int[]) objArr7[0])[0];
            int iIdentityHashCode = System.identityHashCode(this);
            int i9 = ~iIdentityHashCode;
            int i10 = (((278966433 + (((~((-159630097) | i9)) | 159383552) * (-108))) + (((~(i9 | 163060906)) | ((~((-163060907) | iIdentityHashCode)) | (-163307451))) * 54)) + ((iIdentityHashCode | (-163307451)) * 54)) - 105621853;
            int i11 = (i10 << 13) ^ i10;
            int i12 = i11 ^ (i11 >>> 17);
            ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ExpandableListView.getPackedPositionType(0L), 1610 - View.MeasureSpec.getMode(0), 27 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -105621853, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char cRed = (char) Color.red(0);
                    int jumpTapTimeout = 651 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int i13 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                    int i14 = $$b;
                    byte b4 = (byte) (i14 | 51);
                    byte b5 = (byte) i14;
                    Object[] objArr9 = new Object[1];
                    c(b4, b5, b5, objArr9);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRed, jumpTapTimeout, i13, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 694, ((byte) KeyEvent.getModifierMetaStateMask()) + 99), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.indexOf("", "") + 63406), 794 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 84 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr10 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int bitsPerPixel = 650 - ImageFormat.getBitsPerPixel(0);
                    int iArgb = 44 - Color.argb(0, 0, 0, 0);
                    int i15 = $$b;
                    Object[] objArr11 = new Object[1];
                    c((byte) (i15 | 51), (byte) (i15 | 37), $$a[80], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(doubleTapTimeout, bitsPerPixel, iArgb, -1595579076, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr10);
                try {
                    Object[] objArr12 = new Object[1];
                    e(null, null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr12);
                    Class<?> cls2 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(null, null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr13);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                        int iIndexOf2 = 650 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int scrollBarSize = 44 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int i16 = $$b;
                        byte b6 = (byte) (i16 | 51);
                        byte b7 = (byte) i16;
                        Object[] objArr14 = new Object[1];
                        c(b6, b7, b7, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cKeyCodeFromString, iIndexOf2, scrollBarSize, -873460649, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char c2 = (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 651;
                        int size = View.MeasureSpec.getSize(0) + 44;
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[5];
                        Object[] objArr15 = new Object[1];
                        c(b8, (byte) (b8 & 52), bArr2[80], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(c2, iNormalizeMetaState, size, -459846511, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                    objArr = objArr10;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 != i17) {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                int i19 = getSessionToken + 73;
                getItem = i19 % 128;
                int i20 = i19 % 2 == 0 ? 0 : 1;
                while (i20 < strArr.length) {
                    arrayList.add(strArr[i20]);
                    i20++;
                    int i21 = getSessionToken + 77;
                    getItem = i21 % 128;
                    int i22 = i21 % 2;
                }
            }
            throw new RuntimeException(String.valueOf(i18));
        }
        Object[] objArr16 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
        int i23 = ((int[]) objArr[3])[0];
        int i24 = ((int[]) objArr[2])[0];
        int i25 = ((int[]) objArr[0])[0];
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i26 = (-1272424567) + (((~((-675925618) | iIdentityHashCode2)) | 4753952 | (~(672494807 | iIdentityHashCode2))) * (-880));
        int i27 = (~((-675925618) | (~iIdentityHashCode2))) | (-672494808);
        int i28 = ~(iIdentityHashCode2 | 675925617);
        int i29 = i23 + i26 + ((i27 | i28) * (-880)) + (i28 * 880);
        int i30 = (i29 << 13) ^ i29;
        int i31 = i30 ^ (i30 >>> 17);
        ((int[]) objArr16[3])[0] = i31 ^ (i31 << 5);
        Future<?> future = this.b;
        if (future != null && future.isCancelled()) {
            int i32 = getSessionToken + 121;
            getItem = i32 % 128;
            int i33 = i32 % 2;
            return true;
        }
        int i34 = ((int[]) objArr16[3])[0];
        int i35 = i34 * i34;
        int i36 = -(1360893918 * i34);
        int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
        int i38 = -(i34 * 507510366);
        int i39 = (i37 & i38) + (i38 | i37);
        int i40 = ((i39 | (-1578068092)) << 1) - ((-1578068092) ^ i39);
        int i41 = ((i40 >> 26) + ComposerKt.defaultsKey) / 64;
        int i42 = (i41 ^ 1) + ((i41 & 1) << 1);
        int i43 = (i40 & i42) + (i42 | i40);
        int i44 = i40 >> 21;
        int i45 = ((i44 ^ (-4095)) + ((i44 & (-4095)) << 1)) / 2048;
        int i46 = -(i43 ^ (((i45 | 1) << 1) - (i45 ^ 1)));
        int i47 = (i46 & 6) + (i46 | 6);
        int i48 = i47 >> 15;
        return 0 / (((-(((((-262143) ^ i48) + ((i48 & (-262143)) << 1)) / 131072) + 2)) & i47) * 372);
    }

    static ExperimentalAudioApi TuitionPaymentFragmentspecialinlinedviewModeldefault1(Picasso picasso, lowerQualityThan lowerqualitythan, isQualitySupported isqualitysupported, FileOutputOptionsBuilder fileOutputOptionsBuilder, findNearestHigherSupportedEncoderProfilesFor findnearesthighersupportedencoderprofilesfor) {
        int i = 2 % 2;
        int i2 = getItem + 77;
        getSessionToken = i2 % 128;
        int i3 = i2 % 2;
        FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder = findnearesthighersupportedencoderprofilesfor.d;
        List<FileOutputOptions> list = picasso.asInterface;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            FileOutputOptions fileOutputOptions = list.get(i4);
            if (fileOutputOptions.TuitionPaymentFragmentspecialinlinedviewModeldefault3(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder)) {
                ExperimentalAudioApi experimentalAudioApi = new ExperimentalAudioApi(picasso, lowerqualitythan, isqualitysupported, fileOutputOptionsBuilder, findnearesthighersupportedencoderprofilesfor, fileOutputOptions);
                int i5 = getSessionToken + 123;
                getItem = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 16 / 0;
                }
                return experimentalAudioApi;
            }
        }
        return new ExperimentalAudioApi(picasso, lowerqualitythan, isqualitysupported, fileOutputOptionsBuilder, findnearesthighersupportedencoderprofilesfor, RemoteActionCompatParcelizer);
    }

    private static Bitmap b(List<outputFormatToAudioMime> list, Bitmap bitmap) {
        int size;
        int i;
        final outputFormatToAudioMime outputformattoaudiomime;
        int i2 = 2 % 2;
        int i3 = getSessionToken + 77;
        getItem = i3 % 128;
        if (i3 % 2 != 0) {
            size = list.size();
            i = 1;
        } else {
            size = list.size();
            i = 0;
        }
        while (i < size) {
            int i4 = getItem + 55;
            getSessionToken = i4 % 128;
            if (i4 % 2 == 0) {
                outputformattoaudiomime = list.get(i);
                outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                throw null;
            }
            outputformattoaudiomime = list.get(i);
            try {
                Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<outputFormatToAudioMime> it = list.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next().TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        sb.append('\n');
                    }
                    Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: ExperimentalAudioApi.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                }
                if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 == bitmap) {
                    int i5 = getSessionToken + 57;
                    getItem = i5 % 128;
                    if (i5 % 2 != 0) {
                        bitmap.isRecycled();
                        throw null;
                    }
                    if (bitmap.isRecycled()) {
                        Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: ExperimentalAudioApi.3
                            private static final byte[] $$c = {58, 66, -14, -31};
                            private static final int $$d = 165;
                            private static int $10 = 0;
                            private static int $11 = 1;
                            private static final byte[] $$a = {55, -64, 35, -71, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
                            private static final int $$b = 148;
                            private static int TuitionPaymentFragmentbindingInflater1 = 0;
                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -83722258;

                            /* JADX WARN: Code duplicated, block: B:10:0x002a  */
                            /* JADX WARN: Code duplicated, block: B:8:0x0022  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
                                /*
                                    int r8 = r8 * 52
                                    int r8 = 56 - r8
                                    int r7 = r7 * 14
                                    int r7 = 98 - r7
                                    int r0 = 53 - r6
                                    byte[] r1 = defpackage.ExperimentalAudioApi.AnonymousClass3.$$a
                                    byte[] r0 = new byte[r0]
                                    int r6 = 52 - r6
                                    r2 = 0
                                    if (r1 != 0) goto L17
                                    r3 = r6
                                    r7 = r8
                                    r4 = r2
                                    goto L2c
                                L17:
                                    r3 = r2
                                    r5 = r8
                                    r8 = r7
                                    r7 = r5
                                L1b:
                                    byte r4 = (byte) r8
                                    r0[r3] = r4
                                    int r4 = r3 + 1
                                    if (r3 != r6) goto L2a
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r0, r2)
                                    r9[r2] = r6
                                    return
                                L2a:
                                    r3 = r1[r7]
                                L2c:
                                    int r8 = r8 + r3
                                    int r7 = r7 + 1
                                    int r8 = r8 + (-11)
                                    r3 = r4
                                    goto L1b
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalAudioApi.AnonymousClass3.a(short, int, int, java.lang.Object[]):void");
                            }

                            private static void c(boolean z, int i6, int i7, int i8, char[] cArr, Object[] objArr) throws Throwable {
                                int i9 = 2 % 2;
                                setOrVerifyExpectFrameRateRange setorverifyexpectframeraterange = new setOrVerifyExpectFrameRateRange();
                                char[] cArr2 = new char[i7];
                                setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i7) {
                                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = cArr[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                    cArr2[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (i6 + setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                    int i10 = setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    try {
                                        Object[] objArr2 = {Integer.valueOf(cArr2[i10]), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1)};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1545221423);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            byte b = (byte) 0;
                                            byte b2 = b;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) KeyEvent.keyCodeFromString(""), 3291 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 32 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 1199271174, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE});
                                        }
                                        cArr2[i10] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                        Object[] objArr3 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            byte b3 = (byte) 0;
                                            byte b4 = (byte) (b3 + 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 651 - View.MeasureSpec.makeMeasureSpec(0, 0), 44 - TextUtils.indexOf("", "", 0), -450685997, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                if (i8 > 0) {
                                    int i11 = $11 + 21;
                                    $10 = i11 % 128;
                                    int i12 = i11 % 2;
                                    setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1 = i8;
                                    char[] cArr3 = new char[i7];
                                    System.arraycopy(cArr2, 0, cArr3, 0, i7);
                                    System.arraycopy(cArr3, 0, cArr2, i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                                    System.arraycopy(cArr3, setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1, cArr2, 0, i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentbindingInflater1);
                                    int i13 = $11 + 93;
                                    $10 = i13 % 128;
                                    int i14 = i13 % 2;
                                }
                                if (!(!z)) {
                                    char[] cArr4 = new char[i7];
                                    setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                    while (setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i7) {
                                        cArr4[setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[(i7 - setorverifyexpectframeraterange.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - 1];
                                        Object[] objArr4 = {setorverifyexpectframeraterange, setorverifyexpectframeraterange};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(29209604);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b5 = (byte) 0;
                                            byte b6 = (byte) (b5 + 1);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0') + 652, 44 - View.MeasureSpec.makeMeasureSpec(0, 0), -450685997, false, $$e(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                    }
                                    cArr2 = cArr4;
                                }
                                objArr[0] = new String(cArr2);
                            }

                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                char c;
                                Object[] objArr;
                                Object[] objArr2;
                                char c2;
                                int i6 = 2 % 2;
                                StringBuilder sb2 = new StringBuilder("Transformation ");
                                outputFormatToAudioMime outputformattoaudiomime2 = outputformattoaudiomime;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    char absoluteGravity = (char) Gravity.getAbsoluteGravity(0, 0);
                                    int capsMode = 651 - TextUtils.getCapsMode("", 0, 0);
                                    int gidForName = Process.getGidForName("") + 45;
                                    byte[] bArr = $$a;
                                    byte b = bArr[7];
                                    byte b2 = bArr[80];
                                    Object[] objArr3 = new Object[1];
                                    a(b, b2, b2, objArr3);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(absoluteGravity, capsMode, gidForName, -459846511, false, (String) objArr3[0], null);
                                }
                                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                                Object[] objArr4 = new Object[1];
                                c(true, 239 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, KeyEvent.normalizeMetaState(0) + 12, new char[]{65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22}, objArr4);
                                Class<?> cls = Class.forName((String) objArr4[0]);
                                Object[] objArr5 = new Object[1];
                                c(true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 243, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), TextUtils.indexOf("", "", 0, 0) + 13, new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr5);
                                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                                    int iGreen = 651 - Color.green(0);
                                    int i7 = 45 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                    byte b3 = $$a[7];
                                    Object[] objArr6 = new Object[1];
                                    a((byte) 52, b3, b3, objArr6);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, iGreen, i7, -873460649, false, (String) objArr6[0], null);
                                }
                                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 651;
                                        int iIndexOf = 44 - TextUtils.indexOf("", "", 0);
                                        byte[] bArr2 = $$a;
                                        Object[] objArr7 = new Object[1];
                                        a((byte) (bArr2[33] - 1), bArr2[80], bArr2[7], objArr7);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(scrollBarSize, jumpTapTimeout, iIndexOf, -1595579076, false, (String) objArr7[0], null);
                                    }
                                    Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                    int i8 = ((int[]) objArr8[2])[0];
                                    int i9 = ((int[]) objArr8[0])[0];
                                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                    int i10 = ((1821354007 + (((~elapsedCpuTime) | 16013978) * 1444)) + (((~(elapsedCpuTime | (-73990625))) | ((~(77421434 | elapsedCpuTime)) | 6291584)) * (-1444))) - 822226884;
                                    int i11 = (i10 << 13) ^ i10;
                                    int i12 = i11 ^ (i11 >>> 17);
                                    ((int[]) objArr[3])[0] = i12 ^ (i12 << 5);
                                    c = 2;
                                } else {
                                    try {
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 1658 - AndroidCharacter.getMirror('0'), 26 - TextUtils.getOffsetAfter("", 0), 2145681644, false, null, new Class[0]);
                                        }
                                        Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2145035934, 0};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                            int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 652;
                                            int keyRepeatDelay = 44 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                            byte b4 = $$a[7];
                                            Object[] objArr10 = new Object[1];
                                            a((byte) 52, b4, b4, objArr10);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(packedPositionGroup, iIndexOf2, keyRepeatDelay, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) View.MeasureSpec.getSize(0), 696 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 98 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (63406 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), Color.red(0) + 793, 83 - ExpandableListView.getPackedPositionGroup(0L)), Integer.TYPE, Integer.TYPE});
                                        }
                                        Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 1);
                                            int packedPositionChild = 650 - ExpandableListView.getPackedPositionChild(0L);
                                            int doubleTapTimeout = 44 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            byte[] bArr3 = $$a;
                                            Object[] objArr12 = new Object[1];
                                            a((byte) (bArr3[33] - 1), bArr3[80], bArr3[7], objArr12);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cLastIndexOf, packedPositionChild, doubleTapTimeout, -1595579076, false, (String) objArr12[0], null);
                                        }
                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                                        try {
                                            Object[] objArr13 = new Object[1];
                                            c(true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 239, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, (Process.myTid() >> 22) + 12, new char[]{65520, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22}, objArr13);
                                            Class<?> cls2 = Class.forName((String) objArr13[0]);
                                            Object[] objArr14 = new Object[1];
                                            c(true, (ViewConfiguration.getScrollBarSize() >> 8) + 243, 15 - KeyEvent.keyCodeFromString(""), 13 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), new char[]{2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534, 65534, 6}, objArr14);
                                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                            Long lValueOf = Long.valueOf(jLongValue2);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                int doubleTapTimeout2 = 651 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                int i13 = 44 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                byte b5 = $$a[7];
                                                Object[] objArr15 = new Object[1];
                                                a((byte) 52, b5, b5, objArr15);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(maximumDrawingCacheSize, doubleTapTimeout2, i13, -873460649, false, (String) objArr15[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                                char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                                                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 651;
                                                int i14 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 44;
                                                byte[] bArr4 = $$a;
                                                byte b6 = bArr4[7];
                                                byte b7 = bArr4[80];
                                                Object[] objArr16 = new Object[1];
                                                a(b6, b7, b7, objArr16);
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(threadPriority, offsetAfter, i14, -459846511, false, (String) objArr16[0], null);
                                            }
                                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                                            int i15 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 107;
                                            TuitionPaymentFragmentbindingInflater1 = i15 % 128;
                                            c = 2;
                                            int i16 = i15 % 2;
                                            objArr = objArr11;
                                        } catch (Exception unused) {
                                            throw new RuntimeException();
                                        }
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                int i17 = ((int[]) objArr[0])[0];
                                int i18 = ((int[]) objArr[c])[0];
                                if (i18 != i17) {
                                    ArrayList arrayList = new ArrayList();
                                    String[] strArr = (String[]) objArr[1];
                                    if (strArr != null) {
                                        int i19 = TuitionPaymentFragmentbindingInflater1 + 13;
                                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 % 128;
                                        int i20 = 2;
                                        int i21 = i19 % 2;
                                        int i22 = 0;
                                        while (i22 < strArr.length) {
                                            int i23 = TuitionPaymentFragmentbindingInflater1 + 29;
                                            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i23 % 128;
                                            if (i23 % i20 == 0) {
                                                arrayList.add(strArr[i22]);
                                                i22 += 79;
                                            } else {
                                                arrayList.add(strArr[i22]);
                                                i22++;
                                            }
                                            i20 = 2;
                                        }
                                    }
                                    Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
                                    objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                    int i24 = ((int[]) objArr[3])[0];
                                    int i25 = ((int[]) objArr[2])[0];
                                    int i26 = ((int[]) objArr[0])[0];
                                    int iMyPid = Process.myPid();
                                    int i27 = i24 + (-533276779) + (((~((-770217) | iMyPid)) | 4201026) * (-756)) + (((~iMyPid) | (-770217)) * 756);
                                    int i28 = (i27 << 13) ^ i27;
                                    int i29 = i28 ^ (i28 >>> 17);
                                    ((int[]) objArr2[3])[0] = i29 ^ (i29 << 5);
                                    int i30 = TuitionPaymentFragmentbindingInflater1 + 93;
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                                    int i31 = i30 % 2;
                                    c2 = 3;
                                } else {
                                    objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                                    int i32 = ((int[]) objArr[3])[0];
                                    int i33 = ((int[]) objArr[2])[0];
                                    int i34 = ((int[]) objArr[0])[0];
                                    int iIdentityHashCode = System.identityHashCode(this);
                                    int i35 = i32 + (((~((-681506553) | iIdentityHashCode)) | 671781976) * (-283)) + 1139168993 + ((~(iIdentityHashCode | (-9724577))) * 283);
                                    int i36 = (i35 << 13) ^ i35;
                                    int i37 = i36 ^ (i36 >>> 17);
                                    c2 = 3;
                                    ((int[]) objArr2[3])[0] = i37 ^ (i37 << 5);
                                }
                                sb2.append(outputformattoaudiomime2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                                int i38 = ((int[]) objArr2[c2])[0];
                                int i39 = ((i38 * i38) - (~(-(5707681 * i38)))) - 1;
                                int i40 = -(i38 * (-1386808293));
                                int i41 = (i39 & i40) + (i40 | i39);
                                int i42 = (i41 ^ (-1153082236)) + (((-1153082236) & i41) << 1);
                                int i43 = i42 >> 23;
                                int i44 = ((i43 & (-1023)) + (i43 | (-1023))) / 512;
                                int i45 = (i44 ^ 1) + ((i44 & 1) << 1);
                                int i46 = (i42 ^ i45) + ((i45 & i42) << 1);
                                int i47 = i42 >> 18;
                                int i48 = (-(i46 ^ (((((i47 | (-32767)) << 1) - (i47 ^ (-32767))) / 16384) + 1))) + 1;
                                int i49 = ((i48 >> 22) - 2047) / 1024;
                                sb2.append("16|23| returned input Bitmap but recycled it.".substring(8898 / ((i48 & (-(((i49 ^ 1) + ((i49 & 1) << 1)) + 1))) * 1483)));
                                throw new IllegalStateException(sb2.toString());
                            }

                            /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                            /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
                            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
                                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                                */
                            private static java.lang.String $$e(short r6, short r7, int r8) {
                                /*
                                    int r7 = 120 - r7
                                    int r8 = r8 * 4
                                    int r0 = 1 - r8
                                    int r6 = r6 * 3
                                    int r6 = r6 + 4
                                    byte[] r1 = defpackage.ExperimentalAudioApi.AnonymousClass3.$$c
                                    byte[] r0 = new byte[r0]
                                    r2 = 0
                                    int r8 = 0 - r8
                                    if (r1 != 0) goto L17
                                    r7 = r6
                                    r3 = r8
                                    r4 = r2
                                    goto L2c
                                L17:
                                    r3 = r2
                                L18:
                                    byte r4 = (byte) r7
                                    r0[r3] = r4
                                    if (r3 != r8) goto L23
                                    java.lang.String r6 = new java.lang.String
                                    r6.<init>(r0, r2)
                                    return r6
                                L23:
                                    r4 = r1[r6]
                                    int r3 = r3 + 1
                                    r5 = r7
                                    r7 = r6
                                    r6 = r4
                                    r4 = r3
                                    r3 = r5
                                L2c:
                                    int r6 = -r6
                                    int r6 = r6 + r3
                                    int r7 = r7 + 1
                                    r3 = r4
                                    r5 = r7
                                    r7 = r6
                                    r6 = r5
                                    goto L18
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalAudioApi.AnonymousClass3.$$e(short, short, int):java.lang.String");
                            }
                        });
                        return null;
                    }
                }
                if (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 != bitmap) {
                    int i6 = getItem + 103;
                    getSessionToken = i6 % 128;
                    int i7 = i6 % 2;
                    if (!bitmap.isRecycled()) {
                        Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: ExperimentalAudioApi.10
                            @Override // java.lang.Runnable
                            public final void run() {
                                StringBuilder sb2 = new StringBuilder("Transformation ");
                                sb2.append(outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                                sb2.append(" mutated input Bitmap but failed to recycle the original.");
                                throw new IllegalStateException(sb2.toString());
                            }
                        });
                        return null;
                    }
                }
                i++;
                bitmap = bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
            } catch (RuntimeException e2) {
                Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: ExperimentalAudioApi.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("Transformation ");
                        sb2.append(outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                        sb2.append(" crashed with exception.");
                        throw new RuntimeException(sb2.toString(), e2);
                    }
                });
                return null;
            }
            Picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3.post(new Runnable() { // from class: ExperimentalAudioApi.5
                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb2 = new StringBuilder("Transformation ");
                    sb2.append(outputformattoaudiomime.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
                    sb2.append(" crashed with exception.");
                    throw new RuntimeException(sb2.toString(), e2);
                }
            });
            return null;
        }
        return bitmap;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        write = new char[]{47444, 47431, 47441, 47427, 47430, 47436, 47367, 47426, 47394, 47484, 47425, 47440, 47432, 47410, 47433, 47442, 47434, 47429, 47395};
        MediaBrowserCompat = 2047719669;
        getNotifyChildrenChangedOptions = true;
        getExtras = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$e(byte r6, int r7, byte r8) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r0 = defpackage.ExperimentalAudioApi.$$c
            int r6 = 68 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L23:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ExperimentalAudioApi.$$e(byte, int, byte):java.lang.String");
    }
}
