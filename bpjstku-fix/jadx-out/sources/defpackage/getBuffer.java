package defpackage;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.core.app.ActivityCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"LgetBuffer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lkotlin/Function1;", "LgetBuffer$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p1", "Lkotlin/Function0;", "p2", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()LgetBuffer$TuitionPaymentFragmentspecialinlinedviewModeldefault2;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getBuffer {
    public static final getBuffer INSTANCE = new getBuffer();

    private getBuffer() {
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public final String TuitionPaymentFragmentbindingInflater1;
        public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        public final String b;

        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentbindingInflater1 = str2;
            this.b = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (TuitionPaymentFragmentspecialinlinedviewModeldefault2) obj;
            return Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1) && Intrinsics.areEqual(this.b, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
        }

        public final int hashCode() {
            return (((this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode() * 31) + this.TuitionPaymentFragmentbindingInflater1.hashCode()) * 31) + this.b.hashCode();
        }

        public final String toString() {
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String str2 = this.TuitionPaymentFragmentbindingInflater1;
            String str3 = this.b;
            StringBuilder sb = new StringBuilder("LocationInfo(latitude=");
            sb.append(str);
            sb.append(", longitude=");
            sb.append(str2);
            sb.append(", locality=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Context p0, final Function1<? super TuitionPaymentFragmentspecialinlinedviewModeldefault2, Unit> p1, final Function0<Unit> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(p0);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
        if (ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            p2.invoke();
            return;
        }
        Task<Location> lastLocation = fusedLocationProviderClient.getLastLocation();
        final Function1 function1 = new Function1() { // from class: AndroidImageReaderProxy
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getBuffer.b(p0, p1, p2, (Location) obj);
            }
        };
        lastLocation.addOnSuccessListener(new OnSuccessListener() { // from class: clearOnImageAvailableListener
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: acquireLatestImage
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                getBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p2, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(Context context, Function1 function1, Function0 function0, Location location) {
        String locality;
        Address address;
        if (location != null) {
            try {
                List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                if (fromLocation == null || (address = (Address) CollectionsKt.firstOrNull((List) fromLocation)) == null || (locality = address.getLocality()) == null) {
                    locality = "Unknown";
                }
                function1.invoke(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude()), locality));
            } catch (Exception unused) {
                function1.invoke(new TuitionPaymentFragmentspecialinlinedviewModeldefault2(String.valueOf(location.getLatitude()), String.valueOf(location.getLongitude()), "Unknown"));
            }
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return new TuitionPaymentFragmentspecialinlinedviewModeldefault2("0.0", "0.0", "Unknown");
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function0 function0, Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        function0.invoke();
    }
}
