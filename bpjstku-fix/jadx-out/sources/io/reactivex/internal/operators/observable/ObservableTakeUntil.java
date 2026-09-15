package io.reactivex.internal.operators.observable;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.abt.R;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveMediaType;
import defpackage.initSession;
import defpackage.isRealmeC2;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTakeUntil<T, U> extends notifySuspended<T, T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public ObservableTakeUntil(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_VideoValidatedEncoderProfilesProxy2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(derivemediatype);
        derivemediatype.onSubscribe(takeUntilMainObserver);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.subscribe(takeUntilMainObserver.otherObserver);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(takeUntilMainObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 1418547743690811973L;
        final deriveMediaType<? super T> downstream;
        final AtomicReference<BufferProviderState> upstream = new AtomicReference<>();
        final TakeUntilMainObserver<T, U>.OtherObserver otherObserver = new OtherObserver();
        final AtomicThrowable error = new AtomicThrowable();

        TakeUntilMainObserver(deriveMediaType<? super T> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            isRealmeC2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.downstream, t, this, this.error);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
            deriveMediaType<? super T> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                if (getAndIncrement() == 0) {
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
            deriveMediaType<? super T> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (getAndIncrement() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }

        final class OtherObserver extends AtomicReference<BufferProviderState> implements deriveMediaType<U> {
            private static final byte[] $$a = {31, 115, -100, -11, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
            private static final int $$b = 142;
            private static final long serialVersionUID = -8693423678067375039L;

            /* JADX WARN: Code duplicated, block: B:10:0x0028  */
            /* JADX WARN: Code duplicated, block: B:8:0x0020  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(int r7, short r8, byte r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 + 4
                    int r7 = r7 * 15
                    int r7 = r7 + 38
                    byte[] r0 = io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilMainObserver.OtherObserver.$$a
                    int r9 = r9 * 3
                    int r9 = r9 + 84
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L15
                    r3 = r7
                    r9 = r8
                    r5 = r2
                    goto L2a
                L15:
                    r3 = r2
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L19:
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L28
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L28:
                    r3 = r0[r9]
                L2a:
                    int r8 = r8 + r3
                    int r9 = r9 + 1
                    int r8 = r8 + (-11)
                    r3 = r5
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilMainObserver.OtherObserver.a(int, short, byte, java.lang.Object[]):void");
            }

            OtherObserver() {
            }

            @Override // defpackage.deriveMediaType
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.deriveMediaType
            public final void onNext(U u) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                TakeUntilMainObserver.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }

            @Override // defpackage.deriveMediaType
            public final void onError(Throwable th) throws Throwable {
                Object[] objArr;
                TakeUntilMainObserver takeUntilMainObserver = TakeUntilMainObserver.this;
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(takeUntilMainObserver.upstream);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char modifierMetaStateMask = (char) (29943 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1755;
                    int i = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 23;
                    byte b = $$a[7];
                    byte b2 = b;
                    Object[] objArr2 = new Object[1];
                    a(b, b2, b2, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, tapTimeout, i, 986134021, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                long jLongValue = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cIndexOf = (char) (29943 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int mirror = AndroidCharacter.getMirror('0') + 1707;
                    int i2 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 23;
                    byte[] bArr = $$a;
                    byte b3 = bArr[28];
                    Object[] objArr3 = new Object[1];
                    a(b3, (byte) (b3 | 36), bArr[7], objArr3);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cIndexOf, mirror, i2, 1596667560, false, (String) objArr3[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char c = (char) (29945 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1755;
                        int iAxisFromString = MotionEvent.axisFromString("") + 24;
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[28];
                        Object[] objArr4 = new Object[1];
                        a(b4, (byte) (b4 | 88), bArr2[7], objArr4);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, maxKeyCode, iAxisFromString, 1599039318, false, (String) objArr4[0], null);
                    }
                    Object[] objArr5 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr5[0])[0]}, new int[]{((int[]) objArr5[1])[0]}, (Object[]) objArr5[2], new int[1], (String[]) objArr5[4]};
                    int iIdentityHashCode = System.identityHashCode(this);
                    int i3 = ((1010136612 + (((~((~iIdentityHashCode) | 651713890)) | 405013000) * 529)) + (((~(iIdentityHashCode | 651713890)) | 439111464) * 529)) - 1202730923;
                    int i4 = (i3 << 13) ^ i3;
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[3])[0] = i5 ^ (i5 << 5);
                } else {
                    int iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, takeUntilMainObserver)).intValue();
                    try {
                        Object[] objArr6 = {1988763980};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(2063193834);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (42049 - (ViewConfiguration.getScrollBarSize() >> 8)), View.combineMeasuredStates(0, 0) + 1726, View.combineMeasuredStates(0, 0) + 29, -1637387971, false, null, new Class[]{Integer.TYPE});
                        }
                        Object[] objArrTuitionPaymentFragmentbindingInflater1$5f1425da = R.layout.TuitionPaymentFragmentbindingInflater1$5f1425da(iIntValue, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(objArr6), -1202730923);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1143881599);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c2 = (char) (29944 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1755;
                            int iMakeMeasureSpec = 23 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr3 = $$a;
                            byte b5 = bArr3[28];
                            Object[] objArr7 = new Object[1];
                            a(b5, (byte) (b5 | 88), bArr3[7], objArr7);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c2, pressedStateDuration, iMakeMeasureSpec, 1599039318, false, (String) objArr7[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, objArrTuitionPaymentFragmentbindingInflater1$5f1425da);
                        try {
                            long jLongValue2 = ((Long) Class.forName("android.os.SystemClock").getDeclaredMethod("elapsedRealtime", new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1145728641);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                char jumpTapTimeout = (char) (29944 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                int maximumDrawingCacheSize = 1755 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                int i6 = 24 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte[] bArr4 = $$a;
                                byte b6 = bArr4[28];
                                Object[] objArr8 = new Object[1];
                                a(b6, (byte) (b6 | 36), bArr4[7], objArr8);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(jumpTapTimeout, maximumDrawingCacheSize, i6, 1596667560, false, (String) objArr8[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-564555310);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 29945);
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1756;
                                int iRgb = (-16777193) - Color.rgb(0, 0, 0);
                                byte b7 = $$a[7];
                                byte b8 = b7;
                                Object[] objArr9 = new Object[1];
                                a(b7, b8, b8, objArr9);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(packedPositionChild, iIndexOf, iRgb, 986134021, false, (String) objArr9[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf2);
                            objArr = objArrTuitionPaymentFragmentbindingInflater1$5f1425da;
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i7 = ((int[]) objArr[1])[0];
                int i8 = ((int[]) objArr[0])[0];
                if (i8 == i7) {
                    int i9 = ((int[]) objArr[3])[0];
                    Object[] objArr10 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iMyPid = Process.myPid();
                    int i10 = ~iMyPid;
                    int i11 = i9 + (-1865936195) + (((~(99543808 | i10)) | 113058617) * (-328)) + ((iMyPid | 113058617) * 164) + (((~(iMyPid | (-99543809))) | 78390016 | (~(i10 | 134212409))) * 164);
                    int i12 = (i11 << 13) ^ i11;
                    int i13 = i12 ^ (i12 >>> 17);
                    ((int[]) objArr10[3])[0] = i13 ^ (i13 << 5);
                } else {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[4];
                    if (strArr != null) {
                        for (String str : strArr) {
                            arrayList.add(str);
                        }
                    }
                    Toast.makeText((Context) null, i8 / (((i8 - 1) * i8) % 2), 0).show();
                    int i14 = ((int[]) objArr[3])[0];
                    Object[] objArr11 = {new int[]{((int[]) objArr[0])[0]}, new int[]{((int[]) objArr[1])[0]}, (Object[]) objArr[2], new int[1], (String[]) objArr[4]};
                    int iNextInt = new Random().nextInt(583313143);
                    int i15 = ~iNextInt;
                    int i16 = i14 + 373762887 + (((~((-269877249) | i15)) | (~((-679477282) | iNextInt)) | (~(1006629351 | iNextInt))) * 765) + (((~((-949354530) | i15)) | 269877248) * 1530) + (((~(iNextInt | (-949354530))) | (~(i15 | 1006629351))) * 765);
                    int i17 = (i16 << 13) ^ i16;
                    int i18 = i17 ^ (i17 >>> 17);
                    ((int[]) objArr11[3])[0] = i18 ^ (i18 << 5);
                }
                deriveMediaType<? super T> derivemediatype = takeUntilMainObserver.downstream;
                AtomicThrowable atomicThrowable = takeUntilMainObserver.error;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                    if (takeUntilMainObserver.getAndIncrement() == 0) {
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }

            @Override // defpackage.deriveMediaType
            public final void onComplete() {
                TakeUntilMainObserver.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            deriveMediaType<? super T> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (getAndIncrement() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }
    }
}
