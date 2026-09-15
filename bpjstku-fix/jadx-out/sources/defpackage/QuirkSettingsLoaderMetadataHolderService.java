package defpackage;

import java.util.Formatter;

/* JADX INFO: loaded from: classes6.dex */
final class QuirkSettingsLoaderMetadataHolderService {
    final addQuirkForTesting[] TuitionPaymentFragmentbindingInflater1;
    final int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final buildQuirkSettings TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    Quirks b;

    QuirkSettingsLoaderMetadataHolderService(buildQuirkSettings buildquirksettings, Quirks quirks) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = buildquirksettings;
        int i = buildquirksettings.b;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.b = quirks;
        this.TuitionPaymentFragmentbindingInflater1 = new addQuirkForTesting[i + 2];
    }

    void TuitionPaymentFragmentspecialinlinedviewModeldefault1(addQuirkForTesting addquirkfortesting) {
        DeferrableSurfaces1 deferrableSurfaces1;
        DeferrableSurfaces1 deferrableSurfaces2;
        int i;
        if (addquirkfortesting != null) {
            RequestProcessorRequest requestProcessorRequest = (RequestProcessorRequest) addquirkfortesting;
            buildQuirkSettings buildquirksettings = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ReadableConfig[] readableConfigArr = requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            for (ReadableConfig readableConfig : requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (readableConfig != null) {
                    readableConfig.b = ((readableConfig.TuitionPaymentFragmentbindingInflater1 / 30) * 3) + (readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 / 3);
                }
            }
            requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault1(readableConfigArr, buildquirksettings);
            Quirks quirks = requestProcessorRequest.b;
            if (requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                deferrableSurfaces1 = quirks.g;
            } else {
                deferrableSurfaces1 = quirks.asBinder;
            }
            if (requestProcessorRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                deferrableSurfaces2 = quirks.TuitionPaymentFragmentbindingInflater1;
            } else {
                deferrableSurfaces2 = quirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            }
            int i2 = ((int) deferrableSurfaces1.b) - requestProcessorRequest.b.d;
            int i3 = ((int) deferrableSurfaces2.b) - requestProcessorRequest.b.d;
            int i4 = -1;
            int i5 = 1;
            int i6 = 0;
            while (i2 < i3) {
                ReadableConfig readableConfig2 = readableConfigArr[i2];
                if (readableConfig2 != null) {
                    int i7 = readableConfig2.b - i4;
                    if (i7 == 0) {
                        i6++;
                    } else {
                        if (i7 == 1) {
                            int iMax = Math.max(i5, i6);
                            i = readableConfig2.b;
                            i5 = iMax;
                        } else if (i7 < 0 || readableConfig2.b >= buildquirksettings.TuitionPaymentFragmentspecialinlinedviewModeldefault2 || i7 > i2) {
                            readableConfigArr[i2] = null;
                        } else {
                            if (i5 > 2) {
                                i7 *= i5 - 2;
                            }
                            boolean z = i7 >= i2;
                            for (int i8 = 1; i8 <= i7 && !z; i8++) {
                                z = readableConfigArr[i2 - i8] != null;
                            }
                            if (z) {
                                readableConfigArr[i2] = null;
                            } else {
                                i = readableConfig2.b;
                            }
                        }
                        i4 = i;
                        i6 = 1;
                    }
                }
                i2++;
            }
        }
    }

    public final String toString() {
        addQuirkForTesting[] addquirkfortestingArr = this.TuitionPaymentFragmentbindingInflater1;
        addQuirkForTesting addquirkfortesting = addquirkfortestingArr[0];
        if (addquirkfortesting == null) {
            addquirkfortesting = addquirkfortestingArr[this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < addquirkfortesting.TuitionPaymentFragmentspecialinlinedviewModeldefault2.length; i++) {
            formatter.format("CW %3d:", Integer.valueOf(i));
            for (int i2 = 0; i2 < this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 2; i2++) {
                addQuirkForTesting addquirkfortesting2 = this.TuitionPaymentFragmentbindingInflater1[i2];
                if (addquirkfortesting2 == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    ReadableConfig readableConfig = addquirkfortesting2.TuitionPaymentFragmentspecialinlinedviewModeldefault2[i];
                    if (readableConfig == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(readableConfig.b), Integer.valueOf(readableConfig.TuitionPaymentFragmentbindingInflater1));
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    static int TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i, int i2, ReadableConfig readableConfig) {
        if (readableConfig == null) {
            return i2;
        }
        int i3 = readableConfig.b;
        if (i3 != -1 && readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == (i3 % 3) * 3) {
            return i2;
        }
        if (i == -1 || readableConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != (i % 3) * 3) {
            return i2 + 1;
        }
        readableConfig.b = i;
        return 0;
    }
}
