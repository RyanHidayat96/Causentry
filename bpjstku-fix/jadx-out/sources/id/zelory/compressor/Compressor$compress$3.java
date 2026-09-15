package id.zelory.compressor;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.mlkit.common.MlKitException;
import defpackage.Quality;
import defpackage.containsQuality;
import defpackage.deInitSession;
import defpackage.getRecorder;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljava/io/File;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 3, 0})
@DebugMetadata(c = "id.zelory.compressor.Compressor$compress$3", f = "Compressor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Compressor$compress$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
    final /* synthetic */ Function1 $compressionPatch;
    final /* synthetic */ Context $context;
    final /* synthetic */ File $imageFile;
    int label;
    private CoroutineScope p$;
    private static final byte[] $$c = {ByteCompanionObject.MAX_VALUE, 43, -39, -37};
    private static final int $$f = MlKitException.CODE_SCANNER_PIPELINE_INITIALIZATION_ERROR;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {55, -47, -47, 67, 2, -21, 2, -11, -6, -23, -8, 28, -46, -11, -14, -8, 24, -43, -6, 3, -4, -11, -11, 42, -56, -22, 1, -23, -6, -3, -4, -29, 12, -7, -21, -1, -22, 8, -11, -21, -12, 4, -20, -11, -6, 3, -11, -23, -9, 1, -14, -2, 26, -42, -10, -4, -29, 0, -17, 24, -43, -6, 3, -4, -11, -11, 12, -43, -6, 3, -11, -23, -9, -5, -12, -42, 3, -20, 2, -15, -8, 21, -26, -33, 3, -1, -18, -15, 37, -53, 8, -15, -15, -1, -18, -15, 9, -16, -14, 1, -14, -14, -2, 21, -46, -1, -15, 2, -28, 6, -22, 56};
    private static final int $$e = 106;
    private static final byte[] $$a = {31, -3, -46, 11, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, 9, 7, -1, 8, 16, 2, 21, 7, 15, 8, 7, 15, 1, 9, 28, -3, 6, 28, -32, 44, -1, 11, 17, 2, 11, 11, 5, 30, 1, 18, -55, 43, -2, 21, -1, 16, 9, -20, 27, 34, -2, 2, 19, 16, -36, 54, -7, 16, 16, 2, 19, 16, -8, 17, 15, 0, 15, 15, 3, -20, 47, 2, 16, -1, 29, -5, 23, -55};
    private static final int $$b = 196;
    private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    private static int $TuitionPaymentFragmentbindingInflater1 = 1;
    private static char[] b = {60117, 60043, 60045, 60054, 60053, 60123, 60040, 60122, 60048, 60090, 60041, 60034, 60046, 60058, 60050, 60119, 60055, 60118, 60051, 60072, 60120, 60063, 60047, 60121, 60062, 60049, 60125, 60056, 60083, 60052, 60088, 60116, 60124, 60079, 60060, 60073};
    private static char TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 57191;

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = id.zelory.compressor.Compressor$compress$3.$$a
            int r7 = r7 * 52
            int r7 = 55 - r7
            int r9 = r9 * 14
            int r9 = r9 + 84
            int r8 = 53 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: id.zelory.compressor.Compressor$compress$3.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 24
            int r6 = 108 - r6
            int r7 = r7 * 34
            int r0 = r7 + 38
            byte[] r1 = id.zelory.compressor.Compressor$compress$3.$$d
            int r8 = r8 * 71
            int r8 = 75 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 37
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2f
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r3 + 1
            int r8 = r8 + (-9)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: id.zelory.compressor.Compressor$compress$3.d(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = 2 % 2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        getRecorder getrecorder = new getRecorder();
        this.$compressionPatch.invoke(getrecorder);
        File fileB = Quality.b(this.$context, this.$imageFile);
        Iterator<T> it = getrecorder.TuitionPaymentFragmentspecialinlinedviewModeldefault2().iterator();
        while (!(!it.hasNext())) {
            containsQuality containsquality = (containsQuality) it.next();
            while (!containsquality.getTuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
                int i2 = $TuitionPaymentFragmentbindingInflater1 + 99;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
                if (i2 % 2 != 0) {
                    containsquality.TuitionPaymentFragmentbindingInflater1(fileB);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                fileB = containsquality.TuitionPaymentFragmentbindingInflater1(fileB);
                int i3 = $TuitionPaymentFragmentbindingInflater1 + 41;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return fileB;
    }

    private static void c(char[] cArr, byte b2, int i, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        deInitSession deinitsession = new deInitSession();
        char[] cArr2 = b;
        int i5 = 1770390596;
        Object obj2 = null;
        if (cArr2 != null) {
            int i6 = $11 + 111;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 107;
                $10 = i9 % 128;
                if (i9 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) Color.argb(0, 0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2267, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 33, -1927765101, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                        i3 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i5);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) Color.argb(0, 0, 0, 0), 2267 - Color.argb(0, 0, 0, 0), 34 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1927765101, false, $$g(b5, b6, b6), new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).charValue();
                    i8++;
                    i3 = 2;
                    i5 = 1770390596;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
            byte b7 = (byte) 0;
            byte b8 = b7;
            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) Color.argb(0, 0, 0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2267, 32 - TextUtils.lastIndexOf("", '0', 0, 0), -1927765101, false, $$g(b7, b8, b8), new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        char c = 7;
        if (i2 > 1) {
            int i10 = $10 + 21;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
            } else {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            }
            while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    int i11 = $10 + 105;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b * b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 / b2);
                    } else {
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                    }
                    obj = obj2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = deinitsession;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = deinitsession;
                    objArr5[9] = deinitsession;
                    objArr5[8] = Integer.valueOf(cCharValue);
                    objArr5[c] = deinitsession;
                    objArr5[6] = deinitsession;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = deinitsession;
                    objArr5[3] = deinitsession;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = deinitsession;
                    objArr5[0] = deinitsession;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 49267);
                        int i12 = 3261 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int fadingEdgeLength = 30 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        byte b9 = (byte) ($$f & 3);
                        byte b10 = (byte) (b9 - 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, i12, fadingEdgeLength, -127612708, false, $$g(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue() == deinitsession.asBinder) {
                        int i13 = $11 + 25;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b11 = (byte) 3;
                            byte b12 = (byte) (b11 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (22878 - KeyEvent.normalizeMetaState(0)), 594 - Gravity.getAbsoluteGravity(0, 0), 16 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1570859318, false, $$g(b11, b12, b12), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        int i15 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i15];
                    } else {
                        obj = null;
                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                            int i16 = $10 + 125;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                            int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                            int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                        } else {
                            int i20 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                            int i21 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i20];
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i21];
                        }
                    }
                }
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                int i22 = $11 + 49;
                $10 = i22 % 128;
                int i23 = i22 % 2;
                obj2 = obj;
                c = 7;
            }
        }
        int i24 = 0;
        while (i24 < i) {
            int i25 = $11 + 7;
            $10 = i25 % 128;
            if (i25 % 2 != 0) {
                cArr4[i24] = (char) (cArr4[i24] ^ 28506);
                i24 += 48;
            } else {
                cArr4[i24] = (char) (cArr4[i24] ^ 13722);
                i24++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x022b  */
    /* JADX WARN: Code duplicated, block: B:27:0x022d  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cIndexOf = (char) (31532 - TextUtils.indexOf((CharSequence) "", '0', 0));
            int iIndexOf = 921 - TextUtils.indexOf("", "", 0, 0);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 28;
            byte b2 = $$a[37];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) 52, b2, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cIndexOf, iIndexOf, iMakeMeasureSpec, -1048449946, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        c(new char[]{16, 1, 22, '\t', 26, 17, 18, 3, 24, 11, 1, 18, 6, 7, 18, 28, 0, '!', 17, 28, 26, '\t'}, (byte) (89 - TextUtils.lastIndexOf("", '0', 0)), 22 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        c(new char[]{28, '\f', 19, 7, '\f', 30, 23, '!', 25, '\f', 22, 28, 15, 2, 13841}, (byte) (18 - View.resolveSize(0, 0)), 15 - Color.alpha(0), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 31532);
            int iResolveOpacity = 921 - Drawable.resolveOpacity(0, 0);
            int iMyPid = 28 - (Process.myPid() >> 22);
            byte[] bArr = $$a;
            byte b3 = bArr[37];
            byte b4 = bArr[80];
            Object[] objArr5 = new Object[1];
            a(b3, b4, b4, objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, iResolveOpacity, iMyPid, -778300370, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 73;
            $TuitionPaymentFragmentbindingInflater1 = i2 % 128;
            int i3 = i2 % 2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 31533);
                int scrollBarSize = 921 - (ViewConfiguration.getScrollBarSize() >> 8);
                int maximumDrawingCacheSize = 28 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte[] bArr2 = $$a;
                byte b5 = bArr2[80];
                Object[] objArr6 = new Object[1];
                a(b5, bArr2[33], b5, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, scrollBarSize, maximumDrawingCacheSize, -1142834547, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[1], new int[]{((int[]) objArr7[1])[0]}, (Object[]) objArr7[2], new int[]{((int[]) objArr7[3])[0]}, (String[]) objArr7[4]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = 1697742583 + (((~(1774042623 | i4)) | 37020) * 220) + (((~(i4 | 1619310013)) | 154769630) * (-440)) + ((iIdentityHashCode | 1774042623) * 220) + 487049355;
            int i6 = (i5 << 13) ^ i5;
            int i7 = i6 ^ (i6 >>> 17);
            ((int[]) objArr[0])[0] = i7 ^ (i7 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            c(new char[]{16, 1, 22, '\t', 26, 17, 18, 3, 19, 7, 2, 1, 15, '!', 20, 16, '\b', 20, 23, '\n', 30, 21, 6, 28, 15, 19}, (byte) (116 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.keyCodeFromString("") + 26, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            c(new char[]{24, 15, 13924, 13924, 28, 0, 21, '\n', 13926, 13926, 17, 15, 25, 15, 20, 16, 28, 5}, (byte) (TextUtils.indexOf("", "", 0) + 124), 18 - TextUtils.getOffsetBefore("", 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(!(applicationContext instanceof ContextWrapper))) {
                    int i8 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 51;
                    $TuitionPaymentFragmentbindingInflater1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 95 / 0;
                        if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        } else {
                            applicationContext = null;
                        }
                    } else if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            c(new char[]{31, 19, 1, 14, 4, '\f', 16, 1, 30, 4, 23, 7, '\n', 18, 27, 0}, (byte) (39 - View.MeasureSpec.getMode(0)), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            c(new char[]{15, 20, 28, 0, 20, 16, 23, '\n', 25, 16, '\f', 24, '#', 24, 18, 27}, (byte) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 5), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i10 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 81;
            $TuitionPaymentFragmentbindingInflater1 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 487049355};
                byte[] bArr3 = $$d;
                byte b6 = bArr3[57];
                byte b7 = bArr3[26];
                Object[] objArr13 = new Object[1];
                d(b6, b7, b7, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b8 = bArr3[26];
                byte b9 = bArr3[57];
                Object[] objArr14 = new Object[1];
                d(b8, b9, b9, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1602166106);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char cResolveSize = (char) (31533 - View.resolveSize(0, 0));
                    int maximumFlingVelocity = 921 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int maximumFlingVelocity2 = 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    byte[] bArr4 = $$a;
                    byte b10 = bArr4[80];
                    byte b11 = b10;
                    byte b12 = bArr4[33];
                    byte b13 = b10;
                    Object[] objArr16 = new Object[1];
                    a(b11, b12, b13, objArr16);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSize, maximumFlingVelocity, maximumFlingVelocity2, -1142834547, false, (String) objArr16[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                try {
                    Object[] objArr17 = new Object[1];
                    c(new char[]{16, 1, 22, '\t', 26, 17, 18, 3, 24, 11, 1, 18, 6, 7, 18, 28, 0, '!', 17, 28, 26, '\t'}, (byte) (ExpandableListView.getPackedPositionType(0L) + 90), 22 - TextUtils.indexOf("", "", 0, 0), objArr17);
                    Class<?> cls5 = Class.forName((String) objArr17[0]);
                    Object[] objArr18 = new Object[1];
                    c(new char[]{28, '\f', 19, 7, '\f', 30, 23, '!', 25, '\f', 22, 28, 15, 2, 13841}, (byte) (18 - View.combineMeasuredStates(0, 0)), 15 - View.resolveSizeAndState(0, 0, 0), objArr18);
                    long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(889369593);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char c3 = (char) (31534 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                        int iAxisFromString = 920 - MotionEvent.axisFromString("");
                        int i12 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28;
                        byte[] bArr5 = $$a;
                        byte b14 = bArr5[37];
                        byte b15 = bArr5[80];
                        Object[] objArr19 = new Object[1];
                        a(b14, b15, b15, objArr19);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c3, iAxisFromString, i12, -778300370, false, (String) objArr19[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(622807985);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31533);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 921;
                        int iNormalizeMetaState = 28 - KeyEvent.normalizeMetaState(0);
                        byte b16 = $$a[37];
                        Object[] objArr20 = new Object[1];
                        a(b16, (byte) 52, b16, objArr20);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(scrollBarFadeDuration, keyRepeatTimeout, iNormalizeMetaState, -1048449946, false, (String) objArr20[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr15;
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
        int i14 = ((int[]) objArr[3])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[0])[0];
            Object[] objArr21 = {new int[1], new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[]{((int[]) objArr[3])[0]}, (String[]) objArr[4]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = ~iIdentityHashCode2;
            int i17 = i15 + 134002307 + (((~((-635124631) | i16)) | 29561604 | (~((-1138955014) | i16))) * (-1136)) + (((~((-635124631) | iIdentityHashCode2)) | (~((-1138955014) | iIdentityHashCode2)) | (~(1744518039 | i16))) * (-568)) + (((~(iIdentityHashCode2 | (-29561605))) | (~(i16 | 1138955013)) | (~(635124630 | i16))) * 568);
            int i18 = (i17 << 13) ^ i17;
            int i19 = i18 ^ (i18 >>> 17);
            ((int[]) objArr21[0])[0] = i19 ^ (i19 << 5);
            return ((Compressor$compress$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = (String[]) objArr[4];
        if (strArr != null) {
            int i20 = $TuitionPaymentFragmentbindingInflater1 + 111;
            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i20 % 128;
            int i21 = i20 % 2 == 0 ? 0 : 1;
            while (i21 < strArr.length) {
                arrayList.add(strArr[i21]);
                i21++;
                int i22 = $TuitionPaymentFragmentbindingInflater1 + 69;
                $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i22 % 128;
                int i23 = i22 % 2;
            }
        }
        throw new RuntimeException(String.valueOf(i14));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Compressor$compress$3(Function1 function1, Context context, File file, Continuation continuation) {
        super(2, continuation);
        this.$compressionPatch = function1;
        this.$context = context;
        this.$imageFile = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        int i = 2 % 2;
        Compressor$compress$3 compressor$compress$3 = new Compressor$compress$3(this.$compressionPatch, this.$context, this.$imageFile, continuation);
        compressor$compress$3.p$ = (CoroutineScope) obj;
        int i2 = $TuitionPaymentFragmentbindingInflater1 + 73;
        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
        int i3 = i2 % 2;
        return compressor$compress$3;
    }

    private static String $$g(int i, short s, int i2) {
        byte[] bArr = $$c;
        int i3 = 3 - (s * 3);
        int i4 = i + 113;
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[1 - i5];
        int i6 = 0 - i5;
        int i7 = -1;
        if (bArr == null) {
            i4 = (-i4) + i3;
            i7 = -1;
        }
        while (true) {
            int i8 = i3;
            int i9 = i4;
            int i10 = i7 + 1;
            bArr2[i10] = (byte) i9;
            if (i10 == i6) {
                return new String(bArr2, 0);
            }
            int i11 = i8 + 1;
            i3 = i11;
            i4 = (-bArr[i11]) + i9;
            i7 = i10;
        }
    }
}
