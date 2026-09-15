package io.reactivex.internal.disposables;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.share;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public enum DisposableHelper implements BufferProviderState {
    DISPOSED;

    @Override // defpackage.BufferProviderState
    public final void dispose() {
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        return true;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(BufferProviderState bufferProviderState) {
        return bufferProviderState == DISPOSED;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReference<BufferProviderState> atomicReference, BufferProviderState bufferProviderState) {
        BufferProviderState bufferProviderState2;
        do {
            bufferProviderState2 = atomicReference.get();
            if (bufferProviderState2 == DISPOSED) {
                if (bufferProviderState == null) {
                    return false;
                }
                bufferProviderState.dispose();
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, bufferProviderState2, bufferProviderState));
        if (bufferProviderState2 == null) {
            return true;
        }
        bufferProviderState2.dispose();
        return true;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(AtomicReference<BufferProviderState> atomicReference, BufferProviderState bufferProviderState) {
        share.b(bufferProviderState, "d is null");
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, bufferProviderState)) {
            return true;
        }
        bufferProviderState.dispose();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static boolean b(AtomicReference<BufferProviderState> atomicReference, BufferProviderState bufferProviderState) {
        BufferProviderState bufferProviderState2;
        do {
            bufferProviderState2 = atomicReference.get();
            if (bufferProviderState2 == DISPOSED) {
                if (bufferProviderState == null) {
                    return false;
                }
                bufferProviderState.dispose();
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, bufferProviderState2, bufferProviderState));
        return true;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReference<BufferProviderState> atomicReference) {
        BufferProviderState andSet;
        BufferProviderState bufferProviderState = atomicReference.get();
        DisposableHelper disposableHelper = DISPOSED;
        if (bufferProviderState == disposableHelper || (andSet = atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.dispose();
        return true;
    }

    public static boolean b(BufferProviderState bufferProviderState, BufferProviderState bufferProviderState2) {
        if (bufferProviderState2 == null) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new NullPointerException("next is null"));
            return false;
        }
        if (bufferProviderState == null) {
            return true;
        }
        bufferProviderState2.dispose();
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProtocolViolationException("Disposable already set!"));
        return false;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(AtomicReference<BufferProviderState> atomicReference, BufferProviderState bufferProviderState) {
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, bufferProviderState)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        bufferProviderState.dispose();
        return false;
    }
}
