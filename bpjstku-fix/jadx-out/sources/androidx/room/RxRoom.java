package androidx.room;

import androidx.database.SQLiteConnection;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.coroutines.FlowUtil;
import defpackage.BackupHdrProfileEncoderProfilesProvider;
import defpackage.VideoConfigUtil;
import defpackage.VideoEncoderSession1;
import defpackage.VideoMimeInfoBuilder;
import defpackage.VideoOutput;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventFinalize;
import defpackage.VideoRecordEventResume;
import defpackage.VideoRecordEventStart;
import defpackage.VideoSpecBuilder;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveCodec;
import defpackage.formatInterval;
import defpackage.getDefaultAudioProfile;
import defpackage.getVideoOutput;
import defpackage.isSamsungJ2;
import defpackage.lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl;
import defpackage.readableMs;
import defpackage.scaleBitrate;
import defpackage.share;
import defpackage.status;
import defpackage.throwIfTerminated;
import io.reactivex.BackpressureStrategy;
import io.reactivex.disposables.ActionDisposable;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.rx2.RxConvertKt$asObservable$1$job$1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/room/RxRoom;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RxRoom {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Object NOTHING = new Object();

    @Deprecated(message = "This type should not be instantiated as it contains only utility functions.")
    public RxRoom() {
    }

    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0004\b\u0010\u0010\u001fJE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u0010\u0010!JM\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u0010\u0010\"J1\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0007¢\u0006\u0004\b\u0013\u0010#JE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u0013\u0010$JM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u0013\u0010%J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\b\b\u0000\u0010\u0004*\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000 H\u0007¢\u0006\u0004\b\u001d\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010+"}, d2 = {"Landroidx/room/RxRoom$Companion;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/room/RoomDatabase;", "p0", "", "p1", "", "", "p2", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteConnection;", "p3", "LVideoRecordEvent;", "createFlowable", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LVideoRecordEvent;", "LVideoRecordEventStart;", "createObservable", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)LVideoRecordEventStart;", "LVideoRecordEventResume;", "createMaybe", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)LVideoRecordEventResume;", "", "LVideoEncoderSession1;", "createCompletable", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)LVideoEncoderSession1;", "LderiveCodec;", "createSingle", "(Landroidx/room/RoomDatabase;ZZLkotlin/jvm/functions/Function1;)LderiveCodec;", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)LVideoRecordEvent;", "Ljava/util/concurrent/Callable;", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Ljava/util/concurrent/Callable;)LVideoRecordEvent;", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)LVideoRecordEvent;", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;)LVideoRecordEventStart;", "(Landroidx/room/RoomDatabase;[Ljava/lang/String;Ljava/util/concurrent/Callable;)LVideoRecordEventStart;", "(Landroidx/room/RoomDatabase;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)LVideoRecordEventStart;", "(Ljava/util/concurrent/Callable;)LderiveCodec;", "Ljava/util/concurrent/Executor;", "getExecutor", "(Landroidx/room/RoomDatabase;Z)Ljava/util/concurrent/Executor;", "NOTHING", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final <T> VideoRecordEvent<T> createFlowable(RoomDatabase p0, boolean p1, String[] p2, Function1<? super SQLiteConnection, ? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            VideoRecordEvent<T> flowable = createObservable(p0, p1, p2, p3).toFlowable(BackpressureStrategy.LATEST);
            Intrinsics.checkNotNullExpressionValue(flowable, "");
            return flowable;
        }

        @JvmStatic
        public final <T> VideoRecordEventStart<T> createObservable(RoomDatabase p0, boolean p1, String[] p2, Function1<? super SQLiteConnection, ? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            final lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new lambdahandleEncodeError10androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(FlowUtil.createFlow(p0, p1, p2, p3));
            final CoroutineContext queryContext = p0.getQueryContext();
            return VideoRecordEventStart.create(new getVideoOutput() { // from class: resetSurface
                @Override // defpackage.getVideoOutput
                public final void subscribe(getDefaultAudioProfile getdefaultaudioprofile) {
                    getdefaultaudioprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new lambdanotifySurfaceUpdate0(BuildersKt.b(VideoConfigUtil.INSTANCE, Dispatchers.TuitionPaymentFragmentspecialinlinedviewModeldefault1().plus(queryContext), CoroutineStart.ATOMIC, new RxConvertKt$asObservable$1$job$1(tuitionPaymentFragmentspecialinlinedviewModeldefault3, getdefaultaudioprofile, null))));
                }
            });
        }

        @JvmStatic
        public final <T> VideoRecordEventResume<T> createMaybe(RoomDatabase p0, boolean p1, boolean p2, Function1<? super SQLiteConnection, ? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p3, "");
            CoroutineContext coroutineContextMinusKey = p0.getQueryContext().minusKey(VideoMimeInfoBuilder.b);
            RxRoom$Companion$createMaybe$1 rxRoom$Companion$createMaybe$1 = new RxRoom$Companion$createMaybe$1(p0, p1, p2, p3, null);
            if (coroutineContextMinusKey.get(VideoMimeInfoBuilder.b) != null) {
                throw new IllegalArgumentException("Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(coroutineContextMinusKey)).toString());
            }
            return VideoRecordEventResume.b(new throwIfTerminated(VideoConfigUtil.INSTANCE, coroutineContextMinusKey, rxRoom$Companion$createMaybe$1));
        }

        @JvmStatic
        public final VideoEncoderSession1 createCompletable(RoomDatabase p0, boolean p1, boolean p2, Function1<? super SQLiteConnection, Unit> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p3, "");
            final CoroutineContext coroutineContextMinusKey = p0.getQueryContext().minusKey(VideoMimeInfoBuilder.b);
            final RxRoom$Companion$createCompletable$1 rxRoom$Companion$createCompletable$1 = new RxRoom$Companion$createCompletable$1(p0, p1, p2, p3, null);
            if (coroutineContextMinusKey.get(VideoMimeInfoBuilder.b) != null) {
                throw new IllegalArgumentException("Completable context cannot contain job in it. Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(coroutineContextMinusKey)).toString());
            }
            final VideoConfigUtil videoConfigUtil = VideoConfigUtil.INSTANCE;
            return VideoEncoderSession1.TuitionPaymentFragmentbindingInflater1(new VideoOutput() { // from class: EncoderImplSurfaceInputExternalSyntheticLambda0
                @Override // defpackage.VideoOutput
                public final void TuitionPaymentFragmentbindingInflater1(VideoEncoderSessionVideoEncoderState videoEncoderSessionVideoEncoderState) {
                    CoroutineScope coroutineScope = videoConfigUtil;
                    CoroutineContext coroutineContext = coroutineContextMinusKey;
                    Function2 function2 = rxRoom$Companion$createCompletable$1;
                    EncoderInfoImpl encoderInfoImpl = new EncoderInfoImpl(VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineScope, coroutineContext), videoEncoderSessionVideoEncoderState);
                    videoEncoderSessionVideoEncoderState.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new lambdanotifySurfaceUpdate0(encoderInfoImpl));
                    encoderInfoImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineStart.DEFAULT, encoderInfoImpl, function2);
                }
            });
        }

        @JvmStatic
        public final <T> deriveCodec<T> createSingle(RoomDatabase p0, boolean p1, boolean p2, Function1<? super SQLiteConnection, ? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p3, "");
            final CoroutineContext coroutineContextMinusKey = p0.getQueryContext().minusKey(VideoMimeInfoBuilder.b);
            final RxRoom$Companion$createSingle$1 rxRoom$Companion$createSingle$1 = new RxRoom$Companion$createSingle$1(p0, p1, p2, p3, null);
            if (coroutineContextMinusKey.get(VideoMimeInfoBuilder.b) != null) {
                throw new IllegalArgumentException("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ".concat(String.valueOf(coroutineContextMinusKey)).toString());
            }
            final VideoConfigUtil videoConfigUtil = VideoConfigUtil.INSTANCE;
            return deriveCodec.b(new scaleBitrate() { // from class: setEndOfStream
                @Override // defpackage.scaleBitrate
                public final void subscribe(BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider) {
                    CoroutineScope coroutineScope = videoConfigUtil;
                    CoroutineContext coroutineContext = coroutineContextMinusKey;
                    Function2 function2 = rxRoom$Companion$createSingle$1;
                    setPresentationTimeUs setpresentationtimeus = new setPresentationTimeUs(VideoEncoderCrashQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(coroutineScope, coroutineContext), backupHdrProfileEncoderProfilesProvider);
                    backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new lambdanotifySurfaceUpdate0(setpresentationtimeus));
                    setpresentationtimeus.TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineStart.DEFAULT, setpresentationtimeus, function2);
                }
            });
        }

        @JvmStatic
        public final VideoRecordEvent<Object> createFlowable(final RoomDatabase p0, final String... p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            VideoRecordEvent<Object> videoRecordEventTuitionPaymentFragmentspecialinlinedviewModeldefault1 = VideoRecordEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new status() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda6
                @Override // defpackage.status
                public final void subscribe(VideoRecordEventFinalize videoRecordEventFinalize) {
                    RxRoom.Companion.createFlowable$lambda$1(p0, p1, videoRecordEventFinalize);
                }
            }, BackpressureStrategy.LATEST);
            Intrinsics.checkNotNullExpressionValue(videoRecordEventTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            return videoRecordEventTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.room.RxRoom$Companion$createFlowable$1$observer$1] */
        public static final void createFlowable$lambda$1(final RoomDatabase roomDatabase, final String[] strArr, final VideoRecordEventFinalize videoRecordEventFinalize) {
            Intrinsics.checkNotNullParameter(videoRecordEventFinalize, "");
            final ?? r0 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom$Companion$createFlowable$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public final void onInvalidated(Set<String> p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    if (videoRecordEventFinalize.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                        return;
                    }
                    videoRecordEventFinalize.TuitionPaymentFragmentbindingInflater1(RxRoom.NOTHING);
                }
            };
            if (!videoRecordEventFinalize.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                roomDatabase.getInvalidationTracker().addObserver((InvalidationTracker.Observer) r0);
                formatInterval formatinterval = new formatInterval() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda5
                    @Override // defpackage.formatInterval
                    public final void run() {
                        RxRoom.Companion.createFlowable$lambda$1$lambda$0(roomDatabase, r0);
                    }
                };
                share.b(formatinterval, "run is null");
                videoRecordEventFinalize.b(new ActionDisposable(formatinterval));
            }
            if (videoRecordEventFinalize.TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
                return;
            }
            videoRecordEventFinalize.TuitionPaymentFragmentbindingInflater1(RxRoom.NOTHING);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createFlowable$lambda$1$lambda$0(RoomDatabase roomDatabase, RxRoom$Companion$createFlowable$1$observer$1 rxRoom$Companion$createFlowable$1$observer$1) {
            roomDatabase.getInvalidationTracker().removeObserver(rxRoom$Companion$createFlowable$1$observer$1);
        }

        @Deprecated(message = "No longer used by generated code.")
        @JvmStatic
        public final <T> VideoRecordEvent<T> createFlowable(RoomDatabase p0, String[] p1, Callable<? extends T> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return createFlowable(p0, false, p1, (Callable) p2);
        }

        @Deprecated(message = "No longer used by generated code.")
        @JvmStatic
        public final <T> VideoRecordEvent<T> createFlowable(RoomDatabase p0, boolean p1, String[] p2, Callable<? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b(getExecutor(p0, p1));
            Intrinsics.checkNotNullExpressionValue(appendbackupvideoprofileB, "");
            final VideoRecordEventResume videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = VideoRecordEventResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p3);
            Intrinsics.checkNotNullExpressionValue(videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            VideoRecordEvent<Object> videoRecordEventCreateFlowable = createFlowable(p0, (String[]) Arrays.copyOf(p2, p2.length));
            share.b(appendbackupvideoprofileB, "scheduler is null");
            share.b(appendbackupvideoprofileB, "scheduler is null");
            FlowableSubscribeOn flowableSubscribeOn = new FlowableSubscribeOn(videoRecordEventCreateFlowable, appendbackupvideoprofileB, !(videoRecordEventCreateFlowable instanceof FlowableCreate));
            share.b(appendbackupvideoprofileB, "scheduler is null");
            FlowableUnsubscribeOn flowableUnsubscribeOn = new FlowableUnsubscribeOn(flowableSubscribeOn, appendbackupvideoprofileB);
            int iB = VideoRecordEvent.b();
            share.b(appendbackupvideoprofileB, "scheduler is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(iB, "bufferSize");
            FlowableObserveOn flowableObserveOn = new FlowableObserveOn(flowableUnsubscribeOn, appendbackupvideoprofileB, false, iB);
            readableMs readablems = new readableMs() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda4
                @Override // defpackage.readableMs
                public final Object apply(Object obj) {
                    return RxRoom.Companion.createFlowable$lambda$2(videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1, obj);
                }
            };
            share.b(readablems, "mapper is null");
            share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(Integer.MAX_VALUE, "maxConcurrency");
            FlowableFlatMapMaybe flowableFlatMapMaybe = new FlowableFlatMapMaybe(flowableObserveOn, readablems, false, Integer.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(flowableFlatMapMaybe, "");
            return flowableFlatMapMaybe;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoSpecBuilder createFlowable$lambda$2(VideoRecordEventResume videoRecordEventResume, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return videoRecordEventResume;
        }

        @JvmStatic
        public final VideoRecordEventStart<Object> createObservable(final RoomDatabase p0, final String... p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            VideoRecordEventStart<Object> videoRecordEventStartCreate = VideoRecordEventStart.create(new getVideoOutput() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda0
                @Override // defpackage.getVideoOutput
                public final void subscribe(getDefaultAudioProfile getdefaultaudioprofile) {
                    RxRoom.Companion.createObservable$lambda$4(p0, p1, getdefaultaudioprofile);
                }
            });
            Intrinsics.checkNotNullExpressionValue(videoRecordEventStartCreate, "");
            return videoRecordEventStartCreate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.room.RxRoom$Companion$createObservable$1$observer$1] */
        public static final void createObservable$lambda$4(final RoomDatabase roomDatabase, final String[] strArr, final getDefaultAudioProfile getdefaultaudioprofile) {
            Intrinsics.checkNotNullParameter(getdefaultaudioprofile, "");
            final ?? r0 = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.RxRoom$Companion$createObservable$1$observer$1
                @Override // androidx.room.InvalidationTracker.Observer
                public final void onInvalidated(Set<String> p0) {
                    Intrinsics.checkNotNullParameter(p0, "");
                    getdefaultaudioprofile.TuitionPaymentFragmentbindingInflater1(RxRoom.NOTHING);
                }
            };
            roomDatabase.getInvalidationTracker().addObserver((InvalidationTracker.Observer) r0);
            formatInterval formatinterval = new formatInterval() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda1
                @Override // defpackage.formatInterval
                public final void run() {
                    RxRoom.Companion.createObservable$lambda$4$lambda$3(roomDatabase, r0);
                }
            };
            share.b(formatinterval, "run is null");
            getdefaultaudioprofile.b(new ActionDisposable(formatinterval));
            getdefaultaudioprofile.TuitionPaymentFragmentbindingInflater1(RxRoom.NOTHING);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createObservable$lambda$4$lambda$3(RoomDatabase roomDatabase, RxRoom$Companion$createObservable$1$observer$1 rxRoom$Companion$createObservable$1$observer$1) {
            roomDatabase.getInvalidationTracker().removeObserver(rxRoom$Companion$createObservable$1$observer$1);
        }

        @Deprecated(message = "No longer used by generated code.")
        @JvmStatic
        public final <T> VideoRecordEventStart<T> createObservable(RoomDatabase p0, String[] p1, Callable<? extends T> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return createObservable(p0, false, p1, (Callable) p2);
        }

        @Deprecated(message = "No longer used by generated code.")
        @JvmStatic
        public final <T> VideoRecordEventStart<T> createObservable(RoomDatabase p0, boolean p1, String[] p2, Callable<? extends T> p3) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            Intrinsics.checkNotNullParameter(p3, "");
            appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b(getExecutor(p0, p1));
            Intrinsics.checkNotNullExpressionValue(appendbackupvideoprofileB, "");
            final VideoRecordEventResume videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1 = VideoRecordEventResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p3);
            Intrinsics.checkNotNullExpressionValue(videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            VideoRecordEventStart<T> videoRecordEventStart = (VideoRecordEventStart<T>) createObservable(p0, (String[]) Arrays.copyOf(p2, p2.length)).subscribeOn(appendbackupvideoprofileB).unsubscribeOn(appendbackupvideoprofileB).observeOn(appendbackupvideoprofileB).flatMapMaybe(new readableMs() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda3
                @Override // defpackage.readableMs
                public final Object apply(Object obj) {
                    return RxRoom.Companion.createObservable$lambda$5(videoRecordEventResumeTuitionPaymentFragmentspecialinlinedviewModeldefault1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(videoRecordEventStart, "");
            return videoRecordEventStart;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final VideoSpecBuilder createObservable$lambda$5(VideoRecordEventResume videoRecordEventResume, Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return videoRecordEventResume;
        }

        @JvmStatic
        public final <T> deriveCodec<T> createSingle(final Callable<? extends T> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            deriveCodec<T> derivecodecB = deriveCodec.b(new scaleBitrate() { // from class: androidx.room.RxRoom$Companion$$ExternalSyntheticLambda2
                @Override // defpackage.scaleBitrate
                public final void subscribe(BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider) throws Exception {
                    RxRoom.Companion.createSingle$lambda$6(p0, backupHdrProfileEncoderProfilesProvider);
                }
            });
            Intrinsics.checkNotNullExpressionValue(derivecodecB, "");
            return derivecodecB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createSingle$lambda$6(Callable callable, BackupHdrProfileEncoderProfilesProvider backupHdrProfileEncoderProfilesProvider) throws Exception {
            Intrinsics.checkNotNullParameter(backupHdrProfileEncoderProfilesProvider, "");
            try {
                Object objCall = callable.call();
                if (objCall != null) {
                    backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objCall);
                    return;
                }
                throw new EmptyResultSetException("Query returned empty result set.");
            } catch (EmptyResultSetException e2) {
                backupHdrProfileEncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
            }
        }

        private final Executor getExecutor(RoomDatabase p0, boolean p1) {
            if (p1) {
                return p0.getTransactionExecutor();
            }
            return p0.getQueryExecutor();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final VideoEncoderSession1 createCompletable(RoomDatabase roomDatabase, boolean z, boolean z2, Function1<? super SQLiteConnection, Unit> function1) {
        return INSTANCE.createCompletable(roomDatabase, z, z2, function1);
    }

    @Deprecated(message = "No longer used by generated code.")
    @JvmStatic
    public static final <T> VideoRecordEvent<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
        return INSTANCE.createFlowable(roomDatabase, z, strArr, callable);
    }

    @JvmStatic
    public static final <T> VideoRecordEvent<T> createFlowable(RoomDatabase roomDatabase, boolean z, String[] strArr, Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createFlowable(roomDatabase, z, strArr, function1);
    }

    @JvmStatic
    public static final VideoRecordEvent<Object> createFlowable(RoomDatabase roomDatabase, String... strArr) {
        return INSTANCE.createFlowable(roomDatabase, strArr);
    }

    @Deprecated(message = "No longer used by generated code.")
    @JvmStatic
    public static final <T> VideoRecordEvent<T> createFlowable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
        return INSTANCE.createFlowable(roomDatabase, strArr, callable);
    }

    @JvmStatic
    public static final <T> VideoRecordEventResume<T> createMaybe(RoomDatabase roomDatabase, boolean z, boolean z2, Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createMaybe(roomDatabase, z, z2, function1);
    }

    @Deprecated(message = "No longer used by generated code.")
    @JvmStatic
    public static final <T> VideoRecordEventStart<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable<? extends T> callable) {
        return INSTANCE.createObservable(roomDatabase, z, strArr, callable);
    }

    @JvmStatic
    public static final <T> VideoRecordEventStart<T> createObservable(RoomDatabase roomDatabase, boolean z, String[] strArr, Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createObservable(roomDatabase, z, strArr, function1);
    }

    @JvmStatic
    public static final VideoRecordEventStart<Object> createObservable(RoomDatabase roomDatabase, String... strArr) {
        return INSTANCE.createObservable(roomDatabase, strArr);
    }

    @Deprecated(message = "No longer used by generated code.")
    @JvmStatic
    public static final <T> VideoRecordEventStart<T> createObservable(RoomDatabase roomDatabase, String[] strArr, Callable<? extends T> callable) {
        return INSTANCE.createObservable(roomDatabase, strArr, callable);
    }

    @JvmStatic
    public static final <T> deriveCodec<T> createSingle(RoomDatabase roomDatabase, boolean z, boolean z2, Function1<? super SQLiteConnection, ? extends T> function1) {
        return INSTANCE.createSingle(roomDatabase, z, z2, function1);
    }

    @JvmStatic
    public static final <T> deriveCodec<T> createSingle(Callable<? extends T> callable) {
        return INSTANCE.createSingle(callable);
    }
}
