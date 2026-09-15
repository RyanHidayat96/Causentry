package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.rtchagas.pingplacepicker.ui.PlacePickerActivity;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class CaptureRequestOptionsBuilder extends RequestOptions implements Cloneable {
    private static final byte[] $$c = {90, 46, 113, 8};
    private static final int $$f = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {83, -4, -55, -17, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$e = 64;
    private static int IconCompatParcelizer = 0;
    private static int connect = 1;
    private static char[] RemoteActionCompatParcelizer = {60049, 60054, 60034, 60040, 60083, 60057, 60088, 60043, 60055, 60073, 60041, 60056, 60072, 60062, 60058, 60051, 60052, 60060, 60045, 60117, 60048, 60063, 60047, 60053, 60050};
    private static char MediaBrowserCompat = 57188;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i6;
        int i14 = i2 + i6 + i4 + ((-700610695) * i3) + ((-1151578525) * i);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i2) + 1030029312 + ((-1366800679) * i6) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i3) + (367394816 * i) + (374145024 * i15);
        int i17 = ((i2 * 323709325) - 650539883) + (i6 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i3 * (-499299047)) + (i * 1568885315) + (i15 * (-395509760));
        int i18 = i16 + (i17 * i17 * (-772603904));
        if (i18 == 1) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr);
        }
        if (i18 == 2) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i18 == 3) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i18 == 4) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) objArr[0];
        int i19 = 2 % 2;
        int i20 = connect + 13;
        IconCompatParcelizer = i20 % 128;
        int i21 = i20 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder2 = (CaptureRequestOptionsBuilder) super.d();
        int i22 = IconCompatParcelizer + 31;
        connect = i22 % 128;
        int i23 = i22 % 2;
        return captureRequestOptionsBuilder2;
    }

    private static void c(short s, int i, short s2, Object[] objArr) {
        int i2 = 93 - s;
        byte[] bArr = $$d;
        int i3 = 84 - (s2 * 3);
        int i4 = i * 15;
        byte[] bArr2 = new byte[i4 + 38];
        int i5 = i4 + 37;
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = (i5 + i2) - 11;
            i2++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i3;
            int i9 = i2 + 1;
            i6 = i7;
            i3 = (i8 + bArr[i2]) - 11;
            i2 = i9;
        }
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) objArr[0];
        Drawable drawable = (Drawable) objArr[1];
        int i = 2 % 2;
        int i2 = connect + 21;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1(drawable);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) objArr[0];
        Resources.Theme theme = (Resources.Theme) objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder2 = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(theme);
        int i3 = connect + 9;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return captureRequestOptionsBuilder2;
        }
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) objArr[0];
        getCameraControl getcameracontrol = (getCameraControl) objArr[1];
        int i = 2 % 2;
        int i2 = connect + 87;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder2 = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getcameracontrol);
        int i4 = connect + 81;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return captureRequestOptionsBuilder2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) objArr[0];
        BaseRequestOptions<?> baseRequestOptions = (BaseRequestOptions) objArr[1];
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder2 = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(baseRequestOptions);
        int i4 = IconCompatParcelizer + 5;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder2;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1();
        }
        int i3 = 21 / 0;
        return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 111;
        connect = i3 % 128;
        if (i3 % 2 != 0) {
            return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1(i);
        }
        int i4 = 14 / 0;
        return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1(i);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(boolean z) {
        int i = 2 % 2;
        int i2 = connect + 101;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1(z);
        }
        int i3 = 25 / 0;
        return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentbindingInflater1(z);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = connect + 5;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        return (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Drawable drawable) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 49;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(drawable);
        int i4 = connect + 23;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 43 / 0;
        }
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Transformation transformation) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        connect = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1((Transformation<Bitmap>) transformation);
        int i3 = connect + 29;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return captureRequestOptionsBuilder;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z) {
        int i = 2 % 2;
        int i2 = connect + 105;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z);
        int i4 = IconCompatParcelizer + 69;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 11;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i4 = IconCompatParcelizer + 97;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return captureRequestOptionsBuilder;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
        int i2 = 2 % 2;
        int i3 = connect + 35;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
        int i4 = connect + 47;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return captureRequestOptionsBuilder;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = connect + 83;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i, i2);
        int i6 = IconCompatParcelizer + 113;
        connect = i6 % 128;
        int i7 = i6 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i = 2 % 2;
        int i2 = connect + 87;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        int i4 = connect + 39;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return captureRequestOptionsBuilder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(DownsampleStrategy downsampleStrategy) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 111;
        connect = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(downsampleStrategy);
        int i3 = IconCompatParcelizer + 19;
        connect = i3 % 128;
        if (i3 % 2 != 0) {
            return captureRequestOptionsBuilder;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(isMirroring ismirroring, Object obj) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 95;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ismirroring, obj);
        int i4 = connect + 115;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault3(Class cls) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 91;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3((Class<?>) cls);
        int i4 = connect + 123;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return captureRequestOptionsBuilder;
        }
        throw null;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions a() {
        int i = 2 % 2;
        int i2 = connect + 65;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.a();
        int i4 = IconCompatParcelizer + 17;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 60 / 0;
        }
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions asBinder() throws Throwable {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilderINotificationSideChannel;
        int i = 2 % 2;
        int i2 = connect + 77;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            captureRequestOptionsBuilderINotificationSideChannel = INotificationSideChannel();
            int i3 = 17 / 0;
        } else {
            captureRequestOptionsBuilderINotificationSideChannel = INotificationSideChannel();
        }
        int i4 = IconCompatParcelizer + 123;
        connect = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return captureRequestOptionsBuilderINotificationSideChannel;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions asInterface() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        connect = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.asInterface();
        int i3 = connect + 55;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions b() {
        int i = 2 % 2;
        int i2 = connect + 17;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.b();
        int i4 = IconCompatParcelizer + 103;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions b(CameraSelector cameraSelector) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.b(cameraSelector);
        int i4 = IconCompatParcelizer + 63;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions b(Priority priority) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 47;
        connect = i2 % 128;
        if (i2 % 2 != 0) {
            return (CaptureRequestOptionsBuilder) super.b(priority);
        }
        int i3 = 98 / 0;
        return (CaptureRequestOptionsBuilder) super.b(priority);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder;
        int i = 2 % 2;
        int i2 = connect + 9;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            int i3 = 63 / 0;
        } else {
            captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
        int i4 = IconCompatParcelizer + 27;
        connect = i4 % 128;
        int i5 = i4 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions g() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 85;
        connect = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.g();
        int i4 = IconCompatParcelizer + 7;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return captureRequestOptionsBuilder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int i3 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = RemoteActionCompatParcelizer;
        char c2 = '0';
        int i4 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", c2) + 1);
                        int iResolveSize = 2267 - View.resolveSize(0, 0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 33;
                        byte b2 = (byte) ($$f & 15);
                        byte b3 = (byte) (b2 - 3);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, iResolveSize, maximumDrawingCacheSize, -1927765101, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i5++;
                    c2 = '0';
                    i4 = 1770390596;
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
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        char c3 = '\b';
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0'));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 2267;
            int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 32;
            byte b4 = (byte) ($$f & 15);
            byte b5 = (byte) (b4 - 3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cLastIndexOf2, scrollBarSize, i6, -1927765101, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 39;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i9 = $11 + 47;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                    c = c3;
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = deinitsession;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = deinitsession;
                    objArr4[9] = deinitsession;
                    objArr4[c3] = Integer.valueOf(cCharValue);
                    objArr4[7] = deinitsession;
                    objArr4[6] = deinitsession;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = deinitsession;
                    objArr4[3] = deinitsession;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = deinitsession;
                    objArr4[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 49267);
                        int longPressTimeout = 3261 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        int keyRepeatDelay = 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte b6 = (byte) ($$f & 14);
                        byte b7 = (byte) (b6 - 2);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cNormalizeMetaState, longPressTimeout, keyRepeatDelay, -127612708, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue() == deinitsession.asBinder) {
                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = b8;
                            c = '\b';
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((KeyEvent.getMaxKeyCode() >> 16) + 22878), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 595, Drawable.resolveOpacity(0, 0) + 17, 1570859318, false, $$g(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = '\b';
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        int i10 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i10];
                    } else {
                        obj = null;
                        c = '\b';
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i11 = $10 + 29;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                        } else {
                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                obj2 = obj;
                c3 = c;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    public final CaptureRequestOptionsBuilder TuitionPaymentFragmentbindingInflater1(BaseRequestOptions<?> baseRequestOptions) {
        int i = 2 % 2;
        int i2 = connect + 31;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.TuitionPaymentFragmentspecialinlinedviewModeldefault1(baseRequestOptions);
        if (i3 != 0) {
            throw null;
        }
        int i4 = IconCompatParcelizer + 19;
        connect = i4 % 128;
        if (i4 % 2 != 0) {
            return captureRequestOptionsBuilder;
        }
        throw null;
    }

    private CaptureRequestOptionsBuilder INotificationSideChannel() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 63;
        connect = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 29944);
            int i4 = 1755 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
            int keyRepeatTimeout = 23 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b = (byte) ($$e | 25);
            byte b2 = $$d[7];
            Object[] objArr2 = new Object[1];
            c(b, b2, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(capsMode, i4, keyRepeatTimeout, 986134021, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{'\r', 24, 20, 11, 19, 21, 24, 16, 18, 1, 17, 14, 3, 4, 23, '\f', 6, 11, 6, 18, '\n', 21}, (byte) (ExpandableListView.getPackedPositionChild(0L) + 38), TextUtils.indexOf((CharSequence) "", '0', 0) + 23, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{18, '\r', '\f', '\t', '\b', 18, 24, 6, 14, '\n', 7, 23, 21, 4, 13858}, (byte) (34 - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 15, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29944);
            int mode = View.MeasureSpec.getMode(0) + 1755;
            int i5 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            byte[] bArr = $$d;
            Object[] objArr5 = new Object[1];
            c((byte) 52, bArr[28], bArr[7], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(maximumFlingVelocity, mode, i5, 1596667560, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i6 = connect + 35;
            IconCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) (29944 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int iLastIndexOf = 1754 - TextUtils.lastIndexOf("", '0');
                int edgeSlop = 23 - (ViewConfiguration.getEdgeSlop() >> 16);
                byte[] bArr2 = $$d;
                byte b3 = bArr2[7];
                Object[] objArr6 = new Object[1];
                c(b3, bArr2[28], b3, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, iLastIndexOf, edgeSlop, 1599039318, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[1], (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i8 = (-867347722) + (((~((-272633857) | iIdentityHashCode)) | (~((-60031431) | iIdentityHashCode))) * 69) + (((~(iIdentityHashCode | (-197102576))) | (~((-409705002) | iIdentityHashCode)) | 137071145) * (-69)) + 107898168;
            int i9 = (i8 << 13) ^ i8;
            int i10 = i9 ^ (i9 >>> 17);
            ((int[]) objArr[3])[0] = i10 ^ (i10 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{4, '\n', 19, '\r', 18, '\t', '\r', 24, 18, 15, 17, 7, 2, 23, 11, 3}, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 1), 16 - Drawable.resolveOpacity(0, 0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{20, 22, 18, 3, 23, 20, 2, 7, '\t', 19, 0, 18, 11, 21, 23, 11}, (byte) (37 - View.MeasureSpec.getMode(0)), KeyEvent.keyCodeFromString("") + 16, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            try {
                Object[] objArr10 = {457287286};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 1726 - View.MeasureSpec.makeMeasureSpec(0, 0), 29 - Gravity.getAbsoluteGravity(0, 0), -1637387971, false, null, new Class[]{Integer.TYPE});
                }
                Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da = DecorContentParent.TuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr10), -1840026392);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char c = (char) (29945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    int gidForName = Process.getGidForName("") + 1756;
                    int iAxisFromString = 22 - MotionEvent.axisFromString("");
                    byte[] bArr3 = $$d;
                    byte b4 = bArr3[7];
                    Object[] objArr11 = new Object[1];
                    c(b4, bArr3[28], b4, objArr11);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, gidForName, iAxisFromString, 1599039318, false, (String) objArr11[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da);
                try {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{'\r', 24, 20, 11, 19, 21, 24, 16, 18, 1, 17, 14, 3, 4, 23, '\f', 6, 11, 6, 18, '\n', 21}, (byte) (TextUtils.getCapsMode("", 0, 0) + 37), Color.green(0) + 22, objArr12);
                    Class<?> cls3 = Class.forName((String) objArr12[0]);
                    Object[] objArr13 = new Object[1];
                    e(new char[]{18, '\r', '\f', '\t', '\b', 18, 24, 6, 14, '\n', 7, 23, 21, 4, 13858}, (byte) (35 - (ViewConfiguration.getScrollBarSize() >> 8)), 15 - Color.red(0), objArr13);
                    long jLongValue2 = ((Long) cls3.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char tapTimeout = (char) (29944 - (ViewConfiguration.getTapTimeout() >> 16));
                        int iAlpha = Color.alpha(0) + 1755;
                        int mode2 = View.MeasureSpec.getMode(0) + 23;
                        byte[] bArr4 = $$d;
                        Object[] objArr14 = new Object[1];
                        c((byte) 52, bArr4[28], bArr4[7], objArr14);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(tapTimeout, iAlpha, mode2, 1596667560, false, (String) objArr14[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 29944);
                        int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int fadingEdgeLength2 = 23 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b5 = (byte) ($$e | 25);
                        byte b6 = $$d[7];
                        Object[] objArr15 = new Object[1];
                        c(b5, b6, b6, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, maximumDrawingCacheSize, fadingEdgeLength2, 986134021, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                    int i11 = connect + 35;
                    IconCompatParcelizer = i11 % 128;
                    int i12 = i11 % 2;
                    objArr = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault1$5f1425da;
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
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[3])[0];
            Object[] objArr16 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i15 + (-1563626731) + (((~(821864649 | iIdentityHashCode2)) | 1034467075) * (-366)) + (((~(iIdentityHashCode2 | 1039974347)) | 816357377) * 366);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr16[3])[0] = i18 ^ (i18 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[4];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i19 = i14 - 1;
            iArr[i19] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i19) % 2) - 1], 1).show();
            int i20 = ((int[]) objArr[3])[0];
            Object[] objArr17 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i21 = ~iUptimeMillis;
            int i22 = i20 + 1189776958 + (((~((-14073790) | i21)) | 198528636) * (-90)) + (((~((-14073790) | iUptimeMillis)) | (-198705150)) * (-45)) + (((~(iUptimeMillis | (-198528637))) | (-14073790) | (~(i21 | 198528636))) * 45);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr17[3])[0] = i24 ^ (i24 << 5);
        }
        CaptureRequestOptionsBuilder captureRequestOptionsBuilder = (CaptureRequestOptionsBuilder) super.asBinder();
        int i25 = connect + 43;
        IconCompatParcelizer = i25 % 128;
        int i26 = i25 % 2;
        return captureRequestOptionsBuilder;
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(BaseRequestOptions baseRequestOptions) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), 262202044, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, baseRequestOptions}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, -262202040);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentbindingInflater1(Drawable drawable) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -262655456, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, drawable}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 262655458);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions d() {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1539347756, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1539347756);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault2(getCameraControl getcameracontrol) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1791513249, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, getcameracontrol}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1791513252);
    }

    @Override // com.bumptech.glide.request.BaseRequestOptions
    public final /* bridge */ /* synthetic */ BaseRequestOptions TuitionPaymentFragmentspecialinlinedviewModeldefault1(Resources.Theme theme) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault2 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        return (BaseRequestOptions) TuitionPaymentFragmentspecialinlinedviewModeldefault3(PlacePickerActivity.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1263938780, iTuitionPaymentFragmentspecialinlinedviewModeldefault3, new Object[]{this, theme}, iTuitionPaymentFragmentspecialinlinedviewModeldefault2, iTuitionPaymentFragmentspecialinlinedviewModeldefault1, 1263938781);
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
    private static java.lang.String $$g(byte r5, byte r6, int r7) {
        /*
            byte[] r0 = defpackage.CaptureRequestOptionsBuilder.$$c
            int r5 = 116 - r5
            int r6 = r6 * 4
            int r1 = 1 - r6
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r5 = r5 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.CaptureRequestOptionsBuilder.$$g(byte, byte, int):java.lang.String");
    }
}
