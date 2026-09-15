package defpackage;

/* JADX INFO: loaded from: classes6.dex */
final class RequestProcessorRequest extends addQuirkForTesting {
    final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    RequestProcessorRequest(Quirks quirks, boolean z) {
        super(quirks);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(ReadableConfig[] readableConfigArr, buildQuirkSettings buildquirksettings) {
        for (int i = 0; i < readableConfigArr.length; i++) {
            ReadableConfig readableConfig = readableConfigArr[i];
            if (readableConfig != null) {
                int i2 = readableConfig.TuitionPaymentFragmentbindingInflater1 % 30;
                int i3 = readableConfig.b;
                if (i3 > buildquirksettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    readableConfigArr[i] = null;
                } else {
                    if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        i3 += 2;
                    }
                    int i4 = i3 % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 == 2 && i2 + 1 != buildquirksettings.b) {
                                readableConfigArr[i] = null;
                            }
                        } else if (i2 / 3 != buildquirksettings.TuitionPaymentFragmentspecialinlinedviewModeldefault1 || i2 % 3 != buildquirksettings.TuitionPaymentFragmentbindingInflater1) {
                            readableConfigArr[i] = null;
                        }
                    } else if ((i2 * 3) + 1 != buildquirksettings.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        readableConfigArr[i] = null;
                    }
                }
            }
        }
    }

    @Override // defpackage.addQuirkForTesting
    public final String toString() {
        StringBuilder sb = new StringBuilder("IsLeft: ");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append('\n');
        sb.append(super.toString());
        return sb.toString();
    }

    final buildQuirkSettings TuitionPaymentFragmentbindingInflater1() {
        ReadableConfig[] readableConfigArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        RequestProcessor requestProcessor = new RequestProcessor();
        RequestProcessor requestProcessor2 = new RequestProcessor();
        RequestProcessor requestProcessor3 = new RequestProcessor();
        RequestProcessor requestProcessor4 = new RequestProcessor();
        for (ReadableConfig readableConfig : readableConfigArr) {
            if (readableConfig != null) {
                readableConfig.b = ((readableConfig.TuitionPaymentFragmentbindingInflater1 / 30) * 3) + (readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 3);
                int i = readableConfig.TuitionPaymentFragmentbindingInflater1 % 30;
                int i2 = readableConfig.b;
                if (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    i2 += 2;
                }
                int i3 = i2 % 3;
                if (i3 == 0) {
                    requestProcessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i * 3) + 1);
                } else if (i3 == 1) {
                    requestProcessor4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i / 3);
                    requestProcessor3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i % 3);
                } else if (i3 == 2) {
                    requestProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i + 1);
                }
            }
        }
        if (requestProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3().length == 0 || requestProcessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3().length == 0 || requestProcessor3.TuitionPaymentFragmentspecialinlinedviewModeldefault3().length == 0 || requestProcessor4.TuitionPaymentFragmentspecialinlinedviewModeldefault3().length == 0 || requestProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0] <= 0 || requestProcessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0] + requestProcessor3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0] < 3 || requestProcessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0] + requestProcessor3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0] > 90) {
            return null;
        }
        buildQuirkSettings buildquirksettings = new buildQuirkSettings(requestProcessor.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0], requestProcessor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0], requestProcessor3.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0], requestProcessor4.TuitionPaymentFragmentspecialinlinedviewModeldefault3()[0]);
        TuitionPaymentFragmentspecialinlinedviewModeldefault1(readableConfigArr, buildquirksettings);
        return buildquirksettings;
    }
}
