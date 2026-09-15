package defpackage;

import com.sofakingforever.analytics.AnalyticsSettings;

/* JADX INFO: loaded from: classes5.dex */
public final class getOutputUri {
    public final AnalyticsSettings TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final AutoValue_OutputResults[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public TuitionPaymentFragmentbindingInflater1 b;

    public interface TuitionPaymentFragmentbindingInflater1 {
        void TuitionPaymentFragmentbindingInflater1(Exception exc);
    }

    public getOutputUri(AnalyticsSettings analyticsSettings, AutoValue_OutputResults... autoValue_OutputResultsArr) throws Throwable {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = analyticsSettings;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_OutputResultsArr;
        if (analyticsSettings.b) {
            getTypicalSizes gettypicalsizes = getTypicalSizes.INSTANCE;
            getTypicalSizes.TuitionPaymentFragmentbindingInflater1();
        }
        for (int i = 0; i < autoValue_OutputResultsArr.length; i++) {
            AutoValue_OutputResults autoValue_OutputResults = autoValue_OutputResultsArr[0];
            if (autoValue_OutputResults.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                autoValue_OutputResults.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }
}
