package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class createPoint {
    private static final List<String> TuitionPaymentFragmentbindingInflater1 = CollectionsKt.listOf((Object[]) new String[]{"firstByte", "download", "ssl", "connect", "dns"});

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    public static final getX b(Map<String, ? extends Object> map) {
        sendSurfaceRequest sendsurfacerequest;
        if (map == null) {
            return null;
        }
        List<String> list = TuitionPaymentFragmentbindingInflater1;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            Object obj2 = map.get((String) obj);
            if (obj2 == null || !(obj2 instanceof Map)) {
                sendsurfacerequest = null;
            } else {
                Map map2 = (Map) obj2;
                Object obj3 = map2.get("startTime");
                Number number = obj3 instanceof Number ? (Number) obj3 : null;
                Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
                Object obj4 = map2.get(TypedValues.TransitionType.S_DURATION);
                Number number2 = obj4 instanceof Number ? (Number) obj4 : null;
                Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
                if (lValueOf == null || lValueOf2 == null) {
                    sendsurfacerequest = null;
                } else {
                    sendsurfacerequest = new sendSurfaceRequest(lValueOf.longValue(), lValueOf2.longValue());
                }
            }
            linkedHashMap2.put(obj, sendsurfacerequest);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((sendSurfaceRequest) entry.getValue()) != null) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        if (linkedHashMap4.isEmpty()) {
            return null;
        }
        sendSurfaceRequest sendsurfacerequest2 = (sendSurfaceRequest) linkedHashMap4.get("firstByte");
        long j = sendsurfacerequest2 != null ? sendsurfacerequest2.TuitionPaymentFragmentbindingInflater1 : 0L;
        sendSurfaceRequest sendsurfacerequest3 = (sendSurfaceRequest) linkedHashMap4.get("firstByte");
        long j2 = sendsurfacerequest3 != null ? sendsurfacerequest3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L;
        sendSurfaceRequest sendsurfacerequest4 = (sendSurfaceRequest) linkedHashMap4.get("download");
        long j3 = sendsurfacerequest4 != null ? sendsurfacerequest4.TuitionPaymentFragmentbindingInflater1 : 0L;
        sendSurfaceRequest sendsurfacerequest5 = (sendSurfaceRequest) linkedHashMap4.get("download");
        long j4 = sendsurfacerequest5 != null ? sendsurfacerequest5.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L;
        sendSurfaceRequest sendsurfacerequest6 = (sendSurfaceRequest) linkedHashMap4.get("dns");
        long j5 = sendsurfacerequest6 != null ? sendsurfacerequest6.TuitionPaymentFragmentbindingInflater1 : 0L;
        sendSurfaceRequest sendsurfacerequest7 = (sendSurfaceRequest) linkedHashMap4.get("dns");
        long j6 = sendsurfacerequest7 != null ? sendsurfacerequest7.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L;
        sendSurfaceRequest sendsurfacerequest8 = (sendSurfaceRequest) linkedHashMap4.get("connect");
        long j7 = sendsurfacerequest8 != null ? sendsurfacerequest8.TuitionPaymentFragmentbindingInflater1 : 0L;
        sendSurfaceRequest sendsurfacerequest9 = (sendSurfaceRequest) linkedHashMap4.get("connect");
        long j8 = sendsurfacerequest9 != null ? sendsurfacerequest9.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L;
        sendSurfaceRequest sendsurfacerequest10 = (sendSurfaceRequest) linkedHashMap4.get("ssl");
        long j9 = sendsurfacerequest10 != null ? sendsurfacerequest10.TuitionPaymentFragmentbindingInflater1 : 0L;
        sendSurfaceRequest sendsurfacerequest11 = (sendSurfaceRequest) linkedHashMap4.get("ssl");
        return new getX(j5, j6, j7, j8, j9, sendsurfacerequest11 != null ? sendsurfacerequest11.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : 0L, j, j2, j3, j4);
    }
}
