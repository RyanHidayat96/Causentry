package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class stop implements unregisterCallbackListener, binderDied.b, getMediaController {
    private final String INotificationSideChannel;
    private final GradientType INotificationSideChannelDefault;
    private final binderDied<PointF, PointF> INotificationSideChannelStubProxy;
    private final RectF TuitionPaymentFragmentbindingInflater1;
    private binderDied<ColorFilter, ColorFilter> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private processPendingCallbacksLocked TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final binderDied<getAudioAttributes, getAudioAttributes> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final binderDied<PointF, PointF> asBinder;
    private final boolean asInterface;
    private final int b;
    private final Paint cancel;
    private final Path cancelAll;
    private final fromMediaSession d;
    private final prepare g;
    private final binderDied<Integer, Integer> notify;
    private final List<getPlaybackInfo> onTransact;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f1407a = new LongSparseArray<>();
    private final LongSparseArray<RadialGradient> RemoteActionCompatParcelizer = new LongSparseArray<>();

    public stop(prepare prepareVar, fromMediaSession frommediasession, getLegacyAudioStream getlegacyaudiostream) {
        Path path = new Path();
        this.cancelAll = path;
        this.cancel = new setVolumeTo(1);
        this.TuitionPaymentFragmentbindingInflater1 = new RectF();
        this.onTransact = new ArrayList();
        this.d = frommediasession;
        this.INotificationSideChannel = getlegacyaudiostream.asBinder;
        this.asInterface = getlegacyaudiostream.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        this.g = prepareVar;
        this.INotificationSideChannelDefault = getlegacyaudiostream.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        path.setFillType(getlegacyaudiostream.b);
        previous previousVar = prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        this.b = (int) (((long) (((previousVar.TuitionPaymentFragmentbindingInflater1 - previousVar.onTransact) / previousVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) * 1000.0f)) / 32.0f);
        binderDied<getAudioAttributes, getAudioAttributes> binderdiedTuitionPaymentFragmentbindingInflater1 = getlegacyaudiostream.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = binderdiedTuitionPaymentFragmentbindingInflater1;
        binderdiedTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater1);
        binderDied<Integer, Integer> binderdiedTuitionPaymentFragmentbindingInflater2 = getlegacyaudiostream.g.TuitionPaymentFragmentbindingInflater1();
        this.notify = binderdiedTuitionPaymentFragmentbindingInflater2;
        binderdiedTuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater2);
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater3 = getlegacyaudiostream.f951a.TuitionPaymentFragmentbindingInflater1();
        this.INotificationSideChannelStubProxy = binderdiedTuitionPaymentFragmentbindingInflater3;
        binderdiedTuitionPaymentFragmentbindingInflater3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater3);
        binderDied<PointF, PointF> binderdiedTuitionPaymentFragmentbindingInflater4 = getlegacyaudiostream.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1();
        this.asBinder = binderdiedTuitionPaymentFragmentbindingInflater4;
        binderdiedTuitionPaymentFragmentbindingInflater4.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
        frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdiedTuitionPaymentFragmentbindingInflater4);
    }

    @Override // binderDied.b
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.g.invalidateSelf();
    }

    @Override // defpackage.setRepeatMode
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<setRepeatMode> list, List<setRepeatMode> list2) {
        for (int i = 0; i < list2.size(); i++) {
            setRepeatMode setrepeatmode = list2.get(i);
            if (setrepeatmode instanceof getPlaybackInfo) {
                this.onTransact.add((getPlaybackInfo) setrepeatmode);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.unregisterCallbackListener
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Canvas canvas, Matrix matrix, int i) {
        RadialGradient radialGradient;
        if (this.asInterface) {
            return;
        }
        this.cancelAll.reset();
        for (int i2 = 0; i2 < this.onTransact.size(); i2++) {
            this.cancelAll.addPath(this.onTransact.get(i2).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
        }
        this.cancelAll.computeBounds(this.TuitionPaymentFragmentbindingInflater1, false);
        if (this.INotificationSideChannelDefault == GradientType.LINEAR) {
            long jTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1();
            radialGradient = this.f1407a.get(jTuitionPaymentFragmentbindingInflater1);
            if (radialGradient == null) {
                PointF pointFAsInterface = this.INotificationSideChannelStubProxy.asInterface();
                PointF pointFAsInterface2 = this.asBinder.asInterface();
                getAudioAttributes getaudioattributesAsInterface = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface();
                LinearGradient linearGradient = new LinearGradient(pointFAsInterface.x, pointFAsInterface.y, pointFAsInterface2.x, pointFAsInterface2.y, TuitionPaymentFragmentspecialinlinedviewModeldefault3(getaudioattributesAsInterface.b), getaudioattributesAsInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault1, Shader.TileMode.CLAMP);
                this.f1407a.put(jTuitionPaymentFragmentbindingInflater1, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long jTuitionPaymentFragmentbindingInflater2 = TuitionPaymentFragmentbindingInflater1();
            radialGradient = this.RemoteActionCompatParcelizer.get(jTuitionPaymentFragmentbindingInflater2);
            if (radialGradient == null) {
                PointF pointFAsInterface3 = this.INotificationSideChannelStubProxy.asInterface();
                PointF pointFAsInterface4 = this.asBinder.asInterface();
                getAudioAttributes getaudioattributesAsInterface2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface();
                int[] iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3(getaudioattributesAsInterface2.b);
                float[] fArr = getaudioattributesAsInterface2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                float f = pointFAsInterface3.x;
                float f2 = pointFAsInterface3.y;
                float fHypot = (float) Math.hypot(pointFAsInterface4.x - f, pointFAsInterface4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f, f2, fHypot, iArrTuitionPaymentFragmentspecialinlinedviewModeldefault3, fArr, Shader.TileMode.CLAMP);
                this.RemoteActionCompatParcelizer.put(jTuitionPaymentFragmentbindingInflater2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.cancel.setShader(radialGradient);
        binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (binderdied != null) {
            this.cancel.setColorFilter(binderdied.asInterface());
        }
        this.cancel.setAlpha(onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3((int) ((((i / 255.0f) * this.notify.asInterface().intValue()) / 100.0f) * 255.0f)));
        canvas.drawPath(this.cancelAll, this.cancel);
        int i3 = prepareFromSearch.TuitionPaymentFragmentbindingInflater1;
        if (i3 > 0) {
            prepareFromSearch.TuitionPaymentFragmentbindingInflater1 = i3 - 1;
        }
    }

    @Override // defpackage.unregisterCallbackListener
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        this.cancelAll.reset();
        for (int i = 0; i < this.onTransact.size(); i++) {
            this.cancelAll.addPath(this.onTransact.get(i).TuitionPaymentFragmentspecialinlinedviewModeldefault2(), matrix);
        }
        this.cancelAll.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // defpackage.setRepeatMode
    public final String b() {
        return this.INotificationSideChannel;
    }

    private int TuitionPaymentFragmentbindingInflater1() {
        int iRound = Math.round(this.INotificationSideChannelStubProxy.b() * this.b);
        int iRound2 = Math.round(this.asBinder.b() * this.b);
        int iRound3 = Math.round(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b() * this.b);
        int i = iRound != 0 ? iRound * 527 : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }

    private int[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int[] iArr) {
        processPendingCallbacksLocked processpendingcallbackslocked = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (processpendingcallbackslocked != null) {
            Integer[] numArr = (Integer[]) processpendingcallbackslocked.asInterface();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.getAudioStream
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo, int i, List<MediaControllerCompatPlaybackInfo> list, MediaControllerCompatPlaybackInfo mediaControllerCompatPlaybackInfo2) {
        onSetRepeatMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaControllerCompatPlaybackInfo, i, list, mediaControllerCompatPlaybackInfo2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.getAudioStream
    public final <T> void b(T t, MediaSessionCompatCallbackCallbackHandler<T> mediaSessionCompatCallbackCallbackHandler) {
        if (t == registerCallbackListener.asBinder) {
            this.notify.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mediaSessionCompatCallbackCallbackHandler);
            return;
        }
        if (t == registerCallbackListener.TuitionPaymentFragmentbindingInflater1) {
            binderDied<ColorFilter, ColorFilter> binderdied = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (binderdied != null) {
                this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(binderdied);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = processpendingcallbackslocked;
            processpendingcallbackslocked.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession = this.d;
            binderDied<ColorFilter, ColorFilter> binderdied2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (binderdied2 != null) {
                frommediasession.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(binderdied2);
                return;
            }
            return;
        }
        if (t == registerCallbackListener.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            processPendingCallbacksLocked processpendingcallbackslocked2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (processpendingcallbackslocked2 != null) {
                this.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1.remove(processpendingcallbackslocked2);
            }
            if (mediaSessionCompatCallbackCallbackHandler == null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = null;
                return;
            }
            processPendingCallbacksLocked processpendingcallbackslocked3 = new processPendingCallbacksLocked(mediaSessionCompatCallbackCallbackHandler);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = processpendingcallbackslocked3;
            processpendingcallbackslocked3.TuitionPaymentFragmentspecialinlinedviewModeldefault3.add(this);
            fromMediaSession frommediasession2 = this.d;
            processPendingCallbacksLocked processpendingcallbackslocked4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (processpendingcallbackslocked4 != null) {
                frommediasession2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.add(processpendingcallbackslocked4);
            }
        }
    }
}
