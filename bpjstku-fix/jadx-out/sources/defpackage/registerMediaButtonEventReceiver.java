package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.databinding.ItemMasterDataBinding;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00000\u0002:\u0001\u001eB=\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u000e\u001a\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0006\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u000e\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u0000H'¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 "}, d2 = {"LregisterMediaButtonEventReceiver;", ExifInterface.GPS_DIRECTION_TRUE, "LsetVirtualCameraRotationDegrees;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "LregisterMediaButtonEventReceiver$TuitionPaymentFragmentbindingInflater1;", "Landroid/content/Context;", "p0", "", "p1", "Lkotlin/Function1;", "", "p2", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Ljava/util/List;)V", "Landroid/view/ViewGroup;", "", "(Landroid/view/ViewGroup;)LregisterMediaButtonEventReceiver$TuitionPaymentFragmentbindingInflater1;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Ljava/lang/Object;)Ljava/lang/String;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Ljava/lang/String;Ljava/lang/Object;)Z", "b", "(Ljava/lang/String;)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "TuitionPaymentFragmentbindingInflater1", "LacquireBuffer;", "LacquireBuffer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class registerMediaButtonEventReceiver<T> extends setVirtualCameraRotationDegrees<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>, registerMediaButtonEventReceiver<T>.TuitionPaymentFragmentbindingInflater1> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<T, Unit> b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> TuitionPaymentFragmentbindingInflater1;

    public abstract String TuitionPaymentFragmentspecialinlinedviewModeldefault1(T p0);

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2(String p0, T p1);

    @Override // defpackage.setVirtualCameraRotationDegrees
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1 */
    public final /* synthetic */ VirtualCameraInfo onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    @Override // defpackage.setVirtualCameraRotationDegrees, androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3(viewGroup);
    }

    public /* synthetic */ registerMediaButtonEventReceiver(Context context, ArrayList arrayList, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public registerMediaButtonEventReceiver(Context context, List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list, Function1<? super T, Unit> function1) {
        super(context, list);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.b = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ArrayList();
        this.TuitionPaymentFragmentbindingInflater1 = new ArrayList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new acquireBuffer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.setVirtualCameraRotationDegrees
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        super.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.clear();
        List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        Collection<? extends lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> collection = this.d;
        Intrinsics.checkNotNullExpressionValue(collection, "");
        list.addAll(collection);
        this.TuitionPaymentFragmentbindingInflater1.clear();
        List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list2 = this.TuitionPaymentFragmentbindingInflater1;
        Collection<? extends lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> collection2 = this.d;
        Intrinsics.checkNotNullExpressionValue(collection2, "");
        list2.addAll(collection2);
    }

    private registerMediaButtonEventReceiver<T>.TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        ItemMasterDataBinding itemMasterDataBindingInflate = ItemMasterDataBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(itemMasterDataBindingInflate, "");
        setVirtualCameraRotationDegrees.b bVar = this.f1400a;
        setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.asInterface;
        return new TuitionPaymentFragmentbindingInflater1(this, itemMasterDataBindingInflate, null, null);
    }

    public final class TuitionPaymentFragmentbindingInflater1 extends VirtualCameraInfo<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> {
        private final ItemMasterDataBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ registerMediaButtonEventReceiver<T> b;

        /* JADX WARN: Illegal instructions before constructor call */
        public TuitionPaymentFragmentbindingInflater1(registerMediaButtonEventReceiver registermediabuttoneventreceiver, ItemMasterDataBinding itemMasterDataBinding, setVirtualCameraRotationDegrees.b bVar, setVirtualCameraRotationDegrees.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2) throws Throwable {
            Intrinsics.checkNotNullParameter(itemMasterDataBinding, "");
            this.b = registermediabuttoneventreceiver;
            Context context = registermediabuttoneventreceiver.asBinder;
            Intrinsics.checkNotNullExpressionValue(context, "");
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            super(context, root, null, null);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = itemMasterDataBinding;
        }

        @Override // defpackage.VirtualCameraInfo
        public final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj) throws Throwable {
            final lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            Intrinsics.checkNotNullParameter(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, "");
            ItemMasterDataBinding itemMasterDataBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            final registerMediaButtonEventReceiver<T> registermediabuttoneventreceiver = this.b;
            itemMasterDataBinding.tvName.setText(registermediabuttoneventreceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
            AppCompatImageView appCompatImageView = itemMasterDataBinding.imgSelected;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
            if (lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1) {
                AppCompatImageView appCompatImageView2 = itemMasterDataBinding.imgSelected;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                appCompatImageView2.setVisibility(0);
            }
            RelativeLayout root = itemMasterDataBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: sendEvent
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return registerMediaButtonEventReceiver.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(registermediabuttoneventreceiver, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, (View) obj2);
                }
            }));
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(registerMediaButtonEventReceiver registermediabuttoneventreceiver, lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function1 function1 = registermediabuttoneventreceiver.b;
            if (function1 != null) {
                function1.invoke(lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return Unit.INSTANCE;
        }
    }

    public final void b(final String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        VideoRecordEventStart<T> videoRecordEventStartObserveOn = VideoRecordEventStart.fromCallable(new Callable() { // from class: MediaSessionCompatMediaSessionImplApi19
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return registerMediaButtonEventReceiver.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, p0);
            }
        }).subscribeOn(isSamsungJ2.b()).observeOn(dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1());
        final Function1 function1 = new Function1() { // from class: MediaSessionCompatMediaSessionImplApi21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return registerMediaButtonEventReceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (List) obj);
            }
        };
        logToString<? super T> logtostring = new logToString() { // from class: onMetadataUpdate
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: buildRccMetadata
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return registerMediaButtonEventReceiver.TuitionPaymentFragmentbindingInflater1((Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartObserveOn.subscribe(logtostring, new logToString() { // from class: MediaSessionCompatMediaSessionImplApi191
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateSubscribe, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
    }

    public static /* synthetic */ List b(registerMediaButtonEventReceiver registermediabuttoneventreceiver, String str) {
        if (str.length() == 0) {
            return registermediabuttoneventreceiver.TuitionPaymentFragmentbindingInflater1;
        }
        List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<T>> list = registermediabuttoneventreceiver.TuitionPaymentFragmentbindingInflater1;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (registermediabuttoneventreceiver.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, ((lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) t).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                arrayList.add(t);
            }
        }
        return CollectionsKt.toMutableList((Collection) arrayList);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Throwable th) throws IOException {
        getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(th);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(registerMediaButtonEventReceiver registermediabuttoneventreceiver, List list) {
        registermediabuttoneventreceiver.d.clear();
        List<Data> list2 = registermediabuttoneventreceiver.d;
        Intrinsics.checkNotNull(list);
        list2.addAll(list);
        registermediabuttoneventreceiver.notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
