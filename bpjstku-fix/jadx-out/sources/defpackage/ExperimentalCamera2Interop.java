package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.util.utils.LocationAddressInfo;
import com.bpjstku.util.utils.LocationHelper$dispatchMain$1;
import com.bpjstku.util.utils.LocationHelper$getAddressFromCoordinatesAsync$2;
import com.bpjstku.util.utils.UserLocation;
import com.bpjstku.util.utils.UserLocationComplete;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ-\u0010\t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0003¢\u0006\u0004\b\t\u0010\u0011J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u000b0\u000eH\u0003¢\u0006\u0004\b\f\u0010\u0011J\u000f\u0010\f\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\f\u0010\u0013J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00152\u0006\u0010\b\u001a\u00020\u0014¢\u0006\u0004\b\t\u0010\u0016J'\u0010\u0005\u001a\u0004\u0018\u00010\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0005\u0010\u001aJ+\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u000b0\u000e¢\u0006\u0004\b\u0005\u0010\u0011JC\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b\u0005\u0010\u001fJ9\u0010\t\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000b0\u000e2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001c¢\u0006\u0004\b\t\u0010 "}, d2 = {"LExperimentalCamera2Interop;", "", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "()Z", "Landroid/content/Context;", "p0", "b", "(Landroid/content/Context;)Z", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Landroid/content/Context;)V", "Lkotlin/Function1;", "Landroid/location/Location;", "p1", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "", "()Ljava/lang/String;", "Lcom/bpjstku/data/lib/PreferenceManager;", "LCamera2CameraControlExternalSyntheticLambda4;", "(Lcom/bpjstku/data/lib/PreferenceManager;)LCamera2CameraControlExternalSyntheticLambda4;", "", "p2", "Lcom/bpjstku/util/utils/LocationAddressInfo;", "(Landroid/content/Context;DD)Lcom/bpjstku/util/utils/LocationAddressInfo;", "Lcom/bpjstku/util/utils/UserLocationComplete;", "Lkotlin/Function0;", "p3", "p4", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExperimentalCamera2Interop {
    public static final ExperimentalCamera2Interop INSTANCE = new ExperimentalCamera2Interop();

    private ExperimentalCamera2Interop() {
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() throws IOException {
        try {
            Object systemService = ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2().getSystemService(FirebaseAnalytics.Param.LOCATION);
            Intrinsics.checkNotNull(systemService, "");
            LocationManager locationManager = (LocationManager) systemService;
            if (Build.VERSION.SDK_INT >= 28) {
                return locationManager.isLocationEnabled();
            }
            return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
        } catch (Exception e2) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Error checking GPS status: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
            return false;
        }
    }

    public static boolean b(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    public static void b(final Context p0, final Function1<? super Location, Unit> p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            getContentPaddingRight.TuitionPaymentFragmentbindingInflater1("Location permission not granted", new Object[0]);
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, null, null), 3, null);
            return;
        }
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(p0);
        Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "");
        Task<Location> currentLocation = fusedLocationProviderClient.getCurrentLocation(100, new CancellationTokenSource().getToken());
        final Function1 function1 = new Function1() { // from class: getImageInfo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1, p0, (Location) obj);
            }
        };
        currentLocation.addOnSuccessListener(new OnSuccessListener() { // from class: getPlanes
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: isImageReaderContextNotInitializedException
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) throws IOException {
                ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, p1, exc);
            }
        });
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Context p0, Function1<? super Location, Unit> p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        if (ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_FINE_LOCATION") != 0 && ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, null, null), 3, null);
            return;
        }
        try {
            Object systemService = p0.getSystemService(FirebaseAnalytics.Param.LOCATION);
            Intrinsics.checkNotNull(systemService, "");
            LocationManager locationManager = (LocationManager) systemService;
            Location lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                double latitude = lastKnownLocation.getLatitude();
                double longitude = lastKnownLocation.getLongitude();
                StringBuilder sb = new StringBuilder("Using LocationManager GPS fallback: ");
                sb.append(latitude);
                sb.append(", ");
                sb.append(longitude);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString(), new Object[0]);
                b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, lastKnownLocation, null), 3, null);
                return;
            }
            Location lastKnownLocation2 = locationManager.getLastKnownLocation("network");
            if (lastKnownLocation2 != null) {
                double latitude2 = lastKnownLocation2.getLatitude();
                double longitude2 = lastKnownLocation2.getLongitude();
                StringBuilder sb2 = new StringBuilder("Using LocationManager Network fallback: ");
                sb2.append(latitude2);
                sb2.append(", ");
                sb2.append(longitude2);
                getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb2.toString(), new Object[0]);
                b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, lastKnownLocation2, null), 3, null);
                return;
            }
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            Intrinsics.checkNotNullParameter(p0, "");
            boolean z = ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(p0, "android.permission.ACCESS_COARSE_LOCATION") == 0;
            StringBuilder sb3 = new StringBuilder("All location acquisition attempts failed, returning null. GPS Enabled: ");
            sb3.append(zTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            sb3.append(", Permission Granted: ");
            sb3.append(z);
            getContentPaddingRight.TuitionPaymentFragmentbindingInflater1(sb3.toString(), new Object[0]);
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, null, null), 3, null);
        } catch (Exception e2) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "LocationManager fallback error: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(p1, null, null), 3, null);
        }
    }

    public static String TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws IOException {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            Intrinsics.checkNotNullExpressionValue(list, "");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                Intrinsics.checkNotNullExpressionValue(it2, "");
                while (it2.hasNext()) {
                    InetAddress inetAddress = (InetAddress) it2.next();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        String hostAddress = ((Inet4Address) inetAddress).getHostAddress();
                        return hostAddress == null ? "0.0.0.0" : hostAddress;
                    }
                }
            }
        } catch (SocketException e2) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Error getting IP address: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
        } catch (Exception e3) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e3, "Error getting IP address: ".concat(String.valueOf(e3.getMessage())), new Object[0]);
        }
        return "0.0.0.0";
    }

    public static Camera2CameraControlExternalSyntheticLambda4 b(PreferenceManager p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        String string = p0.getString("CACHED_LATITUDE", "0.0");
        String string2 = p0.getString("CACHED_LONGITUDE", "0.0");
        if (Intrinsics.areEqual(string, "0.0") || Intrinsics.areEqual(string2, "0.0") || string.length() == 0 || string2.length() == 0) {
            return null;
        }
        return new Camera2CameraControlExternalSyntheticLambda4(string, string2, p0.getString("CACHED_CITY", ""), p0.getString("CACHED_PROVINCE", ""), p0.getString("CACHED_COUNTRY", ""), p0.getString("CACHED_FULL_ADDRESS", ""));
    }

    public static LocationAddressInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, double p1, double p2) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            if (!Geocoder.isPresent()) {
                getContentPaddingRight.asBinder("Geocoder is not available on this device", new Object[0]);
                return null;
            }
            List<Address> fromLocation = new Geocoder(p0, Locale.getDefault()).getFromLocation(p1, p2, 1);
            List<Address> list = fromLocation;
            if (list != null && !list.isEmpty()) {
                Address address = fromLocation.get(0);
                String subAdminArea = address.getSubAdminArea();
                String str = (subAdminArea == null && (subAdminArea = address.getLocality()) == null) ? "" : subAdminArea;
                String locality = address.getLocality();
                String str2 = (locality == null && (locality = address.getSubLocality()) == null) ? "" : locality;
                String subLocality = address.getSubLocality();
                String str3 = subLocality == null ? "" : subLocality;
                String adminArea = address.getAdminArea();
                String str4 = adminArea == null ? "" : adminArea;
                String countryName = address.getCountryName();
                String str5 = countryName == null ? "" : countryName;
                String countryCode = address.getCountryCode();
                String str6 = countryCode == null ? "" : countryCode;
                String postalCode = address.getPostalCode();
                String str7 = postalCode == null ? "" : postalCode;
                String addressLine = address.getAddressLine(0);
                return new LocationAddressInfo(str, str2, str3, str4, str5, str6, str7, addressLine == null ? "" : addressLine);
            }
            StringBuilder sb = new StringBuilder("No address found for coordinates: ");
            sb.append(p1);
            sb.append(", ");
            sb.append(p2);
            getContentPaddingRight.asBinder(sb.toString(), new Object[0]);
            return null;
        } catch (Exception e2) {
            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2, "Error getting address from coordinates: ".concat(String.valueOf(e2.getMessage())), new Object[0]);
            return null;
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, Function1<? super UserLocationComplete, Unit> p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        b(p0, new setCropRect(p0, p1, TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
    }

    private static void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context p0, String p1, String p2, final Function0<Unit> p3, final Function0<Unit> p4) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        new AlertDialog.Builder(p0).setTitle(p1).setMessage(p2).setPositiveButton("Coba Lagi", new DialogInterface.OnClickListener() { // from class: getPixelStride
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ExperimentalCamera2Interop.TuitionPaymentFragmentbindingInflater1(p3, dialogInterface);
            }
        }).setNegativeButton("Batal", new DialogInterface.OnClickListener() { // from class: AndroidImageProxy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ExperimentalCamera2Interop.b(p4, dialogInterface);
            }
        }).setCancelable(false).show();
    }

    public final void b(final Context p0, final Function1<? super UserLocationComplete, Unit> p1, final Function0<Unit> p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3()) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, "GPS Tidak Aktif", "Silakan aktifkan GPS pada perangkat Anda untuk melanjutkan.", new Function0() { // from class: getCropRect
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0);
                }
            }, p2);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(p0, new Function1() { // from class: AndroidImageProxyPlaneProxy
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3(p1, p0, p2, (UserLocationComplete) obj);
                }
            });
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1, Context context, Location location) throws IOException {
        if (location == null) {
            getContentPaddingRight.asBinder("getCurrentLocation returned null, trying fallback", new Object[0]);
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, function1);
        } else {
            getContentPaddingRight.b bVarB = getContentPaddingRight.b("LocationHelper");
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            boolean zHasAccuracy = location.hasAccuracy();
            float accuracy = location.getAccuracy();
            StringBuilder sb = new StringBuilder();
            sb.append("UpdateLocation");
            sb.append(" LL ");
            sb.append(latitude);
            sb.append(",");
            sb.append(longitude);
            sb.append(" ; has accuracy : ");
            sb.append(zHasAccuracy);
            sb.append("; accuracy : ");
            sb.append(accuracy);
            bVarB.b(sb.toString(), new Object[0]);
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function1, location, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Function1 function1, Location location) {
        function1.invoke(location != null ? new UserLocation(location.getLatitude(), location.getLongitude()) : null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(Function0 function0, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static /* synthetic */ Unit b(Function1 function1, Location location, String str, boolean z, LocationAddressInfo locationAddressInfo) {
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function1, new UserLocationComplete(location.getLatitude(), location.getLongitude(), str, locationAddressInfo, z), null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function0 function0, DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        function0.invoke();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Function1 function1, final Context context, final Function0 function0, UserLocationComplete userLocationComplete) {
        if (userLocationComplete != null && userLocationComplete.b != 0.0d && userLocationComplete.TuitionPaymentFragmentspecialinlinedviewModeldefault3 != 0.0d) {
            function1.invoke(userLocationComplete);
        } else {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, "Gagal Mendapatkan Lokasi", "Tidak dapat mendeteksi lokasi Anda. Pastikan GPS dan koneksi internet Anda aktif, lalu coba lagi.", new Function0() { // from class: CaptureRequestOptionsBuilderExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExperimentalCamera2Interop.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context, function1, function0);
                }
            }, function0);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(Function1 function1, List list) {
        LocationAddressInfo locationAddressInfo;
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            locationAddressInfo = null;
        } else {
            Address address = (Address) list.get(0);
            String subAdminArea = address.getSubAdminArea();
            String str = (subAdminArea == null && (subAdminArea = address.getLocality()) == null) ? "" : subAdminArea;
            String locality = address.getLocality();
            String str2 = (locality == null && (locality = address.getSubLocality()) == null) ? "" : locality;
            String subLocality = address.getSubLocality();
            String str3 = subLocality == null ? "" : subLocality;
            String adminArea = address.getAdminArea();
            String str4 = adminArea == null ? "" : adminArea;
            String countryName = address.getCountryName();
            String str5 = countryName == null ? "" : countryName;
            String countryCode = address.getCountryCode();
            String str6 = countryCode == null ? "" : countryCode;
            String postalCode = address.getPostalCode();
            String str7 = postalCode == null ? "" : postalCode;
            String addressLine = address.getAddressLine(0);
            locationAddressInfo = new LocationAddressInfo(str, str2, str3, str4, str5, str6, str7, addressLine == null ? "" : addressLine);
        }
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function1, locationAddressInfo, null), 3, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, Function1 function1, Function0 function0) {
        INSTANCE.b(context, function1, function0);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Context context, final Function1 function1, final String str, final Location location) throws IOException {
        final boolean zIsFromMockProvider;
        Function1 function2;
        if (location == null) {
            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function1, null, null), 3, null);
        } else {
            if (Build.VERSION.SDK_INT >= 31) {
                zIsFromMockProvider = location.isMock();
            } else {
                zIsFromMockProvider = location.isFromMockProvider();
            }
            if (zIsFromMockProvider) {
                getContentPaddingRight.asBinder("Mock location detected! Location may be fake.", new Object[0]);
            }
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            final Function1 function3 = new Function1() { // from class: getImage
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ExperimentalCamera2Interop.b(function1, location, str, zIsFromMockProvider, (LocationAddressInfo) obj);
                }
            };
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(function3, "");
            try {
                if (!Geocoder.isPresent()) {
                    getContentPaddingRight.asBinder("Geocoder is not available on this device", new Object[0]);
                    b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function3, null, null), 3, null);
                } else {
                    Geocoder geocoder = new Geocoder(context, Locale.getDefault());
                    if (Build.VERSION.SDK_INT >= 33) {
                        geocoder.getFromLocation(latitude, longitude, 1, new Geocoder.GeocodeListener() { // from class: getRowStride
                            @Override // android.location.Geocoder.GeocodeListener
                            public final void onGeocode(List list) {
                                ExperimentalCamera2Interop.TuitionPaymentFragmentbindingInflater1(function3, list);
                            }
                        });
                    } else {
                        function2 = function3;
                        function3 = null;
                        try {
                            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new LocationHelper$getAddressFromCoordinatesAsync$2(context, latitude, longitude, function3, null), 3, null);
                        } catch (Exception e2) {
                            e = e2;
                            getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e, "Error getting address async: ".concat(String.valueOf(e.getMessage())), new Object[0]);
                            b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationHelper$dispatchMain$1(function2, null, null), 3, null);
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                function2 = function3;
            }
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Context context, Function1 function1, Exception exc) throws IOException {
        Intrinsics.checkNotNullParameter(exc, "");
        getContentPaddingRight.TuitionPaymentFragmentspecialinlinedviewModeldefault1(exc, "Failed to get location: ".concat(String.valueOf(exc.getMessage())), new Object[0]);
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(context, function1);
    }
}
