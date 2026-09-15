package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class PreviewViewImplementation extends PreviewViewImplementationMode {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewViewImplementation(String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // defpackage.PreviewViewImplementationMode, defpackage.stopListeningToDisplayChange
    public final byte TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        String strOnTransact = onTransact();
        int iCancel = cancel();
        if (iCancel >= strOnTransact.length() || iCancel == -1) {
            return (byte) 10;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iCancel + 1;
        char cCharAt = strOnTransact.charAt(iCancel);
        if (cCharAt < '~') {
            return getImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3[cCharAt];
        }
        return (byte) 0;
    }

    @Override // defpackage.PreviewViewImplementationMode, defpackage.stopListeningToDisplayChange
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        char cCharAt;
        int iCancel = cancel();
        return (iCancel >= onTransact().length() || iCancel == -1 || (cCharAt = onTransact().charAt(iCancel)) == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
    }

    @Override // defpackage.PreviewViewImplementationMode, defpackage.stopListeningToDisplayChange
    public final void TuitionPaymentFragmentbindingInflater1(char c) {
        String strOnTransact = onTransact();
        int iCancel = cancel();
        if (iCancel >= strOnTransact.length() || iCancel == -1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = -1;
            b(c);
        }
        char cCharAt = strOnTransact.charAt(iCancel);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iCancel + 1;
        if (cCharAt == c) {
            return;
        }
        b(c);
    }

    @Override // defpackage.stopListeningToDisplayChange
    public final byte INotificationSideChannel() {
        String strOnTransact = onTransact();
        int iCancel = cancel();
        if (iCancel >= strOnTransact.length() || iCancel == -1) {
            return (byte) 10;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iCancel;
        char cCharAt = strOnTransact.charAt(iCancel);
        if (cCharAt < '~') {
            return getImplementationMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3[cCharAt];
        }
        return (byte) 0;
    }

    @Override // defpackage.PreviewViewImplementationMode, defpackage.stopListeningToDisplayChange
    public final int cancel() {
        int i;
        int iIndexOf$default = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String strOnTransact = onTransact();
        while (iIndexOf$default < strOnTransact.length()) {
            char cCharAt = strOnTransact.charAt(iIndexOf$default);
            PreviewViewImplementation previewViewImplementation = this;
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i = iIndexOf$default + 1) >= strOnTransact.length()) {
                    break;
                }
                char cCharAt2 = strOnTransact.charAt(i);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) strOnTransact, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strOnTransact.length();
                        stopListeningToDisplayChange.TuitionPaymentFragmentbindingInflater1(previewViewImplementation, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6);
                        throw new KotlinNothingValueException();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = StringsKt.indexOf$default((CharSequence) strOnTransact, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default == -1) {
                        iIndexOf$default = strOnTransact.length();
                    }
                }
            }
            iIndexOf$default++;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iIndexOf$default;
        return iIndexOf$default;
    }
}
