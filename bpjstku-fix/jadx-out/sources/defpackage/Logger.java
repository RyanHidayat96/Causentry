package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.persistence.file.FileExtKt$listFilesSafe$1;
import com.datadog.android.ndk.internal.NdkCrashHandler;
import com.google.gson.JsonObject;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u001c2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001dJ\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u001a\u0010 J\u000f\u0010!\u001a\u00020\u0019H\u0016¢\u0006\u0004\b!\u0010\u001bJ'\u0010\"\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0003¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010!\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b(\u0010.R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u0010$\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b+\u00102R\u0014\u00105\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b/\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u00100\u001a\u00020;8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u0010:\u001a\u00020;8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b7\u0010<R \u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u00109"}, d2 = {"LLogger;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler;", "Ljava/io/File;", "p0", "Ljava/util/concurrent/ExecutorService;", "p1", "LisReversedVertical;", "", "LsetOffsetX;", "p2", "Lcom/datadog/android/api/context/NetworkInfo;", "p3", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "p4", "Lcom/datadog/android/api/InternalLogger;", "p5", "LImageCaptureOutputFormat;", "", "p6", "Lkotlin/Function0;", "Lcom/google/gson/JsonObject;", "p7", "p8", "<init>", "(Ljava/io/File;Ljava/util/concurrent/ExecutorService;LisReversedVertical;LisReversedVertical;LisReversedVertical;Lcom/datadog/android/api/InternalLogger;LImageCaptureOutputFormat;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "", "TuitionPaymentFragmentbindingInflater1", "()V", "", "(Lcom/google/gson/JsonObject;LsetOffsetX;)Ljava/util/Map;", "LImageAnalysisBlockingAnalyzer;", "Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;", "(LImageAnalysisBlockingAnalyzer;Lcom/datadog/android/ndk/internal/NdkCrashHandler$ReportTarget;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "b", "(Ljava/io/File;LImageCaptureOutputFormat;)Ljava/lang/String;", "g", "Ljava/util/concurrent/ExecutorService;", "asInterface", "LImageCaptureOutputFormat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "cancelAll", "Lcom/datadog/android/api/InternalLogger;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LsetOffsetX;", "Lcom/datadog/android/api/context/NetworkInfo;", "Lcom/google/gson/JsonObject;", "asBinder", "notify", "Lkotlin/jvm/functions/Function0;", "LlambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer;", "cancel", "Ljava/lang/String;", "d", "Ljava/io/File;", "a", "onTransact", "LisReversedVertical;", "INotificationSideChannel", "", "Z", "INotificationSideChannelStub"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Logger implements NdkCrashHandler {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    private final isReversedVertical<String, NetworkInfo> cancelAll;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    private final isReversedVertical<String, lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer> cancel;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public NetworkInfo TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public setOffsetX b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public JsonObject asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean INotificationSideChannel;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final File a;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageCaptureOutputFormat<byte[]> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    private final String d;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean notify;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final ExecutorService TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    private final Function0<JsonObject> asInterface;
    private final isReversedVertical<String, setOffsetX> onTransact;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(k = 3, mv = {1, 7, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NdkCrashHandler.ReportTarget.values().length];
            try {
                iArr[NdkCrashHandler.ReportTarget.RUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NdkCrashHandler.ReportTarget.LOGS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Logger(File file, ExecutorService executorService, isReversedVertical<String, setOffsetX> isreversedvertical, isReversedVertical<String, NetworkInfo> isreversedvertical2, isReversedVertical<String, lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer> isreversedvertical3, InternalLogger internalLogger, ImageCaptureOutputFormat<byte[]> imageCaptureOutputFormat, Function0<JsonObject> function0, String str) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(isreversedvertical, "");
        Intrinsics.checkNotNullParameter(isreversedvertical2, "");
        Intrinsics.checkNotNullParameter(isreversedvertical3, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(imageCaptureOutputFormat, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.TuitionPaymentFragmentbindingInflater1 = executorService;
        this.onTransact = isreversedvertical;
        this.cancelAll = isreversedvertical2;
        this.cancel = isreversedvertical3;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageCaptureOutputFormat;
        this.asInterface = function0;
        this.d = str;
        this.a = Companion.TuitionPaymentFragmentbindingInflater1(file);
    }

    public /* synthetic */ Logger(File file, ExecutorService executorService, isReversedVertical isreversedvertical, isReversedVertical isreversedvertical2, isReversedVertical isreversedvertical3, InternalLogger internalLogger, ImageCaptureOutputFormat imageCaptureOutputFormat, Function0 function0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, executorService, isreversedvertical, isreversedvertical2, isreversedvertical3, internalLogger, imageCaptureOutputFormat, function0, (i & 256) != 0 ? "ndk" : str);
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, "NDK crash check", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Runnable() { // from class: getMinLogLevel
            @Override // java.lang.Runnable
            public final void run() {
                Logger.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    @Override // com.datadog.android.ndk.internal.NdkCrashHandler
    public final void TuitionPaymentFragmentbindingInflater1(final ImageAnalysisBlockingAnalyzer p0, final NdkCrashHandler.ReportTarget p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, "NDK crash report ", this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, new Runnable() { // from class: setOffsetY
            @Override // java.lang.Runnable
            public final void run() {
                Logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, p0, p1);
            }
        });
    }

    private final String b(final File p0, ImageCaptureOutputFormat<byte[]> p1) {
        final byte[] bArrB = p1.b(p0);
        if (bArrB.length == 0) {
            return null;
        }
        final String str = new String(bArrB, Charsets.UTF_8);
        String str2 = str;
        if (!StringsKt.contains$default((CharSequence) str2, (CharSequence) "\\u0000", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "\u0000", false, 2, (Object) null)) {
            return str;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.TELEMETRY, new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readFileContent$1$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                String name = p0.getName();
                String str3 = str;
                String strJoinToString$default = ArraysKt.joinToString$default(bArrB, (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                StringBuilder sb = new StringBuilder("Decoded file (");
                sb.append(name);
                sb.append(") content contains NULL character, file content={");
                sb.append(str3);
                sb.append("}, raw_bytes=");
                sb.append(strJoinToString$default);
                return sb.toString();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, null, false, null);
        return str;
    }

    private final Map<String, String> TuitionPaymentFragmentbindingInflater1(final JsonObject p0, setOffsetX p1) {
        Triple triple;
        if (p0 != null) {
            try {
                Function1<String, String> function1 = new Function1<String, String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$generateLogAttributes$logAttributes$extractId$1
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke(String str) {
                        Intrinsics.checkNotNullParameter(str, "");
                        return p0.getAsJsonObject(str).getAsJsonPrimitive("id").getAsString();
                    }

                    {
                        super(1);
                    }
                };
                triple = new Triple(function1.invoke("application"), function1.invoke("session"), function1.invoke("view"));
            } catch (Exception e2) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$generateLogAttributes$logAttributes$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Cannot read application, session, view IDs data from view event.";
                    }
                }, e2, false, null);
                triple = new Triple(null, null, null);
            }
            String str = (String) triple.component1();
            String str2 = (String) triple.component2();
            String str3 = (String) triple.component3();
            if (str != null && str2 != null && str3 != null) {
                return MapsKt.mapOf(TuplesKt.to("session_id", str2), TuplesKt.to("application_id", str), TuplesKt.to("view.id", str3), TuplesKt.to("error.stack", p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), TuplesKt.to("error.source_type", this.d));
            }
            return MapsKt.mapOf(TuplesKt.to("error.stack", p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), TuplesKt.to("error.source_type", this.d));
        }
        return MapsKt.mapOf(TuplesKt.to("error.stack", p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2), TuplesKt.to("error.source_type", this.d));
    }

    private final void TuitionPaymentFragmentbindingInflater1() {
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.a, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            try {
                File file = this.a;
                InternalLogger internalLogger = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Intrinsics.checkNotNullParameter(file, "");
                Intrinsics.checkNotNullParameter(internalLogger, "");
                File[] fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, null, internalLogger, FileExtKt$listFilesSafe$1.TuitionPaymentFragmentbindingInflater1);
                if (fileArr != null) {
                    for (File file2 : fileArr) {
                        FilesKt.deleteRecursively(file2);
                    }
                }
            } catch (Throwable th) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$clearCrashLog$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unable to clear the NDK crash report file: ".concat(String.valueOf(this.this$0.a.getAbsolutePath()));
                    }

                    {
                        super(0);
                    }
                }, th, false, null);
            }
        }
    }

    /* JADX INFO: renamed from: Logger$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007"}, d2 = {"LLogger$b;", "", "<init>", "()V", "Ljava/io/File;", "p0", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/io/File;)Ljava/io/File;", "b"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static File TuitionPaymentFragmentspecialinlinedviewModeldefault2(File p0) {
            return new File(p0, "ndk_crash_reports_v2");
        }

        static File b(File p0) {
            return new File(p0, "ndk_crash_reports_intermediary_v2");
        }

        public static final /* synthetic */ File TuitionPaymentFragmentbindingInflater1(File file) {
            return new File(file, "ndk_crash_reports_v2");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void b(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "");
        if (ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(logger.a, logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            try {
                try {
                    logger.asBinder = logger.asInterface.invoke();
                    File file = logger.a;
                    InternalLogger internalLogger = logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Intrinsics.checkNotNullParameter(file, "");
                    Intrinsics.checkNotNullParameter(internalLogger, "");
                    File[] fileArr = (File[]) ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file, null, internalLogger, FileExtKt$listFilesSafe$1.TuitionPaymentFragmentbindingInflater1);
                    if (fileArr != null) {
                        for (File file2 : fileArr) {
                            String name = file2.getName();
                            if (name != null) {
                                int iHashCode = name.hashCode();
                                if (iHashCode != -528983909) {
                                    if (iHashCode != 408381112) {
                                        if (iHashCode == 1847397036 && name.equals("crash_log")) {
                                            String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(file2, Charsets.UTF_8, logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                            logger.b = strTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? logger.onTransact.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault2) : null;
                                        }
                                    } else if (name.equals("user_information")) {
                                        String strB = logger.b(file2, logger.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        logger.g = strB != null ? logger.cancel.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strB) : null;
                                    }
                                } else if (name.equals("network_information")) {
                                    String strB2 = logger.b(file2, logger.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    logger.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = strB2 != null ? logger.cancelAll.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strB2) : null;
                                }
                            }
                        }
                    }
                } catch (SecurityException e2) {
                    logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$readCrashData$2
                        @Override // kotlin.jvm.functions.Function0
                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                        public final String invoke() {
                            return "Error while trying to read the NDK crash directory";
                        }
                    }, e2, false, null);
                }
            } finally {
                logger.TuitionPaymentFragmentbindingInflater1();
            }
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Logger logger, ImageAnalysisBlockingAnalyzer imageAnalysisBlockingAnalyzer, NdkCrashHandler.ReportTarget reportTarget) {
        Intrinsics.checkNotNullParameter(logger, "");
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer, "");
        Intrinsics.checkNotNullParameter(reportTarget, "");
        setOffsetX setoffsetx = logger.b;
        if (setoffsetx != null) {
            JsonObject jsonObject = logger.asBinder;
            lambdaanalyzeImage1androidxcameracoreImageAnalysisAbstractAnalyzer lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer = logger.g;
            NetworkInfo networkInfo = logger.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (setoffsetx != null) {
                String str = String.format(Locale.US, "NDK crash detected with signal: %s", Arrays.copyOf(new Object[]{setoffsetx.TuitionPaymentFragmentbindingInflater1}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "");
                int i = WhenMappings.$EnumSwitchMapping$0[reportTarget.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        Map<String, String> mapTuitionPaymentFragmentbindingInflater1 = logger.TuitionPaymentFragmentbindingInflater1(jsonObject, setoffsetx);
                        ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B = imageAnalysisBlockingAnalyzer.b("logs");
                        if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B != null) {
                            imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.mapOf(TuplesKt.to("loggerName", "ndk_crash"), TuplesKt.to("type", "ndk_crash"), TuplesKt.to("message", str), TuplesKt.to("attributes", mapTuitionPaymentFragmentbindingInflater1), TuplesKt.to("timestamp", Long.valueOf(setoffsetx.g)), TuplesKt.to("networkInfo", networkInfo), TuplesKt.to("userInfo", lambdaanalyzeimage1androidxcameracoreimageanalysisabstractanalyzer)));
                        } else {
                            logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashLogEvent$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    return "Logs feature is not registered, won't report NDK crash info as log.";
                                }
                            }, null, false, null);
                        }
                    }
                } else if (jsonObject != null) {
                    ImageAnalysisAbstractAnalyzerExternalSyntheticLambda1 imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 = imageAnalysisBlockingAnalyzer.b("rum");
                    if (imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2 != null) {
                        imageAnalysisAbstractAnalyzerExternalSyntheticLambda1B2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(MapsKt.mapOf(TuplesKt.to("type", "ndk_crash"), TuplesKt.to("sourceType", logger.d), TuplesKt.to("timestamp", Long.valueOf(setoffsetx.g)), TuplesKt.to("timeSinceAppStartMs", setoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault1), TuplesKt.to("signalName", setoffsetx.TuitionPaymentFragmentbindingInflater1), TuplesKt.to("stacktrace", setoffsetx.TuitionPaymentFragmentspecialinlinedviewModeldefault2), TuplesKt.to("message", str), TuplesKt.to("lastViewEvent", jsonObject)));
                    } else {
                        logger.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.INFO, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.ndk.internal.DatadogNdkCrashHandler$sendCrashRumEvent$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "RUM feature is not registered, won't report NDK crash info as RUM error.";
                            }
                        }, null, false, null);
                    }
                }
            }
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[reportTarget.ordinal()];
        if (i2 == 1) {
            logger.INotificationSideChannel = true;
        } else if (i2 == 2) {
            logger.notify = true;
        }
        if (logger.INotificationSideChannel && logger.notify) {
            logger.asBinder = null;
            logger.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
            logger.g = null;
            logger.b = null;
        }
    }
}
