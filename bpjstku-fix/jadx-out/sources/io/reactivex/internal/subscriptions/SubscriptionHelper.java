package io.reactivex.internal.subscriptions;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.isSonyG3125;
import defpackage.share;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public enum SubscriptionHelper implements OutputTransform {
    CANCELLED;

    @Override // defpackage.OutputTransform
    public final void b() {
    }

    @Override // defpackage.OutputTransform
    public final void b(long j) {
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(OutputTransform outputTransform, OutputTransform outputTransform2) {
        if (outputTransform2 == null) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new NullPointerException("next is null"));
            return false;
        }
        if (outputTransform == null) {
            return true;
        }
        outputTransform2.b();
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(long j) {
        if (j > 0) {
            return true;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
        return false;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(AtomicReference<OutputTransform> atomicReference, OutputTransform outputTransform) {
        share.b(outputTransform, "s is null");
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, outputTransform)) {
            return true;
        }
        outputTransform.b();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ProtocolViolationException("Subscription already set!"));
        return false;
    }

    public static boolean TuitionPaymentFragmentbindingInflater1(AtomicReference<OutputTransform> atomicReference) {
        OutputTransform andSet;
        OutputTransform outputTransform = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (outputTransform == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.b();
        return true;
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(AtomicReference<OutputTransform> atomicReference, AtomicLong atomicLong, OutputTransform outputTransform) {
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(atomicReference, outputTransform)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        outputTransform.b(andSet);
        return true;
    }

    public static void TuitionPaymentFragmentbindingInflater1(AtomicReference<OutputTransform> atomicReference, AtomicLong atomicLong, long j) {
        OutputTransform outputTransform = atomicReference.get();
        if (outputTransform != null) {
            outputTransform.b(j);
            return;
        }
        if (j > 0) {
            isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(atomicLong, j);
            OutputTransform outputTransform2 = atomicReference.get();
            if (outputTransform2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    outputTransform2.b(andSet);
                    return;
                }
                return;
            }
            return;
        }
        DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new IllegalArgumentException("n > 0 required but it was ".concat(String.valueOf(j))));
    }
}
