package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.ComposerKt;
import com.airbnb.lottie.model.layer.Layer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ensureClassLoader extends fromMediaSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<fromMediaSession> f900a;
    private Paint asBinder;
    private final RectF asInterface;
    private final RectF cancel;
    private binderDied<Float, Float> onTransact;
    private static final byte[] $$h = {21, ByteCompanionObject.MAX_VALUE, 49, -115};
    private static final int $$i = 58;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {5, -91, 77, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
    private static final int $$e = 31;
    private static int cancelAll = 0;
    private static int INotificationSideChannel = 1;
    private static int[] notify = {973730078, -1475624525, 874372406, 1024219086, 1032943043, -300388684, -1489974506, 331733069, 140568032, -274871837, 400493383, 518440053, 26296914, -312388706, 1780010617, 898183992, 1890283867, -426385825};

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = r6 + 1
            int r5 = r5 * 14
            int r5 = 98 - r5
            int r7 = r7 * 52
            int r7 = 56 - r7
            byte[] r1 = defpackage.ensureClassLoader.$$d
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r5 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-11)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ensureClassLoader.f(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:61:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x0100 A[SYNTHETIC] */
    public ensureClassLoader(prepare prepareVar, Layer layer, List<Layer> list, previous previousVar) throws Throwable {
        fromMediaSession frommediasession;
        fromMediaSession getmediasession;
        int i;
        int i2;
        super(prepareVar, layer);
        this.f900a = new ArrayList();
        this.cancel = new RectF();
        this.asInterface = new RectF();
        this.asBinder = new Paint();
        getVolumeControl getvolumecontrol = layer.getInterfaceDescriptor;
        Object obj = null;
        if (getvolumecontrol != null) {
            binderDied<Float, Float> binderdiedTuitionPaymentFragmentbindingInflater1 = getvolumecontrol.TuitionPaymentFragmentbindingInflater1();
            this.onTransact = binderdiedTuitionPaymentFragmentbindingInflater1;
            if (binderdiedTuitionPaymentFragmentbindingInflater1 != null) {
                int i3 = cancelAll + 51;
                INotificationSideChannel = i3 % 128;
                int i4 = i3 % 2;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
            }
            this.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        } else {
            this.onTransact = null;
            int i5 = 2 % 2;
        }
        LongSparseArray longSparseArray = new LongSparseArray(previousVar.d.size());
        int size = list.size() - 1;
        fromMediaSession frommediasession2 = null;
        while (true) {
            if (size < 0) {
                for (int i6 = 0; i6 < longSparseArray.size(); i6++) {
                    int i7 = cancelAll + 79;
                    INotificationSideChannel = i7 % 128;
                    if (i7 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    fromMediaSession frommediasession3 = (fromMediaSession) longSparseArray.get(longSparseArray.keyAt(i6));
                    if (frommediasession3 != null && (frommediasession = (fromMediaSession) longSparseArray.get(frommediasession3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.g)) != null) {
                        int i8 = cancelAll + 65;
                        INotificationSideChannel = i8 % 128;
                        int i9 = i8 % 2;
                        frommediasession3.TuitionPaymentFragmentbindingInflater1(frommediasession);
                        if (i9 == 0) {
                            throw null;
                        }
                    }
                }
                return;
            }
            Layer layer2 = list.get(size);
            switch (fromMediaSession.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1[layer2.asInterface.ordinal()]) {
                case 1:
                    getmediasession = new getMediaSession(prepareVar, layer2);
                    int i10 = 2 % 2;
                    break;
                case 2:
                    getmediasession = new ensureClassLoader(prepareVar, layer2, previousVar.cancel.get(layer2.INotificationSideChannel), previousVar);
                    break;
                case 3:
                    getmediasession = new isActive(prepareVar, layer2);
                    int i11 = 2 % 2;
                    break;
                case 4:
                    getmediasession = new getStateWithUpdatedPosition(prepareVar, layer2);
                    break;
                case 5:
                    getmediasession = new getCallingPackage(prepareVar, layer2);
                    break;
                case 6:
                    getmediasession = new getController(prepareVar, layer2);
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Unknown layer type ");
                    sb.append(layer2.asInterface);
                    onSetCaptioningEnabled.b(sb.toString());
                    getmediasession = null;
                    break;
            }
            if (getmediasession != null) {
                int i12 = cancelAll + 23;
                INotificationSideChannel = i12 % 128;
                if (i12 % 2 == 0) {
                    longSparseArray.put(getmediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, getmediasession);
                    int i13 = 10 / 0;
                    if (frommediasession2 != null) {
                        frommediasession2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getmediasession);
                        int i14 = 2 % 2;
                        frommediasession2 = null;
                    } else {
                        this.f900a.add(0, getmediasession);
                        i = AnonymousClass4.b[layer2.f366a.ordinal()];
                        if (i != 1) {
                            i2 = cancelAll + 77;
                            INotificationSideChannel = i2 % 128;
                            if (i2 % 2 == 0) {
                                if (i == 3) {
                                    frommediasession2 = getmediasession;
                                }
                            } else if (i == 2) {
                                frommediasession2 = getmediasession;
                            }
                        } else {
                            frommediasession2 = getmediasession;
                        }
                    }
                } else {
                    longSparseArray.put(getmediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, getmediasession);
                    if (frommediasession2 != null) {
                        frommediasession2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getmediasession);
                        int i15 = 2 % 2;
                        frommediasession2 = null;
                    } else {
                        this.f900a.add(0, getmediasession);
                        i = AnonymousClass4.b[layer2.f366a.ordinal()];
                        if (i != 1) {
                            i2 = cancelAll + 77;
                            INotificationSideChannel = i2 % 128;
                            if (i2 % 2 == 0) {
                                if (i == 3) {
                                    frommediasession2 = getmediasession;
                                }
                            } else if (i == 2) {
                                frommediasession2 = getmediasession;
                            }
                        } else {
                            frommediasession2 = getmediasession;
                        }
                    }
                }
            }
            size--;
            int i16 = 2 % 2;
        }
    }

    /* JADX INFO: renamed from: ensureClassLoader$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            b = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static void h(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = notify;
        int i4 = -1870535734;
        int i5 = 1;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((Process.getThreadPriority(0) + 20) >> 6), 3291 - View.MeasureSpec.getSize(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31, 1948206109, false, $$j(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = -1870535734;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = notify;
        char c = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = 0;
            while (i8 < length3) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    try {
                        Object[] objArr3 = new Object[i5];
                        objArr3[i6] = Integer.valueOf(iArr5[i8]);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int iIndexOf = 3290 - TextUtils.indexOf("", c, i6, i6);
                            int capsMode = 31 - TextUtils.getCapsMode("", i6, i6);
                            byte b3 = (byte) i6;
                            byte b4 = b3;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(trimmedLength, iIndexOf, capsMode, 1948206109, false, $$j(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    length3 = length3;
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i8])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0') + 3292, ((Process.getThreadPriority(0) + 20) >> 6) + 31, 1948206109, false, $$j(b5, b6, b6), new Class[]{Integer.TYPE});
                        }
                        iArr6[i8] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i8++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                length3 = length3;
                c = '0';
                i5 = 1;
                i6 = 0;
            }
            i2 = i6;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        sessionConfigValidatingBuilder.b = 2;
        while (sessionConfigValidatingBuilder.b < iArr.length) {
            int i10 = $11 + 125;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
            cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
            cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
            cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
            int i12 = 17;
            for (int i13 = 1; i12 > i13; i13 = 1) {
                int i14 = $10 + 121;
                $11 = i14 % 128;
                int i15 = i14 % 2;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i12];
                Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b7 = (byte) 1;
                    byte b8 = (byte) (b7 - 1);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), View.combineMeasuredStates(0, 0) + 2559, 28 - TextUtils.lastIndexOf("", '0', 0), 683220507, false, $$j(b7, b8, b8), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                i12--;
            }
            int i16 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i16;
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
            int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object[] objArr6 = {sessionConfigValidatingBuilder};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (ExpandableListView.getPackedPositionGroup(0L) + 28879), 348 - (Process.myPid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 25, -30507727, false, "G", new Class[]{Object.class});
            }
            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue()];
            cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
            cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
            cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
            cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
            cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
            sessionConfigValidatingBuilder.b += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0046  */
    @Override // defpackage.fromMediaSession
    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Canvas canvas, Matrix matrix, int i) throws Throwable {
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        int i2 = 2 % 2;
        this.asInterface.set(0.0f, 0.0f, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.notify, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.d);
        matrix.mapRect(this.asInterface);
        if (!this.TuitionPaymentFragmentbindingInflater1.f1323a || this.f900a.size() <= 1) {
            z = false;
        } else {
            int i3 = INotificationSideChannel + 77;
            cancelAll = i3 % 128;
            if (i3 % 2 == 0 ? i == 255 : i == 6710) {
                z = false;
            } else {
                z = true;
            }
        }
        Object obj = null;
        if (z) {
            int i4 = cancelAll + 107;
            INotificationSideChannel = i4 % 128;
            if (i4 % 2 == 0) {
                this.asBinder.setAlpha(i);
                onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.asInterface, this.asBinder);
                obj.hashCode();
                throw null;
            }
            this.asBinder.setAlpha(i);
            onSkipToPrevious.TuitionPaymentFragmentspecialinlinedviewModeldefault1(canvas, this.asInterface, this.asBinder);
        } else {
            canvas.save();
        }
        int i5 = z ? 255 : i;
        for (int size = this.f900a.size() - 1; size >= 0; size--) {
            if (!(!(!this.asInterface.isEmpty() ? canvas.clipRect(this.asInterface) : true))) {
                int i6 = cancelAll + 5;
                INotificationSideChannel = i6 % 128;
                int i7 = i6 % 2;
                this.f900a.get(size).TuitionPaymentFragmentspecialinlinedviewModeldefault3(canvas, matrix, i5);
            }
        }
        canvas.restore();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 651;
            int packedPositionType = 44 - ExpandableListView.getPackedPositionType(0L);
            byte b = $$d[5];
            Object[] objArr3 = new Object[1];
            f(b, (byte) 52, b, objArr3);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(pressedStateDuration, packedPositionGroup, packedPositionType, -459846511, false, (String) objArr3[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr4 = new Object[1];
        h(new int[]{-22735506, 359870156, 2054313860, -1521288927, -1887257646, 639378484, -1730411799, -1065566857, 802168047, -806465742, -1784681013, -523567689, -1918826385, -2012778489}, 22 - (ViewConfiguration.getScrollBarSize() >> 8), objArr4);
        Class<?> cls = Class.forName((String) objArr4[0]);
        Object[] objArr5 = new Object[1];
        h(new int[]{-1578363438, 110876686, 1162806530, -1026378430, 626536448, 164681682, 1749479520, -283127778, -317707287, -1370352924}, 15 - KeyEvent.normalizeMetaState(0), objArr5);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr5[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1);
            int i8 = 651 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 44;
            byte b2 = $$d[7];
            byte b3 = b2;
            Object[] objArr6 = new Object[1];
            f(b2, b3, b3, objArr6);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(c, i8, longPressTimeout, -873460649, false, (String) objArr6[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char trimmedLength = (char) TextUtils.getTrimmedLength("");
                int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 651;
                int i9 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45;
                byte[] bArr = $$d;
                byte b4 = bArr[5];
                Object[] objArr7 = new Object[1];
                f(b4, (byte) (b4 | 36), bArr[7], objArr7);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(trimmedLength, packedPositionGroup2, i9, -1595579076, false, (String) objArr7[0], null);
            }
            Object[] objArr8 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i10 = ((int[]) objArr8[2])[0];
            int i11 = ((int[]) objArr8[0])[0];
            int i12 = (-1811424814) + (((~((~i) | 983695192)) | (-989331451)) * (-245));
            int i13 = ~(983695192 | i);
            int i14 = ((i12 + (i13 * (-245))) + ((i13 | 987126002) * 245)) - 2136647442;
            int i15 = (i14 << 13) ^ i14;
            int i16 = i15 ^ (i15 >>> 17);
        } else {
            try {
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 1610 - (ViewConfiguration.getPressedStateDuration() >> 16), 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2145681644, false, null, new Class[0]);
                }
                Object[] objArr9 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), -2136647442, 0};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    int i17 = 652 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iNormalizeMetaState = 44 - KeyEvent.normalizeMetaState(0);
                    byte b5 = $$d[7];
                    byte b6 = b5;
                    Object[] objArr10 = new Object[1];
                    f(b5, b6, b6, objArr10);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(keyRepeatTimeout, i17, iNormalizeMetaState, 2075921419, false, (String) objArr10[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 695, 98 - TextUtils.getOffsetBefore("", 0)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (TextUtils.getCapsMode("", 0, 0) + 63406), 793 - View.MeasureSpec.getMode(0), 83 - Color.green(0)), Integer.TYPE, Integer.TYPE});
                }
                Object[] objArr11 = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr9);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 651;
                    int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 44;
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[5];
                    Object[] objArr12 = new Object[1];
                    f(b7, (byte) (b7 | 36), bArr2[7], objArr12);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cIndexOf, maxKeyCode, absoluteGravity, -1595579076, false, (String) objArr12[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr11);
                try {
                    Object[] objArr13 = new Object[1];
                    h(new int[]{-22735506, 359870156, 2054313860, -1521288927, -1887257646, 639378484, -1730411799, -1065566857, 802168047, -806465742, -1784681013, -523567689, -1918826385, -2012778489}, 22 - KeyEvent.keyCodeFromString(""), objArr13);
                    Class<?> cls2 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    h(new int[]{-1578363438, 110876686, 1162806530, -1026378430, 626536448, 164681682, 1749479520, -283127778, -317707287, -1370352924}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, objArr14);
                    long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr14[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                        char cIndexOf2 = (char) TextUtils.indexOf("", "", 0, 0);
                        int maxKeyCode2 = 651 - (KeyEvent.getMaxKeyCode() >> 16);
                        int windowTouchSlop = 44 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b8 = $$d[7];
                        byte b9 = b8;
                        Object[] objArr15 = new Object[1];
                        f(b8, b9, b9, objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cIndexOf2, maxKeyCode2, windowTouchSlop, -873460649, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                        char scrollBarSize = (char) (ViewConfiguration.getScrollBarSize() >> 8);
                        int gidForName = Process.getGidForName("") + 652;
                        int pressedStateDuration2 = 44 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b10 = $$d[5];
                        Object[] objArr16 = new Object[1];
                        f(b10, (byte) 52, b10, objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(scrollBarSize, gidForName, pressedStateDuration2, -459846511, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
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
        int i18 = ((int[]) objArr[0])[0];
        int i19 = ((int[]) objArr[2])[0];
        if (i19 == i18) {
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
            int i20 = ((int[]) objArr[3])[0];
            int i21 = ((int[]) objArr[2])[0];
            int i22 = ((int[]) objArr[0])[0];
            int iMyTid = Process.myTid();
            int i23 = ~iMyTid;
            int i24 = (~(635929721 | i23)) | 35150338;
            int i25 = ~(iMyTid | (-31719529));
            int i26 = i20 + ((i24 | i25) * (-252)) + 271381393 + ((i25 | (~(i23 | 671080059))) * 252);
            int i27 = (i26 << 13) ^ i26;
            int i28 = i27 ^ (i27 >>> 17);
            ((int[]) objArr2[3])[0] = i28 ^ (i28 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[1];
            if (strArr != null) {
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
            objArr2 = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[]{i ^ (i << 5)}};
            int i29 = ((int[]) objArr[3])[0];
            int i30 = ((int[]) objArr[2])[0];
            int i31 = ((int[]) objArr[0])[0];
            int i32 = i29 + (-1374948507) + (((~((-31460011) | i)) | 34890820) * (-756)) + (((-31460011) | (~i)) * 756);
            int i33 = (i32 << 13) ^ i32;
            int i34 = i33 ^ (i33 >>> 17);
        }
        int i35 = ((int[]) objArr2[3])[0];
        int i36 = i35 * i35;
        int i37 = -(717051836 * i35);
        int i38 = (i36 ^ i37) + ((i36 & i37) << 1);
        int i39 = -(i35 * 418226374);
        int i40 = ((i38 & i39) + (i39 | i38)) - 1032255359;
        int i41 = i40 >> 27;
        int i42 = ((i41 & (-63)) + (i41 | (-63))) / 32;
        int i43 = (i42 ^ 1) + ((i42 & 1) << 1);
        int i44 = (i40 & i43) + (i43 | i40);
        int i45 = i40 >> 17;
        int i46 = (((-65535) & i45) + (i45 | (-65535))) / 32768;
        int i47 = -((((i46 | 1) << 1) - (i46 ^ 1)) ^ i44);
        int i48 = (i47 & 2) + (i47 | 2);
        int i49 = (((i48 >> 26) + ComposerKt.defaultsKey) / 64) + 1;
        int i50 = 6994 / (((-(((i49 | 1) << 1) - (i49 ^ 1))) & i48) * 269);
        int i51 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i51 > 0) {
            int i52 = cancelAll + 37;
            INotificationSideChannel = i52 % 128;
            if (i52 % 2 == 0) {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i51 >>> 1;
            } else {
                prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i51 - 1;
            }
        }
    }

    @Override // defpackage.fromMediaSession, defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        int i = 2 % 2;
        super.b(rectF, matrix, z);
        int size = this.f900a.size() - 1;
        while (size >= 0) {
            int i2 = cancelAll + 61;
            INotificationSideChannel = i2 % 128;
            if (i2 % 2 == 0) {
                this.cancel.set(1.0f, 0.0f, 1.0f, 2.0f);
                this.f900a.get(size).b(this.cancel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, true);
                rectF.union(this.cancel);
                size += 84;
            } else {
                this.cancel.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f900a.get(size).b(this.cancel, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, true);
                rectF.union(this.cancel);
                size--;
            }
            int i3 = cancelAll + 37;
            INotificationSideChannel = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // defpackage.fromMediaSession
    public final void b(float f) {
        int i = 2 % 2;
        super.b(f);
        if (this.onTransact != null) {
            int i2 = INotificationSideChannel + 21;
            cancelAll = i2 % 128;
            int i3 = i2 % 2;
            previous previousVar = this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            f = ((this.onTransact.asInterface().floatValue() * this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3) - this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.onTransact) / ((previousVar.TuitionPaymentFragmentbindingInflater1 - previousVar.onTransact) + 0.01f);
        }
        if (this.onTransact == null) {
            int i4 = INotificationSideChannel + 49;
            cancelAll = i4 % 128;
            if (i4 % 2 != 0) {
                Layer layer = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                float f2 = layer.INotificationSideChannelStub;
                previous previousVar2 = layer.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                f %= f2 * (previousVar2.TuitionPaymentFragmentbindingInflater1 - previousVar2.onTransact);
            } else {
                Layer layer2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                float f3 = layer2.INotificationSideChannelStub;
                previous previousVar3 = layer2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                f -= f3 / (previousVar3.TuitionPaymentFragmentbindingInflater1 - previousVar3.onTransact);
            }
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat != 0.0f) {
            f /= this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.MediaBrowserCompat;
        }
        for (int size = this.f900a.size() - 1; size >= 0; size--) {
            this.f900a.get(size).b(f);
        }
        int i5 = INotificationSideChannel + 99;
        cancelAll = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // defpackage.fromMediaSession
    protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        int i2 = 2 % 2;
        int i3 = INotificationSideChannel + 51;
        cancelAll = i3 % 128;
        int i4 = i3 % 2;
        for (int i5 = 0; i5 < this.f900a.size(); i5++) {
            this.f900a.get(i5).TuitionPaymentFragmentspecialinlinedviewModeldefault3(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2);
        }
        int i6 = cancelAll + 91;
        INotificationSideChannel = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    @Override // defpackage.fromMediaSession, defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        int i = 2 % 2;
        int i2 = INotificationSideChannel + 33;
        cancelAll = i2 % 128;
        int i3 = i2 % 2;
        super.b(t, mediaSessionCompatCallbackCallbackHandler);
        if (t == registerCallbackListener.MediaBrowserCompat) {
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                binderDied<Float, Float> binderdied = this.onTransact;
                if (binderdied != null) {
                    int i4 = cancelAll + 31;
                    INotificationSideChannel = i4 % 128;
                    if (i4 % 2 != 0) {
                        binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                        return;
                    } else {
                        binderdied.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
                        int i5 = 2 / 0;
                        return;
                    }
                }
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.onTransact = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            binderDied<Float, Float> binderdied2 = this.onTransact;
            if (binderdied2 != null) {
                int i6 = INotificationSideChannel + 15;
                cancelAll = i6 % 128;
                if (i6 % 2 == 0) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
                } else {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$j(short r6, int r7, short r8) {
        /*
            byte[] r0 = defpackage.ensureClassLoader.$$h
            int r6 = r6 * 56
            int r6 = r6 + 66
            int r7 = r7 * 2
            int r7 = 1 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ensureClassLoader.$$j(short, int, short):java.lang.String");
    }
}
