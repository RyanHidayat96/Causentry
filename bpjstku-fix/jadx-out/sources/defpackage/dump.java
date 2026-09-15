package defpackage;

import at.favre.lib.armadillo.EncryptionProtocolException;
import at.favre.lib.armadillo.SecureSharedPreferenceCryptoException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dump implements getStateLabel {
    abstract boolean TuitionPaymentFragmentbindingInflater1();

    abstract boolean b();

    @Override // defpackage.getStateLabel
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(EncryptionProtocolException encryptionProtocolException, String str, onItemLoaded onitemloaded) throws SecureSharedPreferenceCryptoException {
        if (TuitionPaymentFragmentbindingInflater1()) {
            onitemloaded.edit().remove(str).apply();
        }
        if (b()) {
            throw new SecureSharedPreferenceCryptoException("could not decrypt ".concat(String.valueOf(str)), encryptionProtocolException);
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends dump {
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        private final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;

        @Override // defpackage.dump
        public final boolean b() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }

        @Override // defpackage.dump
        public final boolean TuitionPaymentFragmentbindingInflater1() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }
    }
}
