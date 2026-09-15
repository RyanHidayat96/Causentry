package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes5.dex */
public final class MimeInfo {
    public static final CoroutineDispatcher TuitionPaymentFragmentspecialinlinedviewModeldefault2(Executor executor) {
        CoroutineDispatcher coroutineDispatcher;
        getCompatibleAudioProfile getcompatibleaudioprofile = executor instanceof getCompatibleAudioProfile ? (getCompatibleAudioProfile) executor : null;
        return (getcompatibleaudioprofile == null || (coroutineDispatcher = getcompatibleaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2) == null) ? new AutoValue_VideoMimeInfo(executor) : coroutineDispatcher;
    }

    public static final Executor b(CoroutineDispatcher coroutineDispatcher) {
        Executor executorTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        AutoValue_VideoMimeInfo1 autoValue_VideoMimeInfo1 = coroutineDispatcher instanceof AutoValue_VideoMimeInfo1 ? (AutoValue_VideoMimeInfo1) coroutineDispatcher : null;
        return (autoValue_VideoMimeInfo1 == null || (executorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoMimeInfo1.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) == null) ? new getCompatibleAudioProfile(coroutineDispatcher) : executorTuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }
}
