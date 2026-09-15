package io.reactivex.internal.operators.single;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import defpackage.BufferProviderState;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.deriveCodec;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import defpackage.initSession;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleFlatMap<T, R> extends deriveCodec<R> {
    private generateBackupProfile<? extends T> TuitionPaymentFragmentbindingInflater1;
    private readableMs<? super T, ? extends generateBackupProfile<? extends R>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SingleFlatMap(generateBackupProfile<? extends T> generatebackupprofile, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentbindingInflater1 = generatebackupprofile;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new SingleFlatMapCallback(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    static final class SingleFlatMapCallback<T, R> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T>, BufferProviderState {
        private static final long serialVersionUID = 3258103020495908596L;
        final getDefaultVideoProfile<? super R> downstream;
        final readableMs<? super T, ? extends generateBackupProfile<? extends R>> mapper;

        SingleFlatMapCallback(getDefaultVideoProfile<? super R> getdefaultvideoprofile, readableMs<? super T, ? extends generateBackupProfile<? extends R>> readablems) {
            this.downstream = getdefaultvideoprofile;
            this.mapper = readablems;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            try {
                generateBackupProfile generatebackupprofile = (generateBackupProfile) share.b(this.mapper.apply(t), "The single returned by the mapper is null");
                if (isDisposed()) {
                    return;
                }
                generatebackupprofile.TuitionPaymentFragmentbindingInflater1(new TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, this.downstream));
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.downstream.onError(th);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            this.downstream.onError(th);
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3<R> implements getDefaultVideoProfile<R> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static short[] f1212a;
            private AtomicReference<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            private getDefaultVideoProfile<? super R> b;
            private static final byte[] $$c = {19, 78, 114, 113};
            private static final int $$f = 153;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {109, 84, -87, -114, -10, 4, 65, -52, 5, -17, 21, -1, -9, 10, 59, -49, -11, 12, -12, 5, 8, 7, 56, -66, -1, 10, 65, -57, -3, -4, 17, -11, 6, 15, -9, 64, -52, -9, 4, 14, -6, -3, 66, -67, 18, -10, 1, 13, 57, -34, -33, 10, 46, -32, -15, 13, -4, 3, 29, -14, -10, 1, 13, 67, -77, 16, -7, 12, 37, -32, -15, 13, -4, 3, 76, -12, 16, -12, -31, 14, -9, 13, -4, 3, 32, -15, -22, 14, 10, -7, -4, 48, -42, 19, -4, -4, 10, -7, -4, 20, -5, -3, 12, -3, -3, 9, 32, -35, 10, -4, 13, -17, 17, -11, 67};
            private static final int $$e = 185;
            private static final byte[] $$a = {21, ByteCompanionObject.MAX_VALUE, 49, -115, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54};
            private static final int $$b = 242;
            private static int asBinder = 0;
            private static int d = 1;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1315440140;
            private static int TuitionPaymentFragmentbindingInflater1 = -1934795603;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1431509060;
            private static byte[] asInterface = {106, -98, 97, 75, -68, 106, -109, 99, -104, 76, 79, -39, 110, 35, -88, -103, -104, 103, 116, -100, 119, -55, -35, -54, -39, -92, -43, -84, -61, -48, -49, -36, -96, -54, -40, 41, 94, 46, 39, 11, 10, 104, 38, 50, 90, -29, 114, 84, 58, 88, -28, 16, -53, 58, 16, -11, -4, 54, -32, -22, 16, -31, -20, -28, 26, -26, -26, -26, -26};

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(byte r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r7 = r7 * 3
                    int r7 = 84 - r7
                    int r5 = r5 * 52
                    int r5 = 107 - r5
                    byte[] r0 = io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$a
                    int r6 = r6 * 15
                    int r1 = 53 - r6
                    byte[] r1 = new byte[r1]
                    int r6 = 52 - r6
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r6
                    r4 = r2
                    goto L2c
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L28:
                    int r5 = r5 + 1
                    r3 = r0[r5]
                L2c:
                    int r7 = r7 + r3
                    int r7 = r7 + (-11)
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.c(byte, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0029  */
            /* JADX WARN: Code duplicated, block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void f(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 * 74
                    int r7 = 78 - r7
                    int r8 = r8 * 15
                    int r8 = r8 + 84
                    byte[] r0 = io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$d
                    int r6 = r6 * 37
                    int r1 = 75 - r6
                    byte[] r1 = new byte[r1]
                    int r6 = 74 - r6
                    r2 = 0
                    if (r0 != 0) goto L19
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2f
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L29
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L29:
                    r3 = r0[r7]
                    r5 = r8
                    r8 = r7
                    r7 = r3
                    r3 = r5
                L2f:
                    int r7 = -r7
                    int r3 = r3 + r7
                    int r7 = r3 + 2
                    int r8 = r8 + 1
                    r3 = r4
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.f(short, int, int, java.lang.Object[]):void");
            }

            TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReference<BufferProviderState> atomicReference, getDefaultVideoProfile<? super R> getdefaultvideoprofile) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReference;
                this.b = getdefaultvideoprofile;
            }

            private static void e(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
                int i4;
                boolean z;
                int length;
                byte[] bArr;
                int i5;
                int i6 = 2 % 2;
                SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        char cMyPid = (char) (Process.myPid() >> 22);
                        int iResolveSizeAndState = 2267 - View.resolveSizeAndState(0, 0, 0);
                        int mode = View.MeasureSpec.getMode(0) + 33;
                        byte length2 = (byte) $$c.length;
                        byte b2 = (byte) (length2 - 4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, iResolveSizeAndState, mode, 1387473586, false, $$g(length2, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                    if (iIntValue == -1) {
                        int i7 = $10;
                        int i8 = i7 + 23;
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        int i10 = i7 + 121;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    if (i4 != 0) {
                        byte[] bArr2 = asInterface;
                        if (bArr2 != null) {
                            int length3 = bArr2.length;
                            byte[] bArr3 = new byte[length3];
                            for (int i12 = 0; i12 < length3; i12++) {
                                Object[] objArr3 = {Integer.valueOf(bArr2[i12])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b3 = (byte) 0;
                                    byte b4 = b3;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.myTid() >> 22) + 3358, 18 - View.resolveSizeAndState(0, 0, 0), -1054011043, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                                }
                                bArr3[i12] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 != null) {
                            int i13 = $11 + 113;
                            $10 = i13 % 128;
                            int i14 = i13 % 2;
                            byte[] bArr4 = asInterface;
                            Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char c = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int pressedStateDuration = 2267 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int minimumFlingVelocity = 33 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                byte length4 = (byte) $$c.length;
                                byte b5 = (byte) (length4 - 4);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, pressedStateDuration, minimumFlingVelocity, 1387473586, false, $$g(length4, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        } else {
                            iIntValue = (short) (((short) (((long) f1212a[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        }
                    }
                    if (iIntValue > 0) {
                        int i15 = $11 + 43;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - 2) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i4;
                        try {
                            Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault1), sb};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                byte b6 = (byte) 3;
                                byte b7 = (byte) (b6 - 3);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2854, TextUtils.lastIndexOf("", '0', 0, 0) + 14, -1529949196, false, $$g(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                            }
                            ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            byte[] bArr5 = asInterface;
                            if (bArr5 != null) {
                                int i17 = $10 + 69;
                                $11 = i17 % 128;
                                if (i17 % 2 == 0) {
                                    length = bArr5.length;
                                    bArr = new byte[length];
                                    i5 = 1;
                                } else {
                                    length = bArr5.length;
                                    bArr = new byte[length];
                                    i5 = 0;
                                }
                                while (i5 < length) {
                                    bArr[i5] = (byte) (((long) bArr5[i5]) ^ 3046761265686732006L);
                                    i5++;
                                }
                                bArr5 = bArr;
                            }
                            if (bArr5 != null) {
                                int i18 = $11 + 13;
                                $10 = i18 % 128;
                                int i19 = i18 % 2;
                                z = true;
                            } else {
                                z = false;
                            }
                            sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                            while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                                int i20 = $11 + 79;
                                $10 = i20 % 128;
                                if (i20 % 2 != 0) {
                                    throw null;
                                }
                                if (!z) {
                                    short[] sArr = f1212a;
                                    int i21 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i21 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i21]) ^ 3046761265686732006L)) + s)) ^ b));
                                } else {
                                    byte[] bArr6 = asInterface;
                                    int i22 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i22 - 1;
                                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i22]) ^ 3046761265686732006L)) + s)) ^ b));
                                }
                                sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                                int i23 = $11 + 57;
                                $10 = i23 % 128;
                                int i24 = i23 % 2;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    objArr[0] = sb.toString();
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onSubscribe(BufferProviderState bufferProviderState) throws Throwable {
                Object[] objArr;
                int i = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 43042);
                    int iGreen = 3111 - Color.green(0);
                    int modifierMetaStateMask = 21 - ((byte) KeyEvent.getModifierMetaStateMask());
                    byte[] bArr = $$a;
                    byte b = bArr[37];
                    byte b2 = bArr[7];
                    Object[] objArr2 = new Object[1];
                    c(b, b2, b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cResolveSizeAndState, iGreen, modifierMetaStateMask, -1272852037, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                e((-637647609) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), Color.blue(0) - 53, (short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 124), (byte) (ViewConfiguration.getEdgeSlop() >> 16), (-1027253522) - Color.alpha(0), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                e(ExpandableListView.getPackedPositionChild(0L) - 637647604, (-60) - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) ((-56) - TextUtils.lastIndexOf("", '0', 0, 0)), (byte) Color.red(0), (-1027253501) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 43042);
                    int mode = View.MeasureSpec.getMode(0) + 3111;
                    int i2 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 21;
                    byte[] bArr2 = $$a;
                    byte b3 = bArr2[132];
                    byte b4 = bArr2[7];
                    Object[] objArr5 = new Object[1];
                    c(b3, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, mode, i2, -1269618118, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43042);
                        int i3 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3110;
                        int i4 = 22 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b5 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        c(b5, bArr3[132], b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(keyRepeatTimeout, i3, i4, 154975793, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    int i5 = ((int[]) objArr7[2])[0];
                    int i6 = ((int[]) objArr7[1])[0];
                    String[] strArr = (String[]) objArr7[3];
                    int[] iArr = {i5};
                    int[] iArr2 = {i6};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i7 = ~iIdentityHashCode;
                    int i8 = 6130834 + (((~((-805454633) | i7)) | (~(805454632 | iIdentityHashCode))) * 520);
                    int i9 = ~((-805454633) | i7);
                    int i10 = ~(iIdentityHashCode | 899576826);
                    int i11 = i8 + ((i9 | i10) * (-1040)) + ((i10 | (~(i7 | (-899576827)))) * 520) + 567881529;
                    int i12 = (i11 << 13) ^ i11;
                    int i13 = i12 ^ (i12 >>> 17);
                    ((int[]) objArr[0])[0] = i13 ^ (i13 << 5);
                    objArr = new Object[]{new int[1], iArr2, iArr, strArr};
                } else {
                    Object[] objArr8 = new Object[1];
                    e((-637647600) - View.MeasureSpec.getSize(0), (-58) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 56), (byte) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1027253488, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    e((-637647601) - TextUtils.getTrimmedLength(""), Color.alpha(0) - 59, (short) ExpandableListView.getPackedPositionChild(0L), (byte) ExpandableListView.getPackedPositionType(0L), Drawable.resolveOpacity(0, 0) - 1027253472, objArr9);
                    int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                    int i14 = d + 83;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    try {
                        Object[] objArr10 = {null, Integer.valueOf(iIntValue), 0, 567881529};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[46];
                        byte b7 = (byte) (b6 - 1);
                        byte b8 = b6;
                        Object[] objArr11 = new Object[1];
                        f(b7, b8, b8, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b9 = bArr4[46];
                        byte b10 = (byte) (b9 - 1);
                        Object[] objArr12 = new Object[1];
                        f(b9, b10, b10, objArr12);
                        Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Class.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-308143642);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            char packedPositionChild = (char) (43041 - ExpandableListView.getPackedPositionChild(0L));
                            int i16 = 3110 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            int iAxisFromString = 21 - MotionEvent.axisFromString("");
                            byte[] bArr5 = $$a;
                            byte b11 = bArr5[7];
                            Object[] objArr14 = new Object[1];
                            c(b11, bArr5[132], b11, objArr14);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionChild, i16, iAxisFromString, 154975793, false, (String) objArr14[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                        try {
                            Object[] objArr15 = new Object[1];
                            e((-637647609) - TextUtils.getTrimmedLength(""), View.getDefaultSize(0, 0) - 53, (short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 123), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1027253523, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            e(ExpandableListView.getPackedPositionChild(0L) - 637647604, (-60) - View.MeasureSpec.getMode(0), (short) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 55), (byte) (Color.rgb(0, 0, 0) + 16777216), (-1027253501) - Color.green(0), objArr16);
                            long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1355648493);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                char cRgb = (char) ((-16734174) - Color.rgb(0, 0, 0));
                                int doubleTapTimeout = 3111 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                int i17 = 23 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                byte[] bArr6 = $$a;
                                byte b12 = bArr6[132];
                                byte b13 = bArr6[7];
                                Object[] objArr17 = new Object[1];
                                c(b12, b13, b13, objArr17);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, doubleTapTimeout, i17, -1269618118, false, (String) objArr17[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1354724972);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char cResolveSize = (char) (43042 - View.resolveSize(0, 0));
                                int mode2 = 3111 - View.MeasureSpec.getMode(0);
                                int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                                byte[] bArr7 = $$a;
                                byte b14 = bArr7[37];
                                byte b15 = bArr7[7];
                                Object[] objArr18 = new Object[1];
                                c(b14, b15, b15, objArr18);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveSize, mode2, scrollBarFadeDuration, -1272852037, false, (String) objArr18[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            objArr = objArr13;
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
                int i18 = ((int[]) objArr[1])[0];
                int i19 = ((int[]) objArr[2])[0];
                if (i19 == i18) {
                    int i20 = d + 23;
                    asBinder = i20 % 128;
                    int i21 = i20 % 2;
                    int i22 = ((int[]) objArr[0])[0];
                    int i23 = ((int[]) objArr[2])[0];
                    int i24 = ((int[]) objArr[1])[0];
                    String[] strArr2 = (String[]) objArr[3];
                    int[] iArr3 = {i23};
                    int iIdentityHashCode2 = System.identityHashCode(this);
                    int i25 = ~iIdentityHashCode2;
                    int i26 = i22 + (-481075850) + ((~((-1649890212) | i25)) * 979) + ((iIdentityHashCode2 | 55141247) * (-979)) + (((~(iIdentityHashCode2 | (-1649890212))) | (~(i25 | 55141247))) * 979);
                    int i27 = (i26 << 13) ^ i26;
                    int i28 = i27 ^ (i27 >>> 17);
                    ((int[]) objArr[0])[0] = i28 ^ (i28 << 5);
                    Object[] objArr19 = {new int[1], new int[]{i24}, iArr3, strArr2};
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr3 = (String[]) objArr[3];
                    if (strArr3 != null) {
                        int i29 = d + 11;
                        asBinder = i29 % 128;
                        int i30 = i29 % 2;
                        for (String str : strArr3) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i19 / (((i19 - 1) * i19) % 2), 0).show();
                    int i31 = ((int[]) objArr[0])[0];
                    int i32 = ((int[]) objArr[2])[0];
                    int i33 = ((int[]) objArr[1])[0];
                    String[] strArr4 = (String[]) objArr[3];
                    int iIdentityHashCode3 = System.identityHashCode(this);
                    int i34 = i31 + ((((-126561240) + (((-33554435) | iIdentityHashCode3) * (-381))) + (((~((~iIdentityHashCode3) | 838839184)) | (-39755779)) * 381)) - 100662534);
                    int i35 = (i34 << 13) ^ i34;
                    int i36 = i35 ^ (i35 >>> 17);
                    ((int[]) objArr[0])[0] = i36 ^ (i36 << 5);
                    Object[] objArr20 = {new int[1], new int[]{i33}, new int[]{i32}, strArr4};
                }
                DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState);
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void b(R r) {
                int i = 2 % 2;
                int i2 = asBinder + 89;
                d = i2 % 128;
                int i3 = i2 % 2;
                this.b.b(r);
                int i4 = asBinder + 51;
                d = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onError(Throwable th) {
                int i = 2 % 2;
                int i2 = d + 51;
                asBinder = i2 % 128;
                int i3 = i2 % 2;
                this.b.onError(th);
                int i4 = asBinder + 93;
                d = i4 % 128;
                int i5 = i4 % 2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0022  */
            /* JADX WARN: Code duplicated, block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r7, short r8, byte r9) {
                /*
                    int r8 = r8 * 2
                    int r8 = r8 + 1
                    int r9 = r9 + 4
                    int r7 = 121 - r7
                    byte[] r0 = io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$c
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r9
                    r4 = r2
                    goto L27
                L12:
                    r3 = r2
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    int r9 = r9 + 1
                    if (r4 != r8) goto L22
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L22:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L27:
                    int r7 = r7 + r9
                    r9 = r3
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleFlatMap.SingleFlatMapCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3.$$g(byte, short, byte):java.lang.String");
            }
        }
    }
}
