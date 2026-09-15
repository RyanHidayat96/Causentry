package androidx.content.preferences.core;

import androidx.content.core.CorruptionException;
import androidx.content.core.okio.OkioSerializer;
import androidx.content.preferences.PreferencesMapCompat;
import androidx.content.preferences.PreferencesProto;
import androidx.content.preferences.protobuf.ByteString;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00058\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/datastore/preferences/core/PreferencesSerializer;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/preferences/core/Preferences;", "<init>", "()V", "", "p0", "Landroidx/datastore/preferences/PreferencesProto$Value;", "p1", "Landroidx/datastore/preferences/core/MutablePreferences;", "p2", "", "addProtoEntryToPreferences", "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Landroidx/datastore/preferences/core/MutablePreferences;)V", "", "getValueProto", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "LRotationProvider1;", "readFrom", "(LRotationProvider1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LRotationProviderListener;", "writeTo", "(Landroidx/datastore/preferences/core/Preferences;LRotationProviderListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultValue", "()Landroidx/datastore/preferences/core/Preferences;", "defaultValue", "fileExtension", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferencesSerializer implements OkioSerializer<Preferences> {
    public static final PreferencesSerializer INSTANCE = new PreferencesSerializer();
    public static final String fileExtension = "preferences_pb";

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto.Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto.Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto.Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private PreferencesSerializer() {
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final /* bridge */ /* synthetic */ Object writeTo(Preferences preferences, RotationProviderListener rotationProviderListener, Continuation continuation) {
        return writeTo2(preferences, rotationProviderListener, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.content.core.okio.OkioSerializer
    public final Preferences getDefaultValue() {
        return PreferencesFactory.createEmpty();
    }

    @Override // androidx.content.core.okio.OkioSerializer
    public final Object readFrom(RotationProvider1 rotationProvider1, Continuation<? super Preferences> continuation) throws IOException {
        PreferencesProto.PreferenceMap from = PreferencesMapCompat.INSTANCE.readFrom(rotationProvider1.a());
        MutablePreferences mutablePreferencesCreateMutable = PreferencesFactory.createMutable(new Preferences.Pair[0]);
        Map<String, PreferencesProto.Value> preferencesMap = from.getPreferencesMap();
        Intrinsics.checkNotNullExpressionValue(preferencesMap, "");
        for (Map.Entry<String, PreferencesProto.Value> entry : preferencesMap.entrySet()) {
            String key = entry.getKey();
            PreferencesProto.Value value = entry.getValue();
            PreferencesSerializer preferencesSerializer = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(key, "");
            Intrinsics.checkNotNullExpressionValue(value, "");
            preferencesSerializer.addProtoEntryToPreferences(key, value, mutablePreferencesCreateMutable);
        }
        return mutablePreferencesCreateMutable.toPreferences();
    }

    /* JADX INFO: renamed from: writeTo, reason: avoid collision after fix types in other method */
    public final Object writeTo2(Preferences preferences, RotationProviderListener rotationProviderListener, Continuation<? super Unit> continuation) throws IOException {
        Map<Preferences.Key<?>, Object> mapAsMap = preferences.asMap();
        PreferencesProto.PreferenceMap.Builder builderNewBuilder = PreferencesProto.PreferenceMap.newBuilder();
        for (Map.Entry<Preferences.Key<?>, Object> entry : mapAsMap.entrySet()) {
            builderNewBuilder.putPreferences(entry.getKey().getName(), getValueProto(entry.getValue()));
        }
        builderNewBuilder.build().writeTo(rotationProviderListener.asBinder());
        return Unit.INSTANCE;
    }

    private final PreferencesProto.Value getValueProto(Object p0) {
        if (p0 instanceof Boolean) {
            PreferencesProto.Value valueBuild = PreferencesProto.Value.newBuilder().setBoolean(((Boolean) p0).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild, "");
            return valueBuild;
        }
        if (p0 instanceof Float) {
            PreferencesProto.Value valueBuild2 = PreferencesProto.Value.newBuilder().setFloat(((Number) p0).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild2, "");
            return valueBuild2;
        }
        if (p0 instanceof Double) {
            PreferencesProto.Value valueBuild3 = PreferencesProto.Value.newBuilder().setDouble(((Number) p0).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild3, "");
            return valueBuild3;
        }
        if (p0 instanceof Integer) {
            PreferencesProto.Value valueBuild4 = PreferencesProto.Value.newBuilder().setInteger(((Number) p0).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild4, "");
            return valueBuild4;
        }
        if (p0 instanceof Long) {
            PreferencesProto.Value valueBuild5 = PreferencesProto.Value.newBuilder().setLong(((Number) p0).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild5, "");
            return valueBuild5;
        }
        if (p0 instanceof String) {
            PreferencesProto.Value valueBuild6 = PreferencesProto.Value.newBuilder().setString((String) p0).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild6, "");
            return valueBuild6;
        }
        if (p0 instanceof Set) {
            PreferencesProto.Value.Builder builderNewBuilder = PreferencesProto.Value.newBuilder();
            PreferencesProto.StringSet.Builder builderNewBuilder2 = PreferencesProto.StringSet.newBuilder();
            Intrinsics.checkNotNull(p0, "");
            PreferencesProto.Value valueBuild7 = builderNewBuilder.setStringSet(builderNewBuilder2.addAllStrings((Set) p0)).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild7, "");
            return valueBuild7;
        }
        if (p0 instanceof byte[]) {
            PreferencesProto.Value valueBuild8 = PreferencesProto.Value.newBuilder().setBytes(ByteString.copyFrom((byte[]) p0)).build();
            Intrinsics.checkNotNullExpressionValue(valueBuild8, "");
            return valueBuild8;
        }
        StringBuilder sb = new StringBuilder("PreferencesSerializer does not support type: ");
        sb.append(p0.getClass().getName());
        throw new IllegalStateException(sb.toString());
    }

    private final void addProtoEntryToPreferences(String p0, PreferencesProto.Value p1, MutablePreferences p2) throws CorruptionException {
        PreferencesProto.Value.ValueCase valueCase = p1.getValueCase();
        switch (valueCase == null ? -1 : WhenMappings.$EnumSwitchMapping$0[valueCase.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                p2.set(PreferencesKeys.booleanKey(p0), Boolean.valueOf(p1.getBoolean()));
                return;
            case 2:
                p2.set(PreferencesKeys.floatKey(p0), Float.valueOf(p1.getFloat()));
                return;
            case 3:
                p2.set(PreferencesKeys.doubleKey(p0), Double.valueOf(p1.getDouble()));
                return;
            case 4:
                p2.set(PreferencesKeys.intKey(p0), Integer.valueOf(p1.getInteger()));
                return;
            case 5:
                p2.set(PreferencesKeys.longKey(p0), Long.valueOf(p1.getLong()));
                return;
            case 6:
                Preferences.Key<String> keyStringKey = PreferencesKeys.stringKey(p0);
                String string = p1.getString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                p2.set(keyStringKey, string);
                return;
            case 7:
                Preferences.Key<Set<String>> keyStringSetKey = PreferencesKeys.stringSetKey(p0);
                List<String> stringsList = p1.getStringSet().getStringsList();
                Intrinsics.checkNotNullExpressionValue(stringsList, "");
                p2.set(keyStringSetKey, CollectionsKt.toSet(stringsList));
                return;
            case 8:
                Preferences.Key<byte[]> keyByteArrayKey = PreferencesKeys.byteArrayKey(p0);
                byte[] byteArray = p1.getBytes().toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "");
                p2.set(keyByteArrayKey, byteArray);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }
}
