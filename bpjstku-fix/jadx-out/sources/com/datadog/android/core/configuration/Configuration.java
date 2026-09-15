package com.datadog.android.core.configuration;

import com.datadog.android.DatadogSite;
import defpackage.HandlerScheduledExecutorServiceHandlerScheduledFuture11;
import defpackage.ImageProxyDownsamplerForwardingImageProxyImpl;
import defpackage.IoExecutor1;
import defpackage.getCameraLens;
import defpackage.getJpegQualityInternal;
import defpackage.lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;
import defpackage.onOutputSurface;
import java.net.Proxy;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Authenticator;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0003\"\u001e\u0018BO\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010\u001b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0016\u0010!\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019"}, d2 = {"Lcom/datadog/android/core/configuration/Configuration;", "", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "", "p6", "<init>", "(Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/String;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "g", "asBinder", "Builder"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final /* data */ class Configuration {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 f683a = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(false, false, MapsKt.emptyMap(), BatchSize.MEDIUM, UploadFrequency.AVERAGE, null, Authenticator.NONE, null, DatadogSite.US1, BatchProcessingLevel.MEDIUM, null, new lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy(new Function0<Unit>() { // from class: com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$1
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            return Unit.INSTANCE;
        }
    }, new Function1<Object, Unit>() { // from class: com.datadog.android.core.configuration.Configuration$Companion$DEFAULT_BACKPRESSURE_STRATEGY$2
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Object obj) {
            TuitionPaymentFragmentbindingInflater1(obj);
            return Unit.INSTANCE;
        }

        public final void TuitionPaymentFragmentbindingInflater1(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }, BackPressureMitigation.IGNORE_NEWEST), null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final TuitionPaymentFragmentspecialinlinedviewModeldefault3 b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Map<String, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final String asBinder;

    public Configuration(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, String str, String str2, String str3, String str4, boolean z, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.b = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        this.TuitionPaymentFragmentbindingInflater1 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
        this.asInterface = str3;
        this.asBinder = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = map;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        public final UploadFrequency INotificationSideChannel;
        public final lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy TuitionPaymentFragmentbindingInflater1;
        public final BatchProcessingLevel TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        public final BatchSize TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Proxy f685a;
        public final boolean asBinder;
        public final Authenticator asInterface;
        public final onOutputSurface b;
        public final getJpegQualityInternal cancelAll;
        public final ImageProxyDownsamplerForwardingImageProxyImpl.b d;
        public final Map<String, Set<Object>> g;
        public final DatadogSite notify;

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(boolean z, boolean z2, Map<String, ? extends Set<? extends Object>> map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, onOutputSurface onoutputsurface, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ImageProxyDownsamplerForwardingImageProxyImpl.b bVar, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, getJpegQualityInternal getjpegqualityinternal) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(batchSize, "");
            Intrinsics.checkNotNullParameter(uploadFrequency, "");
            Intrinsics.checkNotNullParameter(authenticator, "");
            Intrinsics.checkNotNullParameter(datadogSite, "");
            Intrinsics.checkNotNullParameter(batchProcessingLevel, "");
            Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
            this.asBinder = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z2;
            this.g = map;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = batchSize;
            this.INotificationSideChannel = uploadFrequency;
            this.f685a = proxy;
            this.asInterface = authenticator;
            this.b = onoutputsurface;
            this.notify = datadogSite;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = batchProcessingLevel;
            this.d = bVar;
            this.TuitionPaymentFragmentbindingInflater1 = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy;
            this.cancelAll = getjpegqualityinternal;
        }

        public static /* synthetic */ TuitionPaymentFragmentspecialinlinedviewModeldefault3 b(TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3, boolean z, boolean z2, Map map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, onOutputSurface onoutputsurface, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ImageProxyDownsamplerForwardingImageProxyImpl.b bVar, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, getJpegQualityInternal getjpegqualityinternal, int i) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2((i & 1) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder : z, (i & 2) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : z2, (i & 4) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.g : map, (i & 8) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : batchSize, (i & 16) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel : uploadFrequency, (i & 32) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.f685a : proxy, (i & 64) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface : authenticator, (i & 128) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.b : onoutputsurface, (i & 256) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.notify : datadogSite, (i & 512) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : batchProcessingLevel, (i & 1024) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.d : bVar, (i & 2048) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 : lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, (i & 4096) != 0 ? tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll : getjpegqualityinternal);
        }

        private static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, boolean z2, Map<String, ? extends Set<? extends Object>> map, BatchSize batchSize, UploadFrequency uploadFrequency, Proxy proxy, Authenticator authenticator, onOutputSurface onoutputsurface, DatadogSite datadogSite, BatchProcessingLevel batchProcessingLevel, ImageProxyDownsamplerForwardingImageProxyImpl.b bVar, lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, getJpegQualityInternal getjpegqualityinternal) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(batchSize, "");
            Intrinsics.checkNotNullParameter(uploadFrequency, "");
            Intrinsics.checkNotNullParameter(authenticator, "");
            Intrinsics.checkNotNullParameter(datadogSite, "");
            Intrinsics.checkNotNullParameter(batchProcessingLevel, "");
            Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
            return new TuitionPaymentFragmentspecialinlinedviewModeldefault3(z, z2, map, batchSize, uploadFrequency, proxy, authenticator, onoutputsurface, datadogSite, batchProcessingLevel, bVar, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, getjpegqualityinternal);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = (TuitionPaymentFragmentspecialinlinedviewModeldefault3) obj;
            return this.asBinder == tuitionPaymentFragmentspecialinlinedviewModeldefault3.asBinder && this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 && Intrinsics.areEqual(this.g, tuitionPaymentFragmentspecialinlinedviewModeldefault3.g) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 && this.INotificationSideChannel == tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel && Intrinsics.areEqual(this.f685a, tuitionPaymentFragmentspecialinlinedviewModeldefault3.f685a) && Intrinsics.areEqual(this.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault3.asInterface) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault3.b) && this.notify == tuitionPaymentFragmentspecialinlinedviewModeldefault3.notify && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.d, tuitionPaymentFragmentspecialinlinedviewModeldefault3.d) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.cancelAll, tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.asBinder);
            int iHashCode2 = Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            int iHashCode3 = this.g.hashCode();
            int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
            int iHashCode5 = this.INotificationSideChannel.hashCode();
            Proxy proxy = this.f685a;
            int iHashCode6 = proxy == null ? 0 : proxy.hashCode();
            int iHashCode7 = this.asInterface.hashCode();
            onOutputSurface onoutputsurface = this.b;
            int iHashCode8 = onoutputsurface == null ? 0 : onoutputsurface.hashCode();
            int iHashCode9 = this.notify.hashCode();
            int iHashCode10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
            ImageProxyDownsamplerForwardingImageProxyImpl.b bVar = this.d;
            int iHashCode11 = bVar == null ? 0 : bVar.hashCode();
            int iHashCode12 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
            getJpegQualityInternal getjpegqualityinternal = this.cancelAll;
            return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (getjpegqualityinternal != null ? getjpegqualityinternal.hashCode() : 0);
        }

        public final String toString() {
            boolean z = this.asBinder;
            boolean z2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Map<String, Set<Object>> map = this.g;
            BatchSize batchSize = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            UploadFrequency uploadFrequency = this.INotificationSideChannel;
            Proxy proxy = this.f685a;
            Authenticator authenticator = this.asInterface;
            onOutputSurface onoutputsurface = this.b;
            DatadogSite datadogSite = this.notify;
            BatchProcessingLevel batchProcessingLevel = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ImageProxyDownsamplerForwardingImageProxyImpl.b bVar = this.d;
            lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = this.TuitionPaymentFragmentbindingInflater1;
            getJpegQualityInternal getjpegqualityinternal = this.cancelAll;
            StringBuilder sb = new StringBuilder("Core(needsClearTextHttp=");
            sb.append(z);
            sb.append(", enableDeveloperModeWhenDebuggable=");
            sb.append(z2);
            sb.append(", firstPartyHostsWithHeaderTypes=");
            sb.append(map);
            sb.append(", batchSize=");
            sb.append(batchSize);
            sb.append(", uploadFrequency=");
            sb.append(uploadFrequency);
            sb.append(", proxy=");
            sb.append(proxy);
            sb.append(", proxyAuth=");
            sb.append(authenticator);
            sb.append(", encryption=");
            sb.append(onoutputsurface);
            sb.append(", site=");
            sb.append(datadogSite);
            sb.append(", batchProcessingLevel=");
            sb.append(batchProcessingLevel);
            sb.append(", persistenceStrategyFactory=");
            sb.append(bVar);
            sb.append(", backpressureStrategy=");
            sb.append(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy);
            sb.append(", uploadSchedulerStrategy=");
            sb.append(getjpegqualityinternal);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0016\u0010\u001e\u001a\u00020\u001c8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014"}, d2 = {"Lcom/datadog/android/core/configuration/Configuration$Builder;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/datadog/android/core/configuration/Configuration;", "build", "()Lcom/datadog/android/core/configuration/Configuration;", "Lcom/datadog/android/DatadogSite;", "useSite", "(Lcom/datadog/android/DatadogSite;)Lcom/datadog/android/core/configuration/Configuration$Builder;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/Map;", "TuitionPaymentFragmentbindingInflater1", "b", "Ljava/lang/String;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Z", "a", "LgetCameraLens;", "LgetCameraLens;", "d", "g", "asBinder"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
        private TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
        public getCameraLens d;

        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
        private Map<String, ? extends Object> TuitionPaymentFragmentbindingInflater1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String b;

        /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
        private final String a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final String asBinder;

        private Builder(String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.b = str2;
            this.a = str3;
            this.asBinder = str4;
            this.TuitionPaymentFragmentbindingInflater1 = MapsKt.emptyMap();
            Companion companion = Configuration.INSTANCE;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            this.d = new getCameraLens();
        }

        public /* synthetic */ Builder(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4);
        }

        public final Configuration build() {
            return new Configuration(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.a, this.asBinder, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1);
        }

        public final Builder useSite(DatadogSite p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, false, false, null, null, null, null, null, null, p0, null, null, null, null, 7934);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(String str, String str2, String str3) {
            this(str, str2, str3, null, 8, null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            IoExecutor1.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0] = HandlerScheduledExecutorServiceHandlerScheduledFuture11.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    /* JADX INFO: renamed from: com.datadog.android.core.configuration.Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "a", "Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Lcom/datadog/android/core/configuration/Configuration$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return Configuration.f683a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ Configuration TuitionPaymentFragmentspecialinlinedviewModeldefault2(Configuration configuration, TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
        String str = configuration.TuitionPaymentFragmentbindingInflater1;
        String str2 = configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = configuration.asInterface;
        String str4 = configuration.asBinder;
        boolean z = configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Map<String, Object> map = configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Intrinsics.checkNotNullParameter(tuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new Configuration(tuitionPaymentFragmentspecialinlinedviewModeldefault3, str, str2, str3, str4, z, map);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) p0;
        return Intrinsics.areEqual(this.b, configuration.b) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, configuration.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault2) && Intrinsics.areEqual(this.asInterface, configuration.asInterface) && Intrinsics.areEqual(this.asBinder, configuration.asBinder) && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault1 && Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode();
        int iHashCode2 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode4 = this.asInterface.hashCode();
        String str = this.asBinder;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) * 31) + this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
    }

    public final String toString() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.b;
        String str = this.TuitionPaymentFragmentbindingInflater1;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str3 = this.asInterface;
        String str4 = this.asBinder;
        boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        Map<String, Object> map = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        StringBuilder sb = new StringBuilder("Configuration(b=");
        sb.append(tuitionPaymentFragmentspecialinlinedviewModeldefault3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str2);
        sb.append(", asInterface=");
        sb.append(str3);
        sb.append(", asBinder=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(z);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
