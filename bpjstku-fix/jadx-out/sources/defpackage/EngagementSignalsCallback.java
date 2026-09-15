package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentNewsBinding;
import com.bpjstku.domain.news.model.News;
import com.bpjstku.presentation.news.DetailNewsActivity;
import com.bpjstku.presentation.news.NewsFragment$bindingInflater$1;
import com.google.android.material.card.MaterialCardView;
import com.kennyc.view.MultiStateView;
import defpackage.PostMessageService1;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0017\u001a\u00020\u00148CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0019\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR.\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\"R\u001a\u0010\n\u001a\u00020\r8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0015\u0010#R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'"}, d2 = {"LEngagementSignalsCallback;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentNewsBinding;", "LaddCaptureRequestOptionsInternal$TuitionPaymentFragmentbindingInflater1;", "<init>", "()V", "", "b_", "cancelAll", "onTransact", "g", "cancel", "INotificationSideChannel", "", "p0", "p1", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(II)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/Integer;)V", "LPostMessageService1;", "asBinder", "Lkotlin/Lazy;", "b", "LTrustedWebUtils;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "I", "TuitionPaymentFragmentbindingInflater1", "a", "d", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "()I", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/news/model/News;", "Lkotlin/collections/b;", "Ljava/util/ArrayList;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EngagementSignalsCallback extends AutoValue_CameraState_StateError<FragmentNewsBinding> implements addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1 {

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: PostMessageService
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return EngagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentbindingInflater1 = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 1;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 11;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int g = R.layout.fragment_news;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ArrayList<News> a = new ArrayList<>();

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public EngagementSignalsCallback() {
        final EngagementSignalsCallback engagementSignalsCallback = this;
        this.b = LazyKt.lazy(new Function0<PostMessageService1>() { // from class: com.bpjstku.presentation.news.NewsFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [PostMessageService1, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final PostMessageService1 invoke() {
                ComponentCallbacks componentCallbacks = engagementSignalsCallback;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(PostMessageService1.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Integer num, RecyclerView recyclerView) {
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(recyclerView, "");
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(iIntValue, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentNewsBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return NewsFragment$bindingInflater$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getAsInterface() {
        return this.g;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        MaterialCardView materialCardView = asInterface().cvLatestNews;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "");
        materialCardView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: CustomTabsSessionTokenMockCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EngagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ WindowInsetsCompat TuitionPaymentFragmentbindingInflater1(EngagementSignalsCallback engagementSignalsCallback, View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()), "");
        view.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = engagementSignalsCallback.asInterface().appbarNews.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        engagementSignalsCallback.asInterface().appbarNews.setLayoutParams(marginLayoutParams);
        return windowInsetsCompat;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(EngagementSignalsCallback engagementSignalsCallback, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).g();
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1();
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).b();
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EngagementSignalsCallback engagementSignalsCallback, News news) {
        Intrinsics.checkNotNullParameter(news, "");
        DetailNewsActivity.Companion companion = DetailNewsActivity.INSTANCE;
        Context contextRequireContext = engagementSignalsCallback.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        DetailNewsActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext, engagementSignalsCallback.a, news);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final EngagementSignalsCallback engagementSignalsCallback, VirtualCameraAdapter1 virtualCameraAdapter1) {
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            MultiStateView multiStateView = engagementSignalsCallback.asInterface().msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            MultiStateView multiStateView2 = engagementSignalsCallback.asInterface().msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            List list2 = list;
            engagementSignalsCallback.a.addAll(list2);
            News news = (News) list.get(0);
            FragmentNewsBinding fragmentNewsBindingAsInterface = engagementSignalsCallback.asInterface();
            ImageView imageView = fragmentNewsBindingAsInterface.imgNews;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            Context contextRequireContext = engagementSignalsCallback.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            lambdacreateCameraSelectorById0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView, contextRequireContext, news.TuitionPaymentFragmentbindingInflater1, R.drawable.ic_placeholder, R.drawable.ic_placeholder);
            fragmentNewsBindingAsInterface.tvNewsDate.setText(setSessionStateCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(news.TuitionPaymentFragmentspecialinlinedviewModeldefault2, "dd-MM-yyyy hh:mm:ss", "dd MMM yyyy"));
            fragmentNewsBindingAsInterface.tvNewsTitle.setText(news.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            ((TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(CollectionsKt.toMutableList((Collection) list2).subList(1, list.size() - 1));
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            MultiStateView multiStateView3 = engagementSignalsCallback.asInterface().msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(multiStateView3, null, null, null);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            MultiStateView multiStateView4 = engagementSignalsCallback.asInterface().msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView4, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, engagementSignalsCallback.getString(R.string.error_error_occured), null, new Pair(engagementSignalsCallback.getString(R.string.action_retry), new Function0() { // from class: EngagementSignalsCallbackRemote
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EngagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
                }
            }));
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(EngagementSignalsCallback engagementSignalsCallback) {
        TrustedWebUtils trustedWebUtils = (TrustedWebUtils) engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Camera2CameraControl camera2CameraControl = trustedWebUtils.f253a;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
        trustedWebUtils.asInterface.addOnScrollListener(trustedWebUtils.f253a);
        ((PostMessageService1) engagementSignalsCallback.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2, engagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(EngagementSignalsCallback engagementSignalsCallback, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        DetailNewsActivity.Companion companion = DetailNewsActivity.INSTANCE;
        Context contextRequireContext = engagementSignalsCallback.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ArrayList<News> arrayList = engagementSignalsCallback.a;
        News news = arrayList.get(0);
        Intrinsics.checkNotNullExpressionValue(news, "");
        DetailNewsActivity.Companion.TuitionPaymentFragmentbindingInflater1(contextRequireContext, arrayList, news);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ TrustedWebUtils TuitionPaymentFragmentspecialinlinedviewModeldefault1(final EngagementSignalsCallback engagementSignalsCallback) {
        Context contextRequireContext = engagementSignalsCallback.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new TrustedWebUtils(contextRequireContext, null, new Function1() { // from class: PostMessageBackend
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EngagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (News) obj);
            }
        }, 2, null);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(int p0, int p1) {
        PostMessageService1 postMessageService1 = (PostMessageService1) this.b.getValue();
        final MutableLiveData mutableLiveData = new MutableLiveData();
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(postMessageService1.TuitionPaymentFragmentbindingInflater1.b(p0, p1)));
        final Function1 function1 = new Function1() { // from class: isBoundToService
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mutableLiveData, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: notifyMessageChannelReady
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: notifyMessageChannelReadyInternal
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostMessageService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mutableLiveData, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: PostMessageServiceConnection
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        postMessageService1.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        mutableLiveData.observe(this, new Observer() { // from class: onDisconnectChannel
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EngagementSignalsCallback.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((PostMessageService1) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(getViewLifecycleOwner(), new Observer() { // from class: onNotifyMessageChannelReady
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                EngagementSignalsCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        TrustedWebUtils trustedWebUtils = (TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        Camera2CameraControl camera2CameraControl = trustedWebUtils.f253a;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = camera2CameraControl.b;
        camera2CameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
        camera2CameraControl.TuitionPaymentFragmentbindingInflater1 = true;
        trustedWebUtils.asInterface.addOnScrollListener(trustedWebUtils.f253a);
        ((PostMessageService1) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvOtherNews;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), this.TuitionPaymentFragmentbindingInflater1));
        recyclerView.addItemDecoration(new getConcurrentCameraSelectors(this.TuitionPaymentFragmentbindingInflater1));
        recyclerView.setAdapter((TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        TrustedWebUtils trustedWebUtils = (TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        trustedWebUtils.TuitionPaymentFragmentspecialinlinedviewModeldefault1(asInterface().rvOtherNews);
        trustedWebUtils.g = this;
        requireActivity().findViewById(R.id.layoutMainToolbar).setVisibility(0);
        ViewCompat.setOnApplyWindowInsetsListener(asInterface().getRoot(), new OnApplyWindowInsetsListener() { // from class: fromBinder
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return EngagementSignalsCallback.TuitionPaymentFragmentbindingInflater1(this.b, view, windowInsetsCompat);
            }
        });
    }

    @Override // addCaptureRequestOptionsInternal.TuitionPaymentFragmentbindingInflater1
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num) {
        ((TrustedWebUtils) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentbindingInflater1();
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }
}
