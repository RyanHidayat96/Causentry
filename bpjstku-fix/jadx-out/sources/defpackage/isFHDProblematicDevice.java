package defpackage;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isFHDProblematicDevice<T> extends AudioEncoderConfigBuilder implements Continuation<T>, CoroutineScope {
    private final CoroutineContext TuitionPaymentFragmentbindingInflater1;

    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
    }

    protected void b(Throwable th, boolean z) {
    }

    public isFHDProblematicDevice(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2((VideoMimeInfoBuilder) coroutineContext.get(VideoMimeInfoBuilder.b));
        }
        this.TuitionPaymentFragmentbindingInflater1 = coroutineContext.plus(this);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.AudioEncoderConfigBuilder, defpackage.VideoMimeInfoBuilder
    public boolean r_() {
        return super.r_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.AudioEncoderConfigBuilder
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        StringBuilder sb = new StringBuilder();
        sb.append(resolveAudioMimeInfo.TuitionPaymentFragmentbindingInflater1((Object) this));
        sb.append(" was cancelled");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AudioEncoderConfigBuilder
    protected final void TuitionPaymentFragmentbindingInflater1(Object obj) {
        if (obj instanceof isVivoY91i) {
            isVivoY91i isvivoy91i = (isVivoY91i) obj;
            b(isvivoy91i.TuitionPaymentFragmentbindingInflater1, isvivoy91i.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(obj);
        }
    }

    protected void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        a_(obj);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
        AudioConfigUtil.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, th);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public String p_() {
        VideoQualityQuirk videoQualityQuirk;
        String str;
        CoroutineContext coroutineContext = this.TuitionPaymentFragmentbindingInflater1;
        String string = null;
        if (scaleAndClampBitrate.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && (videoQualityQuirk = (VideoQualityQuirk) coroutineContext.get(VideoQualityQuirk.INSTANCE)) != null) {
            lambdaselectSampleRateOrNearestSupported0 lambdaselectsamplerateornearestsupported0 = (lambdaselectSampleRateOrNearestSupported0) coroutineContext.get(lambdaselectSampleRateOrNearestSupported0.INSTANCE);
            if (lambdaselectsamplerateornearestsupported0 == null || (str = lambdaselectsamplerateornearestsupported0.TuitionPaymentFragmentbindingInflater1) == null) {
                str = "coroutine";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('#');
            sb.append(videoQualityQuirk.b);
            string = sb.toString();
        }
        if (string == null) {
            return super.p_();
        }
        StringBuilder sb2 = new StringBuilder("\"");
        sb2.append(string);
        sb2.append("\":");
        sb2.append(super.p_());
        return sb2.toString();
    }

    public final <R> void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineStart coroutineStart, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        coroutineStart.TuitionPaymentFragmentbindingInflater1(function2, r, this);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM8027exceptionOrNullimpl = Result.m8027exceptionOrNullimpl(obj);
        if (thM8027exceptionOrNullimpl != null) {
            obj = new isVivoY91i(thM8027exceptionOrNullimpl, false, 2, null);
        }
        Object objAsBinder = asBinder(obj);
        if (objAsBinder == AudioEncoderInfo.TuitionPaymentFragmentbindingInflater1) {
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(objAsBinder);
    }
}
