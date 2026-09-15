package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.io.encoding.Base64;

/* JADX INFO: loaded from: classes3.dex */
public final class clearCaptureRequestOption<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
    private static final byte[] $$c = {68, 104, -93, -37};
    private static final int $$f = 117;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {27, -8, 5, 78, 12, 13, 0, 5, 13, -56, Base64.padSymbol, 20, 5, 8, 1, 6, 25, -3, 14, 7, 13, -61, 39, 28, 23, -17, 26, 19, -4, -28, 41, 9, 3, 28, -1, 16, -35, 44, 11, 4, 41, -4, 19, -3, 14, 7, -22, 25, 32, -4, 0, 17, 14, -38, 52, -9, 14, 14, 0, 17, 14, -10, 15, 13, -2, 13, 13, 1, -22, 45, 0, 14, -3, 27, -7, 21, -57};
    private static final int $$n = 182;
    private static final byte[] $$d = {58, -51, 54, -115, 23, -37, 42, 11, -10, 18, -7, 0, 7, 7, 23, -44, 44, 10, -5, 6, 18};
    private static final int $$e = 166;
    private static int write = 0;
    private static int read = 1;
    private static long RemoteActionCompatParcelizer = 4317022890152166772L;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i4 | i2);
        int i8 = i | i7;
        int i9 = (~(i2 | (~i))) | i4;
        int i10 = i4 + i + i3 + ((-1932811043) * i6) + (1521317780 * i5);
        int i11 = i10 * i10;
        int i12 = ((i4 * (-919556932)) - 154402816) + ((-919556932) * i) + ((-1121407813) * i7) + (i8 * 1121407813) + (1121407813 * i9) + (201850880 * i3) + ((-2098724864) * i6) + ((-1398800384) * i5) + ((-1444151296) * i11);
        int i13 = (i4 * 1794637580) + 2133191799 + (i * 1794637580) + (i7 * (-161)) + (i8 * 161) + (i9 * 161) + (i3 * 1794637741) + (i6 * (-1844343719)) + (i5 * (-1188939004)) + (i11 * (-394526720));
        switch (i12 + (i13 * i13 * 821297152)) {
            case 1:
                clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) objArr[0];
                Uri uri = (Uri) objArr[1];
                int i14 = 2 % 2;
                int i15 = write + 61;
                read = i15 % 128;
                int i16 = i15 % 2;
                clearCaptureRequestOption clearcapturerequestoption2 = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(uri);
                int i17 = read + 71;
                write = i17 % 128;
                int i18 = i17 % 2;
                return clearcapturerequestoption2;
            case 2:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
            case 3:
                clearCaptureRequestOption clearcapturerequestoption3 = (clearCaptureRequestOption) objArr[0];
                Drawable drawable = (Drawable) objArr[1];
                int i19 = 2 % 2;
                int i20 = write + 59;
                read = i20 % 128;
                int i21 = i20 % 2;
                clearCaptureRequestOption clearcapturerequestoption4 = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable);
                int i22 = write + 11;
                read = i22 % 128;
                int i23 = i22 % 2;
                return clearcapturerequestoption4;
            case 4:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
            case 5:
                return TuitionPaymentFragmentbindingInflater1(objArr);
            case 6:
                return b(objArr);
            default:
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r7 = r7 + 4
            int r8 = r8 * 3
            int r8 = r8 + 97
            int r0 = 11 - r6
            byte[] r1 = defpackage.clearCaptureRequestOption.$$d
            byte[] r0 = new byte[r0]
            int r6 = 10 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L17:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r1[r8]
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            int r8 = r8 + 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearCaptureRequestOption.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = defpackage.clearCaptureRequestOption.$$m
            int r1 = r6 + 37
            int r7 = r7 * 23
            int r7 = 107 - r7
            int r8 = r8 * 36
            int r8 = 40 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 36
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-8)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearCaptureRequestOption.f(int, int, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        clearCaptureRequestOption clearcapturerequestoption;
        clearCaptureRequestOption clearcapturerequestoption2 = (clearCaptureRequestOption) objArr[0];
        Transformation<Bitmap> transformation = (Transformation) objArr[1];
        int i = 2 % 2;
        int i2 = read + 63;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation);
            int i3 = 81 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(transformation);
        }
        int i4 = write + 83;
        read = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = write + 29;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            return (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        }
        clearCaptureRequestOption clearcapturerequestoption2 = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        int i3 = 63 / 0;
        return clearcapturerequestoption2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) objArr[0];
        int i = 2 % 2;
        int i2 = write + 25;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption2 = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1();
        int i3 = read + 45;
        write = i3 % 128;
        int i4 = i3 % 2;
        return clearcapturerequestoption2;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) objArr[0];
        int i = 2 % 2;
        int i2 = write + 125;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return (clearCaptureRequestOption) super.b();
    }

    private static /* synthetic */ Object b(Object[] objArr) {
        clearCaptureRequestOption clearcapturerequestoption;
        clearCaptureRequestOption clearcapturerequestoption2 = (clearCaptureRequestOption) objArr[0];
        Bitmap bitmap = (Bitmap) objArr[1];
        int i = 2 % 2;
        int i2 = read + 89;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
            int i3 = 31 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(bitmap);
        }
        int i4 = read + 77;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder INotificationSideChannel() {
        int i = 2 % 2;
        int i2 = read + 113;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.INotificationSideChannel();
        int i3 = read + 49;
        write = i3 % 128;
        int i4 = i3 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentbindingInflater1(Integer num) {
        int i = 2 % 2;
        int i2 = write + 115;
        read = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(num);
        int i4 = read + 93;
        write = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(int i) {
        int i2 = 2 % 2;
        int i3 = read + 7;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        return (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(i);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(Drawable drawable) {
        int i = 2 % 2;
        int i2 = write + 27;
        read = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(drawable);
        int i4 = read + 73;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(boolean z) {
        clearCaptureRequestOption clearcapturerequestoption;
        int i = 2 % 2;
        int i2 = write + 107;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(z);
            int i3 = 42 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentbindingInflater1(z);
        }
        int i4 = read + 63;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return clearcapturerequestoption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        int i = 2 % 2;
        int i2 = read + 11;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
        int i3 = read + 53;
        write = i3 % 128;
        int i4 = i3 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resources.Theme theme) {
        int i = 2 % 2;
        int i2 = write + 15;
        read = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(theme);
        int i4 = read + 57;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return clearcapturerequestoption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequestOptions baseRequestOptions) {
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.apply(baseRequestOptions);
        int i3 = write + 83;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 75 / 0;
        }
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
        int i4 = read + 123;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return clearcapturerequestoption;
        }
        throw null;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault2(getTargetCoordinateSystem gettargetcoordinatesystem) {
        clearCaptureRequestOption clearcapturerequestoption;
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(gettargetcoordinatesystem);
            int i3 = 70 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(gettargetcoordinatesystem);
        }
        int i4 = write + 29;
        read = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = read + 35;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = write + 9;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return clearcapturerequestoption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) throws Throwable {
        int i2 = 2 % 2;
        int i3 = read + 59;
        write = i3 % 128;
        int i4 = i3 % 2;
        clearCaptureRequestOption<TranscodeType> clearcapturerequestoptionTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
        int i5 = read + 97;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            return clearcapturerequestoptionTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = read + 123;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2);
        int i5 = write + 53;
        read = i5 % 128;
        int i6 = i5 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCameraControl getcameracontrol) {
        int i = 2 % 2;
        int i2 = read + 57;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getcameracontrol);
        int i4 = read + 19;
        write = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(File file) {
        int i = 2 % 2;
        int i2 = write + 121;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(file);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        clearCaptureRequestOption clearcapturerequestoption;
        int i = 2 % 2;
        int i2 = read + 79;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.INotificationSideChannel();
            int i3 = 21 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.INotificationSideChannel();
        }
        int i4 = write + 63;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 58 / 0;
        }
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(DownsampleStrategy downsampleStrategy) {
        int i = 2 % 2;
        int i2 = read + 25;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
        int i4 = write + 105;
        read = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(isMirroring ismirroring, Object obj) {
        int i = 2 % 2;
        int i2 = write + 11;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        return (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ismirroring, obj);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class cls) {
        clearCaptureRequestOption clearcapturerequestoption;
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class<?>) cls);
            int i3 = 43 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class<?>) cls);
        }
        int i4 = read + 9;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return clearcapturerequestoption;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions a() {
        int i = 2 % 2;
        int i2 = write + 29;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return (clearCaptureRequestOption) super.a();
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder apply(BaseRequestOptions baseRequestOptions) {
        int i = 2 % 2;
        int i2 = read + 95;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return (clearCaptureRequestOption) super.apply(baseRequestOptions);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions asInterface() {
        int i = 2 % 2;
        int i2 = read + 15;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.asInterface();
        int i4 = read + 93;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return clearcapturerequestoption;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder b(AutoValue_SurfaceOutput_Event autoValue_SurfaceOutput_Event) {
        int i = 2 % 2;
        int i2 = write + 55;
        read = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.b(autoValue_SurfaceOutput_Event);
        int i3 = read + 91;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            return clearcapturerequestoption;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions b(CameraSelector cameraSelector) {
        int i = 2 % 2;
        int i2 = read + 107;
        write = i2 % 128;
        int i3 = i2 % 2;
        clearCaptureRequestOption clearcapturerequestoption = (clearCaptureRequestOption) super.b(cameraSelector);
        int i4 = write + 117;
        read = i4 % 128;
        int i5 = i4 % 2;
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions b(Priority priority) {
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return (clearCaptureRequestOption) super.b(priority);
    }

    @Override // com.bumptech.glide.RequestBuilder, com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = 2 % 2;
        int i2 = write + 79;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        return (clearCaptureRequestOption) super.INotificationSideChannel();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions d() {
        clearCaptureRequestOption clearcapturerequestoption;
        int i = 2 % 2;
        int i2 = read + 79;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            clearcapturerequestoption = (clearCaptureRequestOption) super.d();
            int i3 = 13 / 0;
        } else {
            clearcapturerequestoption = (clearCaptureRequestOption) super.d();
        }
        int i4 = write + 91;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 50 / 0;
        }
        return clearcapturerequestoption;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions g() {
        int i = 2 % 2;
        int i2 = read + 65;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            return (clearCaptureRequestOption) super.g();
        }
        int i3 = 37 / 0;
        return (clearCaptureRequestOption) super.g();
    }

    clearCaptureRequestOption(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        super(glide, requestManager, cls, context);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(RemoteActionCompatParcelizer ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i3 = $11 + 119;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i5 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 64838), 1355 - ((byte) KeyEvent.getModifierMetaStateMask()), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, 894276454, false, $$i(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {abortcapture, abortcapture};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (47773 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 467, (ViewConfiguration.getTouchSlop() >> 8) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    int i6 = $11 + 73;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    private clearCaptureRequestOption<TranscodeType> TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) throws Throwable {
        Object[] objArr;
        int i2 = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
            int i3 = 876 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
            int threadPriority = 10 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b = $$d[11];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(fadingEdgeLength, i3, threadPriority, -1199417970, false, (String) objArr2[0], null);
        }
        Object obj = null;
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{5866, 5771, 60212, 4982, 1096, 29086, 52534, 48346, 43725, 16391, 35198, 63694, 28181, 36069, 17900, 13323, 8779, 51373, 510, 29685, 59303, 2885, 56414, 53159, 48097, 30501}, Gravity.getAbsoluteGravity(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{489, 396, 49611, 14936, 11957, 19217, 58397, 34391, 48594, 27380, 41040, 49725, 31004, 42504, 27776, 3747, 13656, 57932, 10433}, TextUtils.getTrimmedLength(""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
            int iIndexOf = 876 - TextUtils.indexOf("", "", 0, 0);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 10;
            byte[] bArr = $$d;
            byte b3 = bArr[17];
            byte b4 = (byte) (bArr[11] + 1);
            Object[] objArr5 = new Object[1];
            c(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, iIndexOf, iCombineMeasuredStates, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 876;
                int keyRepeatTimeout2 = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 10;
                byte b5 = (byte) 3;
                Object[] objArr6 = new Object[1];
                c(b5, (byte) (b5 - 2), $$d[11], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(bitsPerPixel, keyRepeatTimeout, keyRepeatTimeout2, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = (-1330997676) + (((-134747659) | (~iIdentityHashCode)) * (-490)) + (((~(iIdentityHashCode | 631455925)) | (-766203584)) * 490) + 1961803729;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            int i7 = read + 61;
            write = i7 % 128;
            int i8 = i7 % 2;
        } else {
            try {
                Object[] objArr8 = {Integer.valueOf(i), 414737887};
                byte[] bArr2 = $$m;
                byte b6 = bArr2[6];
                Object[] objArr9 = new Object[1];
                f(b6, b6, bArr2[14], objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[0]);
                byte b7 = bArr2[14];
                byte b8 = bArr2[6];
                Object[] objArr10 = new Object[1];
                f(b7, b7, b8, objArr10);
                objArr = (Object[]) cls2.getMethod((String) objArr10[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr8);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                    int windowTouchSlop = 876 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                    int iArgb = 10 - Color.argb(0, 0, 0, 0);
                    byte b9 = (byte) 3;
                    Object[] objArr11 = new Object[1];
                    c(b9, (byte) (b9 - 2), $$d[11], objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveOpacity, windowTouchSlop, iArgb, 1324201839, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{5866, 5771, 60212, 4982, 1096, 29086, 52534, 48346, 43725, 16391, 35198, 63694, 28181, 36069, 17900, 13323, 8779, 51373, 510, 29685, 59303, 2885, 56414, 53159, 48097, 30501}, 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{489, 396, 49611, 14936, 11957, 19217, 58397, 34391, 48594, 27380, 41040, 49725, 31004, 42504, 27776, 3747, 13656, 57932, 10433}, ViewConfiguration.getTouchSlop() >> 8, objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                        int i9 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 875;
                        int iArgb2 = 10 - Color.argb(0, 0, 0, 0);
                        byte[] bArr3 = $$d;
                        byte b10 = bArr3[17];
                        byte b11 = (byte) (bArr3[11] + 1);
                        Object[] objArr14 = new Object[1];
                        c(b10, b11, b11, objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(edgeSlop, i9, iArgb2, 254769921, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                        int i10 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 875;
                        int iRed = 10 - Color.red(0);
                        byte b12 = $$d[11];
                        byte b13 = b12;
                        Object[] objArr15 = new Object[1];
                        c(b12, b13, b13, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRgb, i10, iRed, -1199417970, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[2])[0];
        int i12 = ((int[]) objArr[0])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i14 = ~elapsedCpuTime;
            int i15 = i13 + 1717045686 + ((~(860314048 | i14)) * 979) + ((elapsedCpuTime | 900624277) * (-979)) + (((~(elapsedCpuTime | 860314048)) | (~(i14 | 900624277))) * 979);
            int i16 = (i15 << 13) ^ i15;
            int i17 = i16 ^ (i16 >>> 17);
            ((int[]) objArr16[1])[0] = i17 ^ (i17 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i12 / (((i12 - 1) * i12) % 2), 0).show();
            int i18 = ((int[]) objArr[1])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int i19 = ~System.identityHashCode(this);
            int i20 = i18 + (((736268384 + (((~((-621271097) | i19)) | 580960867) * (-933))) + (((~(i19 | 580960867)) | (-665311868)) * 933)) - 1859633617);
            int i21 = (i20 << 13) ^ i20;
            int i22 = i21 ^ (i21 >>> 17);
            ((int[]) objArr17[1])[0] = i22 ^ (i22 << 5);
        }
        clearCaptureRequestOption<TranscodeType> clearcapturerequestoption = (clearCaptureRequestOption) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        int i23 = read + 103;
        write = i23 % 128;
        if (i23 % 2 == 0) {
            return clearcapturerequestoption;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1() {
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1167400319, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1167400319, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions b() {
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1245922361, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1245922359, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1(Bitmap bitmap) {
        return (RequestBuilder) TuitionPaymentFragmentspecialinlinedviewModeldefault3(140152751, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, bitmap}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -140152745, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* synthetic */ RequestBuilder TuitionPaymentFragmentbindingInflater1(Uri uri) {
        return (RequestBuilder) TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145140621, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, uri}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 1145140622, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.RequestBuilder
    public final /* bridge */ /* synthetic */ RequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        return (RequestBuilder) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1799017189, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, str}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1799017185, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) {
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(1000506012, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, drawable}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1000506009, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Transformation transformation) {
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(286346683, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new Object[]{this, transformation}, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -286346678, onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), onCameraAvailable.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$i(short r5, int r6, int r7) {
        /*
            int r5 = r5 + 4
            byte[] r0 = defpackage.clearCaptureRequestOption.$$c
            int r7 = r7 * 2
            int r7 = r7 + 107
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clearCaptureRequestOption.$$i(short, int, int):java.lang.String");
    }
}
