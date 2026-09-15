package com.sofakingforever.analytics;

import defpackage.AutoValue_QualityRatioToResolutionsTable_QualityRatio;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class AnalyticsSettings {
    public volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
    public boolean b = true;
    public final ServiceEnabledMap<AutoValue_QualityRatioToResolutionsTable_QualityRatio> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new ServiceEnabledMap<>();
    public final ServiceEnabledMap<String> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new ServiceEnabledMap<>();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/sofakingforever/analytics/AnalyticsSettings$ServiceEnabledMap;", "Key", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "<init>", "()V"}, k = 1, mv = {2, 3, 0})
    public static final class ServiceEnabledMap<Key> extends LinkedHashMap<Key, Boolean> {
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof Boolean) {
                return super.containsValue((Boolean) obj);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return (Boolean) super.getOrDefault(obj, (Boolean) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj2 instanceof Boolean) {
                return super.remove(obj, (Boolean) obj2);
            }
            return false;
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Key, Boolean>> entrySet() {
            return super.entrySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean get(Object obj) {
            return (Boolean) super.get(obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Key> keySet() {
            return super.keySet();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Boolean remove(Object obj) {
            return (Boolean) super.remove(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return super.size();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Boolean> values() {
            return super.values();
        }
    }
}
