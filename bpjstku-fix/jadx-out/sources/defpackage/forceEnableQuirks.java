package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class forceEnableQuirks extends setEnabledWhenDeviceHasQuirk {
    final int TuitionPaymentFragmentbindingInflater1;
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    forceEnableQuirks(int i, String str) {
        super(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = false;
        this.TuitionPaymentFragmentbindingInflater1 = 0;
    }

    forceEnableQuirks(int i, String str, int i2) {
        super(i);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        this.TuitionPaymentFragmentbindingInflater1 = i2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
    }
}
