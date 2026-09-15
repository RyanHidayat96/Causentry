package com.google.firebase.sessions.dagger.internal;

import defpackage.ExtraSupportedResolutionQuirk;

/* JADX INFO: loaded from: classes4.dex */
public final class Providers {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.firebase.sessions.dagger.internal.Providers$1, reason: invalid class name */
    public class AnonymousClass1<T> implements Provider<T> {
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        final /* synthetic */ ExtraSupportedResolutionQuirk val$provider;

        AnonymousClass1(ExtraSupportedResolutionQuirk extraSupportedResolutionQuirk) {
            this.val$provider = extraSupportedResolutionQuirk;
        }

        @Override // defpackage.ExtraSupportedResolutionQuirk
        public T get() {
            return (T) this.val$provider.get();
        }

        public static int TuitionPaymentFragmentbindingInflater1() {
            int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            int i2 = i % 6978767;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i + 1;
            if (i2 != 0) {
                return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 = iMaxMemory;
            return iMaxMemory;
        }
    }

    public static <T> Provider<T> asDaggerProvider(ExtraSupportedResolutionQuirk<T> extraSupportedResolutionQuirk) {
        Preconditions.checkNotNull(extraSupportedResolutionQuirk);
        return new AnonymousClass1(extraSupportedResolutionQuirk);
    }

    private Providers() {
    }
}
