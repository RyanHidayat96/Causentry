package defpackage;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.transition.TransitionManager;
import com.bpjstku.R;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import com.rtchagas.pingplacepicker.viewmodel.Resource;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import defpackage.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1;
import defpackage.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.AnonymousClass5;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u00012\u00020\u0002:\u0002\u001d\u000bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0014\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0015\u0010\u001c\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"LsetAudioSpec;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "LAutoValue_FileOutputOptions_FileOutputOptionsInternal;", "<init>", "()V", "Landroid/view/View;", "p0", "Lcom/rtchagas/pingplacepicker/viewmodel/Resource;", "Landroid/graphics/Bitmap;", "p1", "", "TuitionPaymentFragmentbindingInflater1", "(Landroid/view/View;Lcom/rtchagas/pingplacepicker/viewmodel/Resource;)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "LsetAudioSpec$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LsetAudioSpec$TuitionPaymentFragmentbindingInflater1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Lcom/google/android/libraries/places/api/model/Place;", "Lcom/google/android/libraries/places/api/model/Place;", "LAutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1;", "g", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "b"}, k = 1, mv = {2, 3, 0})
public final class setAudioSpec extends AppCompatDialogFragment implements AutoValue_FileOutputOptions_FileOutputOptionsInternal {
    private static /* synthetic */ KProperty[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(setAudioSpec.class), "viewModel", "getViewModel()Lcom/rtchagas/pingplacepicker/viewmodel/PlaceConfirmDialogViewModel;"))};

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private Place TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private HashMap TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1>() { // from class: com.rtchagas.pingplacepicker.ui.PlaceConfirmDialogFragment$$special$$inlined$viewModel$1
        final /* synthetic */ mapPoint $qualifier = null;
        final /* synthetic */ Function0 $parameters = null;

        /* JADX WARN: Type inference failed for: r0v8, types: [AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1, androidx.lifecycle.ViewModel] */
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1 invoke() {
            LifecycleOwner lifecycleOwner = this;
            mapPoint mappoint = this.$qualifier;
            Function0 function0 = this.$parameters;
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.class);
            if (lifecycleOwner != null) {
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
            }
            throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
        }

        {
            super(0);
        }
    });

    public interface TuitionPaymentFragmentbindingInflater1 {
        void b(Place place);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final /* synthetic */ Place b(setAudioSpec setaudiospec) {
        Place place = setaudiospec.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (place == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return place;
    }

    /* JADX INFO: renamed from: setAudioSpec$b, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LsetAudioSpec$b;", "", "<init>", "()V", "Lcom/google/android/libraries/places/api/model/Place;", "p0", "LsetAudioSpec$TuitionPaymentFragmentbindingInflater1;", "p1", "LsetAudioSpec;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/google/android/libraries/places/api/model/Place;LsetAudioSpec$TuitionPaymentFragmentbindingInflater1;)LsetAudioSpec;"}, k = 1, mv = {2, 3, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static setAudioSpec TuitionPaymentFragmentspecialinlinedviewModeldefault2(Place p0, TuitionPaymentFragmentbindingInflater1 p1) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("arg_place", p0);
            setAudioSpec setaudiospec = new setAudioSpec();
            setaudiospec.setArguments(bundle);
            setaudiospec.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p1;
            return setaudiospec;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) {
        super.onCreate(p0);
        if (requireArguments().getParcelable("arg_place") == null) {
            throw new IllegalArgumentException("You must pass a Place as argument to this fragment");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("arg_place");
            if (parcelable == null) {
                Intrinsics.throwNpe();
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (Place) parcelable;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle p0) throws Throwable {
        MutableLiveData<Resource<Bitmap>> mutableLiveData;
        FileOutputOptionsFileOutputOptionsInternal fileOutputOptionsFileOutputOptionsInternal;
        Bitmap bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            Intrinsics.throwNpe();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        AlertDialog.Builder title = builder.setTitle(R.string.picker_place_confirm);
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(activity2, "");
        final View viewInflate = LayoutInflater.from(activity2).inflate(R.layout.fragment_dialog_place_confirm, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(viewInflate, "");
        TextView textView = (TextView) viewInflate.findViewById(R.id.tvPlaceName);
        Intrinsics.checkExpressionValueIsNotNull(textView, "");
        Place place = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (place == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView.setText(place.getName());
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tvPlaceAddress);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "");
        Place place2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (place2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView2.setText(place2.getAddress());
        if (!getResources().getBoolean(R.bool.show_confirmation_map)) {
            title = title;
            builder = builder;
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ivPlaceMap);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "");
            imageView.setVisibility(8);
        } else {
            Place place3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (place3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LatLng latLng = place3.getLatLng();
            Double dValueOf = latLng != null ? Double.valueOf(latLng.latitude) : null;
            Place place4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (place4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LatLng latLng2 = place4.getLatLng();
            Double dValueOf2 = latLng2 != null ? Double.valueOf(latLng2.longitude) : null;
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
            String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = String.format("https://maps.googleapis.com/maps/api/staticmap?size=640x320&markers=color:red|%.6f,%.6f&key=%s", Arrays.copyOf(new Object[]{dValueOf, dValueOf2, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1()}, 3));
            Intrinsics.checkExpressionValueIsNotNull(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
            AutoValue_MediaSpecBuilder autoValue_MediaSpecBuilder = AutoValue_MediaSpecBuilder.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkExpressionValueIsNotNull(contextRequireContext, "");
            if (AutoValue_MediaSpecBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext)) {
                StringBuilder sb = new StringBuilder();
                sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sb.append("&style=element:geometry%7Ccolor:0x242f3e&style=element:labels.text.fill%7Ccolor:0x746855&style=element:labels.text.stroke%7Ccolor:0x242f3e&style=feature:administrative.locality%7Celement:labels.text.fill%7Ccolor:0xd59563&style=feature:poi%7Celement:labels.text.fill%7Ccolor:0xd59563&style=feature:poi.park%7Celement:geometry%7Ccolor:0x263c3f&style=feature:poi.park%7Celement:labels.text.fill%7Ccolor:0x6b9a76&style=feature:road%7Celement:geometry%7Ccolor:0x38414e&style=feature:road%7Celement:geometry.stroke%7Ccolor:0x212a37&style=feature:road%7Celement:labels.text.fill%7Ccolor:0x9ca5b3&style=feature:road.highway%7Celement:geometry%7Ccolor:0x746855&style=feature:road.highway%7Celement:geometry.stroke%7Ccolor:0x1f2835&style=feature:road.highway%7Celement:labels.text.fill%7Ccolor:0xf3d19c&style=feature:transit%7Celement:geometry%7Ccolor:0x2f3948&style=feature:transit.station%7Celement:labels.text.fill%7Ccolor:0xd59563&style=feature:water%7Celement:geometry%7Ccolor:0x17263c&style=feature:water%7Celement:labels.text.fill%7Ccolor:0x515c6d&style=feature:water%7Celement:labels.text.stroke%7Ccolor:0x17263c");
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sb.toString();
            }
            AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion2 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
            if (AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.b().length() > 0) {
                setParcelFileDescriptor setparcelfiledescriptor = setParcelFileDescriptor.INSTANCE;
                AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion companion3 = AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.INSTANCE;
                strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = setParcelFileDescriptor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault1, AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternalBuilder.Companion.b());
            }
            Picasso picassoB = Picasso.b();
            if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                fileOutputOptionsFileOutputOptionsInternal = new FileOutputOptionsFileOutputOptionsInternal(picassoB, null);
            } else {
                if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1.trim().length() == 0) {
                    throw new IllegalArgumentException("Path must not be empty.");
                }
                fileOutputOptionsFileOutputOptionsInternal = new FileOutputOptionsFileOutputOptionsInternal(picassoB, Uri.parse(strTuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
            ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.ivPlaceMap);
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(viewInflate);
            long jNanoTime = System.nanoTime();
            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            if (imageView2 == null) {
                throw new IllegalArgumentException("Target must not be null.");
            }
            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = fileOutputOptionsFileOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (tuitionPaymentFragmentbindingInflater1.INotificationSideChannelStubProxy == null && tuitionPaymentFragmentbindingInflater1.d == 0) {
                Picasso picasso = fileOutputOptionsFileOutputOptionsInternal.d;
                if (imageView2 == null) {
                    throw new IllegalArgumentException("view cannot be null.");
                }
                picasso.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView2);
                if (fileOutputOptionsFileOutputOptionsInternal.cancelAll) {
                    int i = fileOutputOptionsFileOutputOptionsInternal.cancel;
                    FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageView2, fileOutputOptionsFileOutputOptionsInternal.f144a);
                }
                title = title;
                builder = builder;
            } else {
                boolean z = fileOutputOptionsFileOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int andIncrement = FileOutputOptionsFileOutputOptionsInternal.b.getAndIncrement();
                FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = fileOutputOptionsFileOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                boolean z2 = tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                boolean z3 = tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (tuitionPaymentFragmentbindingInflater2.asInterface == null) {
                    tuitionPaymentFragmentbindingInflater2.asInterface = Picasso.Priority.NORMAL;
                }
                FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder = new FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder(tuitionPaymentFragmentbindingInflater2.INotificationSideChannelStubProxy, tuitionPaymentFragmentbindingInflater2.d, tuitionPaymentFragmentbindingInflater2.cancel, tuitionPaymentFragmentbindingInflater2.RemoteActionCompatParcelizer, tuitionPaymentFragmentbindingInflater2.INotificationSideChannel, tuitionPaymentFragmentbindingInflater2.onTransact, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault2, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentbindingInflater2.f142a, tuitionPaymentFragmentbindingInflater2.asBinder, tuitionPaymentFragmentbindingInflater2.cancelAll, tuitionPaymentFragmentbindingInflater2.notify, tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, tuitionPaymentFragmentbindingInflater2.g, tuitionPaymentFragmentbindingInflater2.b, tuitionPaymentFragmentbindingInflater2.asInterface, (byte) 0);
                fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.d = andIncrement;
                fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.INotificationSideChannelStub = jNanoTime;
                boolean z4 = fileOutputOptionsFileOutputOptionsInternal.d.d;
                if (z4) {
                    StringBuilder sb2 = new StringBuilder("[R");
                    sb2.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.d);
                    sb2.append(']');
                    outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "created", sb2.toString(), fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder.toString());
                }
                Picasso picasso2 = fileOutputOptionsFileOutputOptionsInternal.d;
                FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB = picasso2.g.b(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
                if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB != null) {
                    if (fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB != fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder) {
                        fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB.d = andIncrement;
                        fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB.INotificationSideChannelStub = jNanoTime;
                        if (z4) {
                            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "changed", fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB.b(), "into ".concat(String.valueOf(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB)));
                        }
                    }
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault2 = outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB);
                    if (MemoryPolicy.TuitionPaymentFragmentspecialinlinedviewModeldefault2(fileOutputOptionsFileOutputOptionsInternal.asInterface) && (bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1 = fileOutputOptionsFileOutputOptionsInternal.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(strTuitionPaymentFragmentspecialinlinedviewModeldefault2)) != null) {
                        Picasso picasso3 = fileOutputOptionsFileOutputOptionsInternal.d;
                        if (imageView2 == null) {
                            throw new IllegalArgumentException("view cannot be null.");
                        }
                        picasso3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageView2);
                        FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2(imageView2, fileOutputOptionsFileOutputOptionsInternal.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bitmapTuitionPaymentFragmentspecialinlinedviewModeldefault1, Picasso.LoadedFrom.MEMORY, fileOutputOptionsFileOutputOptionsInternal.asBinder, fileOutputOptionsFileOutputOptionsInternal.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                        if (fileOutputOptionsFileOutputOptionsInternal.d.d) {
                            StringBuilder sb3 = new StringBuilder("[R");
                            sb3.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB.d);
                            sb3.append(']');
                            String string = sb3.toString();
                            StringBuilder sb4 = new StringBuilder("from ");
                            sb4.append(Picasso.LoadedFrom.MEMORY);
                            outputFormatToMuxerFormat.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Main", "completed", string, sb4.toString());
                        }
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                    } else {
                        if (fileOutputOptionsFileOutputOptionsInternal.cancelAll) {
                            int i2 = fileOutputOptionsFileOutputOptionsInternal.cancel;
                            FileDescriptorOutputOptionsFileDescriptorOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageView2, fileOutputOptionsFileOutputOptionsInternal.f144a);
                        }
                        fileOutputOptionsFileOutputOptionsInternal.d.TuitionPaymentFragmentbindingInflater1(new FallbackStrategy(fileOutputOptionsFileOutputOptionsInternal.d, imageView2, fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilderB, fileOutputOptionsFileOutputOptionsInternal.asInterface, fileOutputOptionsFileOutputOptionsInternal.g, fileOutputOptionsFileOutputOptionsInternal.TuitionPaymentFragmentspecialinlinedviewModeldefault2, fileOutputOptionsFileOutputOptionsInternal.TuitionPaymentFragmentbindingInflater1, strTuitionPaymentFragmentspecialinlinedviewModeldefault2, fileOutputOptionsFileOutputOptionsInternal.notify, tuitionPaymentFragmentspecialinlinedviewModeldefault1, fileOutputOptionsFileOutputOptionsInternal.asBinder));
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder("Request transformer ");
                    sb5.append(picasso2.g.getClass().getCanonicalName());
                    sb5.append(" returned null for ");
                    sb5.append(fileDescriptorOutputOptionsFileDescriptorOutputOptionsInternalBuilder);
                    throw new IllegalStateException(sb5.toString());
                }
            }
        }
        Place place5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (place5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        List<PhotoMetadata> photoMetadatas = place5.getPhotoMetadatas();
        if (getResources().getBoolean(R.bool.show_confirmation_photo) && photoMetadatas != null && !photoMetadatas.isEmpty()) {
            PhotoMetadata photoMetadata = photoMetadatas.get(0);
            Lazy lazy = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            KProperty kProperty = TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
            AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1 autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1 = (AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1) lazy.getValue();
            Intrinsics.checkExpressionValueIsNotNull(photoMetadata, "");
            if (autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.b.getValue() != null) {
                mutableLiveData = autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.b;
            } else {
                deriveCodec<Bitmap> derivecodecTuitionPaymentFragmentbindingInflater1 = autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1(photoMetadata);
                appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
                share.b(appendbackupvideoprofileB, "scheduler is null");
                SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(derivecodecTuitionPaymentFragmentbindingInflater1, appendbackupvideoprofileB);
                appendBackupVideoProfile appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1 = dumpAudioCapabilities.TuitionPaymentFragmentbindingInflater1();
                share.b(appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1, "scheduler is null");
                SingleObserveOn singleObserveOn = new SingleObserveOn(singleSubscribeOn, appendbackupvideoprofileTuitionPaymentFragmentbindingInflater1);
                AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.AnonymousClass3 anonymousClass3 = new logToString<BufferProviderState>() { // from class: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.3
                    @Override // defpackage.logToString
                    /* JADX INFO: renamed from: b */
                    public final void accept(BufferProviderState bufferProviderState) {
                        MutableLiveData mutableLiveData2 = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.this.b;
                        Resource.Companion companion4 = Resource.INSTANCE;
                        mutableLiveData2.setValue(Resource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                    }

                    public AnonymousClass3() {
                    }
                };
                share.b(anonymousClass3, "onSubscribe is null");
                BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = new SilentAudioStreamExternalSyntheticLambda0(singleObserveOn, anonymousClass3).TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.new AnonymousClass5(), new logToString<Throwable>() { // from class: AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.4
                    @Override // defpackage.logToString
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1 */
                    public final void accept(Throwable th) {
                        MutableLiveData mutableLiveData2 = AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.this.b;
                        Resource.Companion companion4 = Resource.INSTANCE;
                        mutableLiveData2.setValue(Resource.Companion.TuitionPaymentFragmentbindingInflater1(th));
                    }

                    public AnonymousClass4() {
                    }
                });
                Intrinsics.checkExpressionValueIsNotNull(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
                autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                mutableLiveData = autoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal1.b;
            }
            mutableLiveData.observe(this, new Observer<Resource<Bitmap>>() { // from class: setAudioSpec.3
                @Override // androidx.p002lifecycle.Observer
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                public final void onChanged(Resource<Bitmap> resource) {
                    View view = viewInflate;
                    Intrinsics.checkExpressionValueIsNotNull(resource, "");
                    setAudioSpec.TuitionPaymentFragmentbindingInflater1(view, resource);
                }
            });
        } else {
            Resource.Companion companion4 = Resource.INSTANCE;
            TuitionPaymentFragmentbindingInflater1(viewInflate, Resource.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
        title.setView(viewInflate).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: setAudioSpec.1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater3 = setAudioSpec.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                if (tuitionPaymentFragmentbindingInflater3 != null) {
                    tuitionPaymentFragmentbindingInflater3.b(setAudioSpec.b(setAudioSpec.this));
                }
                setAudioSpec.this.dismiss();
            }
        }).setNegativeButton(R.string.picker_place_confirm_cancel, new DialogInterface.OnClickListener() { // from class: setAudioSpec.2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                setAudioSpec.this.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        Intrinsics.checkExpressionValueIsNotNull(alertDialogCreate, "");
        return alertDialogCreate;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements getSupportedQualities {
        private /* synthetic */ View TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(View view) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = view;
        }

        @Override // defpackage.getSupportedQualities
        public final void TuitionPaymentFragmentbindingInflater1() {
            ImageView imageView = (ImageView) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.findViewById(R.id.ivPlaceMap);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "");
            imageView.setVisibility(0);
        }

        @Override // defpackage.getSupportedQualities
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Exception exc) {
            ImageView imageView = (ImageView) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.findViewById(R.id.ivPlaceMap);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "");
            imageView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void TuitionPaymentFragmentbindingInflater1(View p0, Resource<Bitmap> p1) {
        if (p1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != Resource.Status.SUCCESS) {
            ImageView imageView = (ImageView) p0.findViewById(R.id.ivPlacePhoto);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "");
            imageView.setVisibility(8);
        } else {
            if (p0 != null) {
                TransitionManager.beginDelayedTransition((ViewGroup) p0);
                ImageView imageView2 = (ImageView) p0.findViewById(R.id.ivPlacePhoto);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "");
                imageView2.setVisibility(0);
                ((ImageView) p0.findViewById(R.id.ivPlacePhoto)).setImageBitmap(p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    @Override // defpackage.getEventTime
    public final ZoomGestureDetectorZoomEvent getKoin() {
        getAudioSpec getaudiospec = getAudioSpec.INSTANCE;
        getFocusX getfocusxB = getAudioSpec.b();
        ZoomGestureDetectorZoomEvent zoomGestureDetectorZoomEvent = getfocusxB != null ? getfocusxB.b : null;
        if (zoomGestureDetectorZoomEvent == null) {
            Intrinsics.throwNpe();
        }
        return zoomGestureDetectorZoomEvent;
    }
}
