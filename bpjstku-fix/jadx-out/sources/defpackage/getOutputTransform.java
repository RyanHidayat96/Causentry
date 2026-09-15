package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b3\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\fJ#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u0014\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\"J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H%¢\u0006\u0004\b\u0014\u0010#J\u0017\u0010$\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010\u000f\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b2\u00103J\u0017\u0010\u000b\u001a\u0002042\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000b\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u0004\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u0004\u001a\u00020\u0016H\u0017¢\u0006\u0004\b:\u0010;R\u001a\u0010\u000b\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b7\u0010=R\u001a\u00107\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b/\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b$\u0010?\u001a\u0004\b\r\u0010@R\u0014\u0010\u000f\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010$\u001a\u00020D8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010E\u0082\u0001\u0003FGH"}, d2 = {"LgetOutputTransform;", "LsetImageCaptureTargetSize;", "LcreateTransformedBitmap;", "LPreviewStreamStateObserver2;", "p0", "LisTransformationInfoReady;", "p1", "", "p2", "<init>", "(LPreviewStreamStateObserver2;LisTransformationInfoReady;Ljava/lang/String;)V", "b", "()LisTransformationInfoReady;", "asBinder", "(Ljava/lang/String;)Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", ExifInterface.GPS_DIRECTION_TRUE, "LisBitDepthMatched;", "decodeSerializableValue", "(LisBitDepthMatched;)Ljava/lang/Object;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LcreateImageAnalysis;", "LsetActiveRecording;", "beginStructure", "(LcreateImageAnalysis;)LsetActiveRecording;", "", "endStructure", "(LcreateImageAnalysis;)V", "", "decodeNotNullMark", "()Z", "LshouldReuseImplementation;", "", "(LshouldReuseImplementation;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "(Ljava/lang/String;)LisTransformationInfoReady;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;)Z", "", "(Ljava/lang/String;)B", "", "a", "(Ljava/lang/String;)S", "", "d", "(Ljava/lang/String;)I", "", "g", "(Ljava/lang/String;)J", "", "asInterface", "(Ljava/lang/String;)F", "", "(Ljava/lang/String;)D", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/String;)C", "LstopListeningToRotationEvents;", "decodeInline", "(LcreateImageAnalysis;)LstopListeningToRotationEvents;", "LPreviewStreamStateObserver2;", "()LPreviewStreamStateObserver2;", "LisTransformationInfoReady;", "Ljava/lang/String;", "()Ljava/lang/String;", "LPreviewViewImplementationOnSurfaceNotInUseListener;", "getSerializersModule", "()LPreviewViewImplementationOnSurfaceNotInUseListener;", "LgetRemainingRotationDegrees;", "LgetRemainingRotationDegrees;", "LlambdaonSurfaceRequested0androidxcameraviewPreviewView1;", "LonSurfaceNotInUse;", "LPreviewView1ExternalSyntheticBackportWithForwarding0;"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class getOutputTransform extends setImageCaptureTargetSize implements createTransformedBitmap {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final PreviewStreamStateObserver2 b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    protected final getRemainingRotationDegrees TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final byte[] $$l = {101, 89, 94, -73};
    private static final int $$m = 70;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {115, 25, -47, -94, -34, -13, -3, -4, -23, 20, -30, -20, 3, -6, -13, -43, 2, -21, 1, -16, -9, 20, -27, -34, 2, -2, -19, -16, 36, -54, 7, -16, -16, -2, -19, -16, 8, -17, -15, 0, -15, -15, -3, 20, -47, -2, -16, 1, -29, 5, -23, 55};
    private static final int $$k = 223;
    private static final byte[] $$d = {68, 83, 49, -116, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$e = 249;
    private static int asInterface = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f962a = 1;
    private static long g = -587356670872519028L;

    public static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = i4 | i5 | i7;
        int i9 = ~i4;
        int i10 = (~i5) | i7;
        int i11 = (~i10) | i9;
        int i12 = (~(i5 | i7 | i9)) | (~(i10 | i4));
        int i13 = i + i4 + i3 + (2053704882 * i2) + ((-167119771) * i6);
        int i14 = i13 * i13;
        int i15 = (((-385660469) * i) - 1543503872) + (1501345335 * i4) + (1203980746 * i8) + (i11 * (-1203980746)) + ((-1203980746) * i12) + ((-1589641216) * i3) + (511705088 * i2) + ((-1639972864) * i6) + (1278279680 * i14);
        int i16 = ((i * (-1228230693)) - 288632672) + (i4 * (-1228230521)) + (i8 * (-86)) + (i11 * 86) + (i12 * 86) + (i3 * (-1228230607)) + (i2 * 927583762) + (i6 * (-1784727723)) + (i14 * 1163984896);
        int i17 = i15 + (i16 * i16 * 992935936);
        if (i17 == 1) {
            return TuitionPaymentFragmentbindingInflater1(objArr);
        }
        if (i17 == 2) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2(objArr);
        }
        if (i17 != 3) {
            return i17 != 4 ? TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr) : b(objArr);
        }
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 84
            int r8 = r8 * 52
            int r8 = 107 - r8
            byte[] r0 = defpackage.getOutputTransform.$$d
            int r7 = r7 * 15
            int r7 = 53 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            int r8 = r8 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-11)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOutputTransform.h(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void j(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 87 - r9
            int r7 = r7 * 26
            int r7 = r7 + 12
            int r8 = r8 + 4
            byte[] r0 = defpackage.getOutputTransform.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r9 = r8
            r5 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-10)
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOutputTransform.j(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    protected abstract isTransformationInfoReady TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0);

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getOutputTransform(PreviewStreamStateObserver2 previewStreamStateObserver2, isTransformationInfoReady istransformationinfoready, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if ((i & 4) != 0) {
            int i2 = asInterface;
            int i3 = i2 + 55;
            f962a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 89;
            f962a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str = null;
        }
        this(previewStreamStateObserver2, istransformationinfoready, str, defaultConstructorMarker2);
    }

    private static /* synthetic */ Object TuitionPaymentFragmentbindingInflater1(Object[] objArr) {
        getOutputTransform getoutputtransform = (getOutputTransform) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 75;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        long jG2 = getoutputtransform.g2((String) obj);
        int i4 = f962a + 107;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return Long.valueOf(jG2);
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object[] objArr) {
        getOutputTransform getoutputtransform = (getOutputTransform) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 7;
        f962a = i2 % 128;
        String str = (String) obj;
        if (i2 % 2 == 0) {
            getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault22(str);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault22 = getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault22(str);
        int i3 = asInterface + 99;
        f962a = i3 % 128;
        int i4 = i3 % 2;
        return Boolean.valueOf(zTuitionPaymentFragmentspecialinlinedviewModeldefault22);
    }

    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ byte TuitionPaymentFragmentbindingInflater1(String str) {
        int i = 2 % 2;
        int i2 = f962a + 105;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        byte bTuitionPaymentFragmentbindingInflater12 = TuitionPaymentFragmentbindingInflater12(str);
        int i4 = asInterface + 101;
        f962a = i4 % 128;
        if (i4 % 2 != 0) {
            return bTuitionPaymentFragmentbindingInflater12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ char TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        int i = 2 % 2;
        int i2 = f962a + 41;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        char cTuitionPaymentFragmentspecialinlinedviewModeldefault12 = TuitionPaymentFragmentspecialinlinedviewModeldefault12(str);
        int i4 = asInterface + 69;
        f962a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 64 / 0;
        }
        return cTuitionPaymentFragmentspecialinlinedviewModeldefault12;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ float TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 123;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {this, str};
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB3 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        int iB4 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        if (i3 != 0) {
            return ((Float) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -1641493276, iB3, iB2, 1641493278, iB, iB4)).floatValue();
        }
        ((Float) TuitionPaymentFragmentspecialinlinedviewModeldefault1(objArr, -1641493276, iB3, iB2, 1641493278, iB, iB4)).floatValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ stopListeningToRotationEvents TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        if (!onFrameUpdate.TuitionPaymentFragmentspecialinlinedviewModeldefault1(createimageanalysis)) {
            stopListeningToRotationEvents stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = super.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str2, createimageanalysis);
            int i2 = f962a + 37;
            asInterface = i2 % 128;
            if (i2 % 2 == 0) {
                return stoplisteningtorotationeventsTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PreviewStreamStateObserver2 previewStreamStateObserver2 = this.b;
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2);
        String iNotificationSideChannel = createimageanalysis.getINotificationSideChannel();
        if (istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation) {
            PreviewViewExternalSyntheticLambda1 previewViewExternalSyntheticLambda1 = new PreviewViewExternalSyntheticLambda1(PreviewViewOnFrameUpdateListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2(previewStreamStateObserver2, ((shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3).getB()), this.b);
            int i3 = asInterface + 61;
            f962a = i3 % 128;
            int i4 = i3 % 2;
            return previewViewExternalSyntheticLambda1;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
        sb.append(", but had ");
        sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(iNotificationSideChannel);
        sb.append(" at element: ");
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ double TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        f962a = i2 % 128;
        String str2 = str;
        if (i2 % 2 != 0) {
            return b2(str2);
        }
        int i3 = 2 / 0;
        return b2(str2);
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ boolean asInterface(String str) {
        int i = 2 % 2;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "");
        if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2) != PreviewView.INSTANCE) {
            int i2 = f962a + 117;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f962a + 35;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ short d(String str) {
        int i = 2 % 2;
        int i2 = f962a + 57;
        asInterface = i2 % 128;
        String str2 = str;
        if (i2 % 2 != 0) {
            int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
            ((Short) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1925216822, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1925216826, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).shortValue();
            throw null;
        }
        int iB2 = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        short sShortValue = ((Short) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1925216822, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1925216826, iB2, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).shortValue();
        int i3 = asInterface + 59;
        f962a = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 9 / 0;
        }
        return sShortValue;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ int g(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 125;
        f962a = i2 % 128;
        String str2 = str;
        if (i2 % 2 != 0) {
            return d2(str2);
        }
        d2(str2);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.createTransformedBitmap
    public final PreviewStreamStateObserver2 TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = 2 % 2;
        int i2 = f962a + 39;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        PreviewStreamStateObserver2 previewStreamStateObserver2 = this.b;
        int i5 = i3 + 31;
        f962a = i5 % 128;
        int i6 = i5 % 2;
        return previewStreamStateObserver2;
    }

    /* JADX INFO: renamed from: g */
    public isTransformationInfoReady getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 85;
        f962a = i3 % 128;
        int i4 = i3 % 2;
        isTransformationInfoReady istransformationinfoready = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i5 = i2 + 23;
        f962a = i5 % 128;
        int i6 = i5 % 2;
        return istransformationinfoready;
    }

    protected final String asBinder() {
        int i = 2 % 2;
        int i2 = f962a + 41;
        int i3 = i2 % 128;
        asInterface = i3;
        int i4 = i2 % 2;
        String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i5 = i3 + 59;
        f962a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    private getOutputTransform(PreviewStreamStateObserver2 previewStreamStateObserver2, isTransformationInfoReady istransformationinfoready, String str) {
        this.b = previewStreamStateObserver2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = istransformationinfoready;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = previewStreamStateObserver2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    private static void i(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(g ^ (-2687588926731523482L), cArr, i);
        int i3 = 4;
        abortcapture.b = 4;
        while (abortcapture.b < cArrB.length) {
            int i4 = $10 + 89;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - i3;
            int i6 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % i3]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(g)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64886 - AndroidCharacter.getMirror('0')), Color.argb(0, 0, 0, 0) + 1356, 37 - TextUtils.indexOf((CharSequence) "", '0', 0), 894276454, false, $$n(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i6] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 47773), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 468, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                int i7 = $11 + 13;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i3 = 4;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
        int i9 = $11 + 117;
        $10 = i9 % 128;
        if (i9 % 2 != 0) {
            throw null;
        }
    }

    @Override // defpackage.ForwardingLiveData, defpackage.setActiveRecording
    public PreviewViewImplementationOnSurfaceNotInUseListener getSerializersModule() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asInterface + 15;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
            int minimumFlingVelocity = 2267 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int iBlue = Color.blue(0) + 33;
            byte[] bArr = $$d;
            byte b = bArr[7];
            Object[] objArr2 = new Object[1];
            h(b, bArr[40], b, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(threadPriority, minimumFlingVelocity, iBlue, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        i(new char[]{30442, 30347, 50621, 53561, 62602, 56634, 29500, 9517, 19952, 44358, 35218, 57272, 53717, 31220, 9600, 43949, 35947, 51756, 53298, 29731, 14375, 42612, 35986, 49345, 54465, 29412}, ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        i(new char[]{58339, 58246, 22932, 19730, 30961, 20804, 39622, 45112, 41992, 12643, 1513, 13884, 17622, 58831, 43449, 17010, 6514, 22043, 23640}, ((byte) KeyEvent.getModifierMetaStateMask()) + 1, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char defaultSize = (char) View.getDefaultSize(0, 0);
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 2267;
            int maxKeyCode = 33 - (KeyEvent.getMaxKeyCode() >> 16);
            byte[] bArr2 = $$d;
            byte b2 = bArr2[7];
            Object[] objArr5 = new Object[1];
            h(b2, bArr2[5], b2, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(defaultSize, offsetBefore, maxKeyCode, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int i4 = 2267 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                int iIndexOf = 32 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                byte[] bArr3 = $$d;
                byte b3 = bArr3[5];
                byte b4 = bArr3[7];
                Object[] objArr6 = new Object[1];
                h(b3, b4, b4, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, i4, iIndexOf, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i5 = ((int[]) objArr7[0])[0];
            int i6 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int i7 = (int) Runtime.getRuntime().totalMemory();
            int i8 = ~i7;
            int i9 = (((2107706327 + ((((~((-809763337) | i8)) | (~((-159569938) | i7))) | (~(970383293 | i7))) * 765)) + (((~((-969333274) | i8)) | 809763336) * 1530)) + (((~(i7 | (-969333274))) | (~(i8 | 970383293))) * 765)) - 1570187397;
            int i10 = (i9 << 13) ^ i9;
            int i11 = i10 ^ (i10 >>> 17);
            ((int[]) objArr[2])[0] = i11 ^ (i11 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            i(new char[]{26656, 26689, 32633, 27645, 26459, 20203, 62939, 15335, 51991, 6018, 6723, 22879, 53009, 49971, 46607, 11575, 37529, 28920, 17379, 62152, 9974, 7322, 8027, 17968, 51772, 51235, 43829, 10868, 40369, 30151}, Color.alpha(0), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            i(new char[]{32916, 33015, 1432, 4359, 45720, 39742, 34533, 54105, 47145, 28004, 53136, 10766, 10164, 47570, 25552, 24142, 31247, 2587, 38432, 33270, 52827, 26236}, (-1) - TextUtils.lastIndexOf("", '0', 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            i(new char[]{58807, 58845, 1125, 4334, 36237, 42031, 29548, 46641, 19891, 27803, 61584, 57275, 17024, 47217, 23802, 43972, 7996, 3059, 43300, 29800}, KeyEvent.normalizeMetaState(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            i(new char[]{31318, 31295, 46924, 41922, 28951, 22694, 19581, 10634, 29357, 57271, 3103, 57522, 56654, 2839, 41024, 38091, 33005, 47297, 21951, 19326}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = asInterface + 39;
            f962a = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, -1570187397};
                byte[] bArr4 = $$j;
                byte b5 = bArr4[39];
                Object[] objArr13 = new Object[1];
                j(b5, (byte) (-bArr4[18]), b5, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b6 = bArr4[18];
                Object[] objArr14 = new Object[1];
                j(b6, (byte) ($$k & 42), b6, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int iArgb = 2267 - Color.argb(0, 0, 0, 0);
                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 34;
                        byte[] bArr5 = $$d;
                        byte b7 = bArr5[5];
                        byte b8 = bArr5[7];
                        Object[] objArr16 = new Object[1];
                        h(b7, b8, b8, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, iArgb, iIndexOf2, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        i(new char[]{30442, 30347, 50621, 53561, 62602, 56634, 29500, 9517, 19952, 44358, 35218, 57272, 53717, 31220, 9600, 43949, 35947, 51756, 53298, 29731, 14375, 42612, 35986, 49345, 54465, 29412}, (-1) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        i(new char[]{58339, 58246, 22932, 19730, 30961, 20804, 39622, 45112, 41992, 12643, 1513, 13884, 17622, 58831, 43449, 17010, 6514, 22043, 23640}, View.MeasureSpec.getSize(0), objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char size = (char) View.MeasureSpec.getSize(0);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 2267;
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 33;
                            byte[] bArr6 = $$d;
                            byte b9 = bArr6[7];
                            Object[] objArr19 = new Object[1];
                            h(b9, bArr6[5], b9, objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(size, iResolveOpacity, iCombineMeasuredStates, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char maxKeyCode2 = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2267;
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 33;
                            byte[] bArr7 = $$d;
                            byte b10 = bArr7[7];
                            Object[] objArr20 = new Object[1];
                            h(b10, bArr7[40], b10, objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maxKeyCode2, longPressTimeout, capsMode, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i14 = ((int[]) objArr[3])[0];
        int i15 = ((int[]) objArr[0])[0];
        if (i15 == i14) {
            int i16 = f962a + 99;
            asInterface = i16 % 128;
            int i17 = i16 % 2;
            Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i18 = ((int[]) objArr[2])[0];
            int i19 = ((int[]) objArr[0])[0];
            int i20 = ((int[]) objArr[3])[0];
            String[] strArr2 = (String[]) objArr[1];
            int i21 = ~Process.myUid();
            int i22 = i18 + (-218814762) + (((~((-24025934) | i21)) | (-784687383)) * (-933)) + (((~(i21 | (-784687383))) | 780230674) * 933) + 1247861536;
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr21[2])[0] = i24 ^ (i24 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr3 = (String[]) objArr[1];
            if (strArr3 != null) {
                int i25 = f962a + 23;
                asInterface = i25 % 128;
                int i26 = i25 % 2;
                for (String str : strArr3) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i15];
            int i27 = i15 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i15 * i27) % 2) - 1], 1).show();
            Object[] objArr22 = {new int[]{i}, strArr, new int[1], new int[]{i}};
            int i28 = ((int[]) objArr[2])[0];
            int i29 = ((int[]) objArr[0])[0];
            int i30 = ((int[]) objArr[3])[0];
            String[] strArr4 = (String[]) objArr[1];
            int i31 = (int) Runtime.getRuntime().totalMemory();
            int i32 = i28 + 1487249287 + ((~((~i31) | 800324607)) * (-116)) + ((210897022 | i31) * 116) + (((~(i31 | (-597816294))) | 8388708) * 116);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
            ((int[]) objArr22[2])[0] = i34 ^ (i34 << 5);
        }
        return this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    protected final isTransformationInfoReady b() {
        int i = 2 % 2;
        String strU_ = u_();
        if (strU_ != null) {
            int i2 = f962a + 117;
            asInterface = i2 % 128;
            if (i2 % 2 != 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
                throw null;
            }
            isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
            if (istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                int i3 = asInterface + 79;
                f962a = i3 % 128;
                int i4 = i3 % 2;
                return istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
        }
        return getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object[] objArr) {
        getOutputTransform getoutputtransform = (getOutputTransform) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        sb.append('.');
        sb.append(str);
        String string = sb.toString();
        int i2 = asInterface + 115;
        f962a = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        throw null;
    }

    @Override // defpackage.createTransformedBitmap
    public final isTransformationInfoReady TuitionPaymentFragmentbindingInflater1() {
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        String strU_ = u_();
        if (strU_ != null && (istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_)) != null) {
            int i2 = asInterface + 65;
            f962a = i2 % 128;
            if (i2 % 2 != 0) {
                return istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            throw null;
        }
        isTransformationInfoReady istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        int i3 = f962a + 123;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return istransformationinforeadyG;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public boolean decodeNotNullMark() {
        isTransformationInfoReady istransformationinforeadyG;
        int i = 2 % 2;
        int i2 = asInterface + 63;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        String strU_ = u_();
        if (strU_ != null) {
            int i4 = asInterface + 55;
            f962a = i4 % 128;
            if (i4 % 2 == 0) {
                istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
                int i5 = 43 / 0;
                if (istransformationinforeadyG == null) {
                    istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i6 = f962a + 63;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                }
            } else {
                istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
                if (istransformationinforeadyG == null) {
                    istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    int i8 = f962a + 63;
                    asInterface = i8 % 128;
                    int i9 = i8 % 2;
                }
            }
        } else {
            istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            int i10 = f962a + 63;
            asInterface = i10 % 128;
            int i11 = i10 % 2;
        }
        return !(istransformationinforeadyG instanceof PreviewView);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0082  */
    private final Void TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldReuseImplementation p0, String p1, String p2) {
        isTransformationInfoReady istransformationinforeadyG;
        int i;
        int i2 = 2 % 2;
        StringBuilder sb = StringsKt.startsWith$default(p1, "i", false, 2, (Object) null) ? new StringBuilder("an ") : new StringBuilder("a ");
        sb.append(p1);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("Failed to parse literal '");
        sb2.append(p0);
        sb2.append("' as ");
        sb2.append(string);
        sb2.append(" value at element: ");
        sb2.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
        String string2 = sb2.toString();
        String strU_ = u_();
        if (strU_ != null) {
            int i3 = asInterface + 59;
            f962a = i3 % 128;
            int i4 = i3 % 2;
            istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
            if (istransformationinforeadyG != null) {
                i = f962a + 65;
            } else {
                istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                i = f962a + 67;
            }
        } else {
            istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            i = f962a + 67;
        }
        asInterface = i % 128;
        int i5 = i % 2;
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, string2, istransformationinforeadyG.toString());
    }

    @Override // defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public stopListeningToRotationEvents decodeInline(createImageAnalysis p0) {
        int i = 2 % 2;
        int i2 = asInterface + 73;
        f962a = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            u_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        if (u_() == null) {
            return new lambdaonSurfaceRequested0androidxcameraviewPreviewView1(this.b, getTuitionPaymentFragmentspecialinlinedviewModeldefault2(), this.TuitionPaymentFragmentspecialinlinedviewModeldefault3).decodeInline(p0);
        }
        stopListeningToRotationEvents stoplisteningtorotationeventsDecodeInline = super.decodeInline(p0);
        int i3 = f962a + 11;
        asInterface = i3 % 128;
        int i4 = i3 % 2;
        return stoplisteningtorotationeventsDecodeInline;
    }

    @Override // defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public <T> T decodeSerializableValue(isBitDepthMatched<? extends T> p0) {
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        shouldReuseImplementation shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i = 2 % 2;
        int i2 = asInterface + 101;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        getOutputTransform getoutputtransform = this;
        if (!(p0 instanceof setTargetOutputSize) || getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) {
            return p0.deserialize(getoutputtransform);
        }
        int i4 = f962a + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        setTargetOutputSize settargetoutputsize = (setTargetOutputSize) p0;
        String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = PreviewView1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(settargetoutputsize.getDescriptor(), getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentbindingInflater1 = getoutputtransform.TuitionPaymentFragmentbindingInflater1();
        String iNotificationSideChannel = settargetoutputsize.getDescriptor().getINotificationSideChannel();
        if (!(istransformationinforeadyTuitionPaymentFragmentbindingInflater1 instanceof getDisplayManager)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(getDisplayManager.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentbindingInflater1.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(iNotificationSideChannel);
            sb.append(" at element: ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentbindingInflater1.toString());
        }
        getDisplayManager getdisplaymanager = (getDisplayManager) istransformationinforeadyTuitionPaymentFragmentbindingInflater1;
        isTransformationInfoReady istransformationinfoready = (isTransformationInfoReady) getdisplaymanager.get(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        if (istransformationinfoready == null || (shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(istransformationinfoready)) == null) {
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        } else {
            int i6 = f962a + 39;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault1(shouldreuseimplementationTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
        try {
            isBitDepthMatched isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3 = deriveVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3((setTargetOutputSize) p0, getoutputtransform, strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
            Intrinsics.checkNotNull(isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            return (T) PreviewViewScaleType.TuitionPaymentFragmentbindingInflater1(getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), strTuitionPaymentFragmentspecialinlinedviewModeldefault3, getdisplaymanager, isbitdepthmatchedTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        } catch (SerializationException e2) {
            String message = e2.getMessage();
            Intrinsics.checkNotNull(message);
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, message, getdisplaymanager.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002a  */
    @Override // defpackage.ForwardingLiveData, defpackage.stopListeningToRotationEvents
    public setActiveRecording beginStructure(createImageAnalysis p0) {
        isTransformationInfoReady istransformationinforeadyG;
        setActiveRecording previewView1ExternalSyntheticLambda3;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        String strU_ = u_();
        Object obj = null;
        if (strU_ != null) {
            int i2 = asInterface + 43;
            f962a = i2 % 128;
            if (i2 % 2 == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
                obj.hashCode();
                throw null;
            }
            istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
            if (istransformationinforeadyG == null) {
                istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        } else {
            istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater1 = p0.TuitionPaymentFragmentbindingInflater1();
        if (Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE) || (deactivaterecordingTuitionPaymentFragmentbindingInflater1 instanceof resolveInputTimebase)) {
            PreviewStreamStateObserver2 previewStreamStateObserver2 = this.b;
            String iNotificationSideChannel = p0.getINotificationSideChannel();
            if (istransformationinforeadyG instanceof PreviewStreamStateObserverExternalSyntheticLambda2) {
                return new PreviewView1ExternalSyntheticBackportWithForwarding0(previewStreamStateObserver2, (PreviewStreamStateObserverExternalSyntheticLambda2) istransformationinforeadyG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(PreviewStreamStateObserverExternalSyntheticLambda2.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyG.getClass()).getSimpleName());
            sb.append(" as the serialized body of ");
            sb.append(iNotificationSideChannel);
            sb.append(" at element: ");
            sb.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyG.toString());
        }
        int i3 = asInterface + 89;
        f962a = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE);
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater1, isCameraAttached.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE)) {
            PreviewStreamStateObserver2 previewStreamStateObserver3 = this.b;
            String iNotificationSideChannel2 = p0.getINotificationSideChannel();
            if (istransformationinforeadyG instanceof getDisplayManager) {
                return new onSurfaceNotInUse(previewStreamStateObserver3, (getDisplayManager) istransformationinforeadyG, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, null, 8, null);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            sb2.append(Reflection.getOrCreateKotlinClass(getDisplayManager.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyG.getClass()).getSimpleName());
            sb2.append(" as the serialized body of ");
            sb2.append(iNotificationSideChannel2);
            sb2.append(" at element: ");
            sb2.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb2.toString(), istransformationinforeadyG.toString());
        }
        PreviewStreamStateObserver2 previewStreamStateObserver4 = this.b;
        createImageAnalysis createimageanalysisTuitionPaymentFragmentbindingInflater1 = getPreview.TuitionPaymentFragmentbindingInflater1(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0), previewStreamStateObserver4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        deactivateRecording deactivaterecordingTuitionPaymentFragmentbindingInflater2 = createimageanalysisTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        if ((deactivaterecordingTuitionPaymentFragmentbindingInflater2 instanceof checkAudioPermissionGranted) || Intrinsics.areEqual(deactivaterecordingTuitionPaymentFragmentbindingInflater2, deactivateRecording.TuitionPaymentFragmentbindingInflater1.INSTANCE)) {
            PreviewStreamStateObserver2 previewStreamStateObserver5 = this.b;
            String iNotificationSideChannel3 = p0.getINotificationSideChannel();
            if (!(istransformationinforeadyG instanceof getDisplayManager)) {
                StringBuilder sb3 = new StringBuilder("Expected ");
                sb3.append(Reflection.getOrCreateKotlinClass(getDisplayManager.class).getSimpleName());
                sb3.append(", but had ");
                sb3.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyG.getClass()).getSimpleName());
                sb3.append(" as the serialized body of ");
                sb3.append(iNotificationSideChannel3);
                sb3.append(" at element: ");
                sb3.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb3.toString(), istransformationinforeadyG.toString());
            }
            previewView1ExternalSyntheticLambda3 = new PreviewView1ExternalSyntheticLambda3(previewStreamStateObserver5, (getDisplayManager) istransformationinforeadyG);
        } else {
            if (!previewStreamStateObserver4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                throw setScreenFlashOverlayColor.TuitionPaymentFragmentbindingInflater1(createimageanalysisTuitionPaymentFragmentbindingInflater1);
            }
            int i4 = f962a + 11;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
            PreviewStreamStateObserver2 previewStreamStateObserver6 = this.b;
            String iNotificationSideChannel4 = p0.getINotificationSideChannel();
            if (!(istransformationinforeadyG instanceof PreviewStreamStateObserverExternalSyntheticLambda2)) {
                StringBuilder sb4 = new StringBuilder("Expected ");
                sb4.append(Reflection.getOrCreateKotlinClass(PreviewStreamStateObserverExternalSyntheticLambda2.class).getSimpleName());
                sb4.append(", but had ");
                sb4.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyG.getClass()).getSimpleName());
                sb4.append(" as the serialized body of ");
                sb4.append(iNotificationSideChannel4);
                sb4.append(" at element: ");
                sb4.append(TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb4.toString(), istransformationinforeadyG.toString());
            }
            previewView1ExternalSyntheticLambda3 = new PreviewView1ExternalSyntheticBackportWithForwarding0(previewStreamStateObserver6, (PreviewStreamStateObserverExternalSyntheticLambda2) istransformationinforeadyG);
        }
        return previewView1ExternalSyntheticLambda3;
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: avoid collision after fix types in other method */
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault22(String p0) {
        int i = 2 % 2;
        int i2 = asInterface + 101;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of boolean at element: ");
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        try {
            Boolean boolB = getRotatedViewportSize.b(shouldreuseimplementation);
            if (boolB == null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation, TypedValues.Custom.S_BOOLEAN, p0);
                throw new KotlinNothingValueException();
            }
            int i4 = asInterface + 49;
            f962a = i4 % 128;
            if (i4 % 2 != 0) {
                return boolB.booleanValue();
            }
            boolB.booleanValue();
            throw null;
        } catch (IllegalArgumentException unused) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation, TypedValues.Custom.S_BOOLEAN, p0);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[PHI: r1 r3
  0x0040: PHI (r1v8 shouldReuseImplementation) = (r1v15 shouldReuseImplementation), (r1v16 shouldReuseImplementation) binds: [B:16:0x003e, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x0040: PHI (r3v8 int) = (r3v7 int), (r3v9 int) binds: [B:16:0x003e, B:11:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [getOutputTransform, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4, types: [isTransformationInfoReady, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [shouldReuseImplementation] */
    /* JADX WARN: Type inference failed for: r1v9, types: [shouldReuseImplementation] */
    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: avoid collision after fix types in other method */
    private byte TuitionPaymentFragmentbindingInflater12(String p0) {
        int iTuitionPaymentFragmentbindingInflater1;
        shouldReuseImplementation shouldreuseimplementation;
        int i = 2 % 2;
        int i2 = f962a + 121;
        asInterface = i2 % 128;
        Byte bValueOf = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0) instanceof shouldReuseImplementation;
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        ?? TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!(TuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of byte at element: ");
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        int i3 = asInterface + 23;
        f962a = i3 % 128;
        try {
            if (i3 % 2 == 0) {
                shouldReuseImplementation shouldreuseimplementation2 = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                iTuitionPaymentFragmentbindingInflater1 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation2);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation2;
                shouldreuseimplementation = shouldreuseimplementation2;
                if (9 <= iTuitionPaymentFragmentbindingInflater1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                    if (iTuitionPaymentFragmentbindingInflater1 <= 127) {
                        int i4 = f962a + 13;
                        asInterface = i4 % 128;
                        int i5 = i4 % 2;
                        bValueOf = Byte.valueOf((byte) iTuitionPaymentFragmentbindingInflater1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                    }
                }
            } else {
                shouldReuseImplementation shouldreuseimplementation3 = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                iTuitionPaymentFragmentbindingInflater1 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation3);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation3;
                shouldreuseimplementation = shouldreuseimplementation3;
                if (-128 <= iTuitionPaymentFragmentbindingInflater1) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                    if (iTuitionPaymentFragmentbindingInflater1 <= 127) {
                        int i6 = f962a + 13;
                        asInterface = i6 % 128;
                        int i7 = i6 % 2;
                        bValueOf = Byte.valueOf((byte) iTuitionPaymentFragmentbindingInflater1);
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                    }
                }
            }
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "byte", p0);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "byte", p0);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045 A[PHI: r1 r3
  0x0045: PHI (r1v7 int) = (r1v6 int), (r1v14 int) binds: [B:13:0x0043, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v8 shouldReuseImplementation) = (r3v17 shouldReuseImplementation), (r3v18 shouldReuseImplementation) binds: [B:13:0x0043, B:9:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0049 A[Catch: IllegalArgumentException -> 0x0066, TRY_LEAVE, TryCatch #0 {IllegalArgumentException -> 0x0066, blocks: (B:7:0x0032, B:22:0x005d, B:23:0x0065, B:16:0x0049, B:12:0x003d), top: B:28:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d A[Catch: IllegalArgumentException -> 0x0066, TRY_ENTER, TryCatch #0 {IllegalArgumentException -> 0x0066, blocks: (B:7:0x0032, B:22:0x005d, B:23:0x0065, B:16:0x0049, B:12:0x003d), top: B:28:0x002e }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [getOutputTransform, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v5, types: [isTransformationInfoReady, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [shouldReuseImplementation] */
    /* JADX WARN: Type inference failed for: r3v9, types: [shouldReuseImplementation] */
    private static /* synthetic */ Object b(Object[] objArr) {
        int iTuitionPaymentFragmentbindingInflater1;
        shouldReuseImplementation shouldreuseimplementation;
        Short shValueOf;
        shouldReuseImplementation shouldreuseimplementation2;
        ?? r0 = (getOutputTransform) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 117;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        ?? TuitionPaymentFragmentspecialinlinedviewModeldefault3 = r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        if (!(TuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of short at element: ");
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{r0, str}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        int i4 = asInterface + 47;
        f962a = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                shouldReuseImplementation shouldreuseimplementation3 = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                iTuitionPaymentFragmentbindingInflater1 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation3);
                shouldreuseimplementation2 = shouldreuseimplementation3;
                shouldreuseimplementation = shouldreuseimplementation3;
                if (920 <= iTuitionPaymentFragmentbindingInflater1) {
                    shouldreuseimplementation2 = shouldreuseimplementation;
                    shValueOf = iTuitionPaymentFragmentbindingInflater1 <= 32767 ? Short.valueOf((short) iTuitionPaymentFragmentbindingInflater1) : null;
                }
                if (shValueOf != null) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                    return Short.valueOf(shValueOf.shortValue());
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "short", str);
                throw new KotlinNothingValueException();
            }
            shouldReuseImplementation shouldreuseimplementation4 = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            iTuitionPaymentFragmentbindingInflater1 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation4);
            shouldreuseimplementation2 = shouldreuseimplementation4;
            shouldreuseimplementation = shouldreuseimplementation4;
            if (-32768 <= iTuitionPaymentFragmentbindingInflater1) {
                shouldreuseimplementation2 = shouldreuseimplementation;
                if (iTuitionPaymentFragmentbindingInflater1 <= 32767) {
                }
            }
            if (shValueOf != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                return Short.valueOf(shValueOf.shortValue());
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "short", str);
            throw new KotlinNothingValueException();
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation2;
            if (shValueOf != null) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                return Short.valueOf(shValueOf.shortValue());
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "short", str);
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            r0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "short", str);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [getOutputTransform, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11, types: [int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [isTransformationInfoReady, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [shouldReuseImplementation] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX INFO: renamed from: d, reason: avoid collision after fix types in other method */
    private int d2(String p0) {
        int i = 2 % 2;
        int i2 = f962a + 25;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0) instanceof shouldReuseImplementation;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(p0, "");
        ?? TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!(TuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(TuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of int at element: ");
            int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), TuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        int i3 = f962a + 29;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentbindingInflater1 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation);
                int i4 = 20 / 0;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation;
                p0 = iTuitionPaymentFragmentbindingInflater1;
            } else {
                shouldReuseImplementation shouldreuseimplementation2 = (shouldReuseImplementation) TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int iTuitionPaymentFragmentbindingInflater2 = getRotatedViewportSize.TuitionPaymentFragmentbindingInflater1(shouldreuseimplementation2);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = shouldreuseimplementation2;
                p0 = iTuitionPaymentFragmentbindingInflater2;
            }
            return p0;
        } catch (IllegalArgumentException unused) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault3, "int", p0);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        r1 = defpackage.getRotatedViewportSize.asBinder(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r11 = defpackage.getOutputTransform.f962a + 63;
        defpackage.getOutputTransform.asInterface = r11 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if ((r11 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r11 = 99 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, "long", r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        r0 = new java.lang.StringBuilder("Expected ");
        r0.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(defpackage.shouldReuseImplementation.class).getSimpleName());
        r0.append(", but had ");
        r0.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r1.getClass()).getSimpleName());
        r0.append(" as the serialized body of long at element: ");
        r8 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        r0.append((java.lang.String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new java.lang.Object[]{r10, r11}, -1345399886, com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, r8, com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ac, code lost:
    
        throw defpackage.setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, r0.toString(), r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if ((r1 instanceof defpackage.shouldReuseImplementation) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
    
        if ((r1 instanceof defpackage.shouldReuseImplementation) == true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r1 = (defpackage.shouldReuseImplementation) r1;
     */
    /* JADX INFO: renamed from: g, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long g2(java.lang.String r11) {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = defpackage.getOutputTransform.asInterface
            int r1 = r1 + 117
            int r2 = r1 % 128
            defpackage.getOutputTransform.f962a = r2
            int r1 = r1 % r0
            r2 = 1
            java.lang.String r3 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            isTransformationInfoReady r1 = r10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r11)
            boolean r3 = r1 instanceof defpackage.shouldReuseImplementation
            r4 = 26
            int r4 = r4 / 0
            if (r3 != r2) goto L4d
            goto L2c
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
            isTransformationInfoReady r1 = r10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r11)
            boolean r3 = r1 instanceof defpackage.shouldReuseImplementation
            if (r3 != r2) goto L4d
        L2c:
            shouldReuseImplementation r1 = (defpackage.shouldReuseImplementation) r1
            long r1 = defpackage.getRotatedViewportSize.asBinder(r1)     // Catch: java.lang.IllegalArgumentException -> L42
            int r11 = defpackage.getOutputTransform.f962a
            int r11 = r11 + 63
            int r3 = r11 % 128
            defpackage.getOutputTransform.asInterface = r3
            int r11 = r11 % r0
            if (r11 == 0) goto L41
            r11 = 99
            int r11 = r11 / 0
        L41:
            return r1
        L42:
            java.lang.String r0 = "long"
            r10.TuitionPaymentFragmentspecialinlinedviewModeldefault3(r1, r0, r11)
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException
            r11.<init>()
            throw r11
        L4d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r0.<init>(r2)
            java.lang.Class<shouldReuseImplementation> r2 = defpackage.shouldReuseImplementation.class
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = ", but had "
            r0.append(r2)
            java.lang.Class r2 = r1.getClass()
            kotlin.reflect.KClass r2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r2)
            java.lang.String r2 = r2.getSimpleName()
            r0.append(r2)
            java.lang.String r2 = " as the serialized body of long at element: "
            r0.append(r2)
            java.lang.Object[] r3 = new java.lang.Object[]{r10, r11}
            int r8 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()
            int r6 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()
            int r5 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()
            int r9 = com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()
            r4 = -1345399886(0xffffffffafced3b2, float:-3.76216E-10)
            r7 = 1345399889(0x50312c51, float:1.1889886E10)
            java.lang.Object r11 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = (java.lang.String) r11
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.String r0 = r1.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1 = -1
            kotlinx.serialization.json.internal.JsonDecodingException r11 = defpackage.setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(r1, r11, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOutputTransform.g2(java.lang.String):long");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    private static /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object[] objArr) {
        isTransformationInfoReady istransformationinforeadyG;
        getOutputTransform getoutputtransform = (getOutputTransform) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = f962a + 41;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            boolean z = getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str) instanceof shouldReuseImplementation;
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        if (!(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of float at element: ");
            int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{getoutputtransform, str}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        try {
            float fTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation);
            if (getoutputtransform.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel) {
                return Float.valueOf(fTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            if (!Float.isInfinite(fTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                int i3 = f962a + 95;
                asInterface = i3 % 128;
                if (i3 % 2 != 0) {
                    Float.isNaN(fTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    throw null;
                }
                if (!Float.isNaN(fTuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    return Float.valueOf(fTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }
            Float fValueOf = Float.valueOf(fTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            String strU_ = getoutputtransform.u_();
            if (strU_ != null) {
                int i4 = asInterface + 109;
                f962a = i4 % 128;
                int i5 = i4 % 2;
                istransformationinforeadyG = getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_);
                if (istransformationinforeadyG == null) {
                    istransformationinforeadyG = getoutputtransform.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                }
            } else {
                istransformationinforeadyG = getoutputtransform.getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
            String string = istransformationinforeadyG.toString();
            Intrinsics.checkNotNullParameter(fValueOf, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(string, "");
            throw setScreenFlashOverlayColor.b(-1, setScreenFlashOverlayColor.b(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            getoutputtransform.TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation, TypedValues.Custom.S_FLOAT, str);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: b, reason: avoid collision after fix types in other method */
    private double b2(String p0) {
        isTransformationInfoReady istransformationinforeadyG;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of double at element: ");
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        int i2 = f962a + 123;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        try {
            double dTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getRotatedViewportSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2(shouldreuseimplementation);
            if (this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel) {
                return dTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            if (!Double.isInfinite(dTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                int i4 = f962a + 89;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                if (!Double.isNaN(dTuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    int i6 = asInterface + 87;
                    f962a = i6 % 128;
                    if (i6 % 2 != 0) {
                        return dTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
            Double dValueOf = Double.valueOf(dTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            String strU_ = u_();
            if (strU_ == null || (istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_)) == null) {
                istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                int i7 = f962a + 61;
                asInterface = i7 % 128;
                int i8 = i7 % 2;
            }
            String string = istransformationinforeadyG.toString();
            Intrinsics.checkNotNullParameter(dValueOf, "");
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(string, "");
            throw setScreenFlashOverlayColor.b(-1, setScreenFlashOverlayColor.b(dValueOf, p0, string));
        } catch (IllegalArgumentException unused) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation, "double", p0);
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: avoid collision after fix types in other method */
    private char TuitionPaymentFragmentspecialinlinedviewModeldefault12(String p0) {
        int i = 2 % 2;
        int i2 = asInterface + 87;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        if (!(!(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation))) {
            shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            try {
                char cSingle = StringsKt.single(shouldreuseimplementation.getB());
                int i4 = asInterface + 25;
                f962a = i4 % 128;
                int i5 = i4 % 2;
                return cSingle;
            } catch (IllegalArgumentException unused) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(shouldreuseimplementation, "char", p0);
                throw new KotlinNothingValueException();
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
        sb.append(", but had ");
        sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
        sb.append(" as the serialized body of char at element: ");
        sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
    }

    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ int TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, createImageAnalysis createimageanalysis) {
        int i = 2 % 2;
        int i2 = f962a + 25;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(createimageanalysis, "");
        PreviewStreamStateObserver2 previewStreamStateObserver2 = this.b;
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2);
        String iNotificationSideChannel = createimageanalysis.getINotificationSideChannel();
        if (istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation) {
            int i4 = asInterface + 95;
            f962a = i4 % 128;
            if (i4 % 2 != 0) {
                return PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, previewStreamStateObserver2, ((shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3).getB(), "");
            }
            PreviewViewExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(createimageanalysis, previewStreamStateObserver2, ((shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3).getB(), "");
            throw null;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
        sb.append(", but had ");
        sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
        sb.append(" as the serialized body of ");
        sb.append(iNotificationSideChannel);
        sb.append(" at element: ");
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ String asBinder(String str) {
        isTransformationInfoReady istransformationinforeadyG;
        isTransformationInfoReady istransformationinforeadyG2;
        int i = 2 % 2;
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "");
        isTransformationInfoReady istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(str2);
        if (!(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3 instanceof shouldReuseImplementation)) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(Reflection.getOrCreateKotlinClass(shouldReuseImplementation.class).getSimpleName());
            sb.append(", but had ");
            sb.append(Reflection.getOrCreateKotlinClass(istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.getClass()).getSimpleName());
            sb.append(" as the serialized body of string at element: ");
            sb.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
            throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, sb.toString(), istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3.toString());
        }
        int i2 = f962a + 69;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        shouldReuseImplementation shouldreuseimplementation = (shouldReuseImplementation) istransformationinforeadyTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (shouldreuseimplementation instanceof setTransformationInfo) {
            setTransformationInfo settransformationinfo = (setTransformationInfo) shouldreuseimplementation;
            if (!settransformationinfo.TuitionPaymentFragmentbindingInflater1) {
                int i4 = asInterface + 115;
                f962a = i4 % 128;
                int i5 = i4 % 2;
                if (!this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) {
                    StringBuilder sb2 = new StringBuilder("String literal for key '");
                    sb2.append(str2);
                    sb2.append("' should be quoted at element: ");
                    sb2.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
                    sb2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
                    String string = sb2.toString();
                    String strU_ = u_();
                    if (strU_ == null || (istransformationinforeadyG2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_)) == null) {
                        istransformationinforeadyG2 = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    }
                    throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, string, istransformationinforeadyG2.toString());
                }
            }
            return settransformationinfo.b;
        }
        StringBuilder sb3 = new StringBuilder("Expected string value for a non-null key '");
        sb3.append(str2);
        sb3.append("', got null literal instead at element: ");
        sb3.append((String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str2}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b()));
        String string2 = sb3.toString();
        String strU_2 = u_();
        if (strU_2 != null) {
            int i6 = f962a + 49;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            istransformationinforeadyG = TuitionPaymentFragmentspecialinlinedviewModeldefault3(strU_2);
            if (istransformationinforeadyG != null) {
                int i8 = f962a + 65;
                asInterface = i8 % 128;
                if (i8 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
            }
        } else {
            istransformationinforeadyG = getTuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }
        throw setScreenFlashOverlayColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(-1, string2, istransformationinforeadyG.toString());
    }

    public /* synthetic */ getOutputTransform(PreviewStreamStateObserver2 previewStreamStateObserver2, isTransformationInfoReady istransformationinfoready, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(previewStreamStateObserver2, istransformationinfoready, str);
    }

    @Override // defpackage.setImageCaptureTargetSize
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3(String p0, String p1) {
        int i = 2 % 2;
        int i2 = asInterface + 27;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (i3 != 0) {
            return p1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // defpackage.ForwardingLiveData
    public final /* bridge */ /* synthetic */ boolean b(String str) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return ((Boolean) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str}, -26656047, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 26656047, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).booleanValue();
    }

    /* JADX INFO: renamed from: asInterface, reason: avoid collision after fix types in other method */
    private float asInterface2(String p0) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return ((Float) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1641493276, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1641493278, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).floatValue();
    }

    @Override // defpackage.ForwardingLiveData
    public final /* synthetic */ long a(String str) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return ((Long) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, str}, 2003354607, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), -2003354606, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).longValue();
    }

    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method */
    private short a2(String p0) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return ((Short) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1925216822, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1925216826, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b())).shortValue();
    }

    @Override // defpackage.ForwardingLiveData, defpackage.setActiveRecording
    public void endStructure(createImageAnalysis p0) {
        int i = 2 % 2;
        int i2 = asInterface + 45;
        f962a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        int i4 = asInterface + 123;
        f962a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 32 / 0;
        }
    }

    /* JADX INFO: renamed from: asBinder, reason: avoid collision after fix types in other method */
    private String asBinder2(String p0) {
        int iB = LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b();
        return (String) TuitionPaymentFragmentspecialinlinedviewModeldefault1(new Object[]{this, p0}, -1345399886, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b(), 1345399889, iB, LinearIndeterminateDisjointAnimatorDelegate.AnonymousClass3.b());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$n(int r7, int r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = 107 - r9
            int r8 = r8 * 3
            int r8 = r8 + 1
            byte[] r0 = defpackage.getOutputTransform.$$l
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.getOutputTransform.$$n(int, int, byte):java.lang.String");
    }
}
