package io.reactivex.internal.disposables;

import defpackage.SharedByteBuffer;
import defpackage.VideoOutputSourceState;
import defpackage.deriveMediaType;
import defpackage.getDefaultVideoProfile;

/* JADX INFO: loaded from: classes4.dex */
public enum EmptyDisposable implements SharedByteBuffer<Object> {
    INSTANCE,
    NEVER;

    @Override // defpackage.AudioSettingsBuilder
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // defpackage.VideoValidatedEncoderProfilesProxy
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
        return i & 2;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return true;
    }

    @Override // defpackage.AudioSettingsBuilder
    public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
        return null;
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<?> derivemediatype) {
        derivemediatype.onSubscribe(INSTANCE);
        derivemediatype.onComplete();
    }

    public static void b(Throwable th, deriveMediaType<?> derivemediatype) {
        derivemediatype.onSubscribe(INSTANCE);
        derivemediatype.onError(th);
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(VideoOutputSourceState videoOutputSourceState) {
        videoOutputSourceState.onSubscribe(INSTANCE);
        videoOutputSourceState.onComplete();
    }

    public static void b(Throwable th, VideoOutputSourceState videoOutputSourceState) {
        videoOutputSourceState.onSubscribe(INSTANCE);
        videoOutputSourceState.onError(th);
    }

    public static void b(Throwable th, getDefaultVideoProfile<?> getdefaultvideoprofile) {
        getdefaultvideoprofile.onSubscribe(INSTANCE);
        getdefaultvideoprofile.onError(th);
    }

    @Override // defpackage.AudioSettingsBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
