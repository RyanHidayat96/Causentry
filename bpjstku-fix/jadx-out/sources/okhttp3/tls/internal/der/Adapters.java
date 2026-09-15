package okhttp3.tls.internal.der;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProviderListener;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jk\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072<\b\u0002\u0010\b\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00050\u0004\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJC\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00050\u00072\u001a\u0010\b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0017\u0010\u0016Jo\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0004\b\u0000\u0010\u00182\u0006\u0010\b\u001a\u00020\u00112\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004\"\u0006\u0012\u0002\b\u00030\u00072\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00192\u0016\u0010\u001b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\u0004\u0012\u00028\u00000\u0019H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\u001a\u0010\b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0019H\u0007¢\u0006\u0004\b\u001f\u0010 R \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010+\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u0002010\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010*R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010(\u001a\u0004\b5\u0010*R\"\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u0010*R \u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*R \u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010(\u001a\u0004\b=\u0010*R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010(\u001a\u0004\b?\u0010*R \u0010@\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010(\u001a\u0004\bA\u0010*R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*R8\u0010D\u001a&\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00070\u00050\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010E"}, d2 = {"Lokhttp3/tls/internal/der/Adapters;", "", "<init>", "()V", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lokhttp3/tls/internal/der/DerAdapter;", "p0", "", "p1", "p2", "any", "([Lkotlin/Pair;ZLjava/lang/Object;)Lokhttp3/tls/internal/der/DerAdapter;", "choice", "([Lokhttp3/tls/internal/der/DerAdapter;)Lokhttp3/tls/internal/der/DerAdapter;", "", "", "formatGeneralizedTime$okhttp_tls", "(J)Ljava/lang/String;", "formatUtcTime$okhttp_tls", "parseGeneralizedTime$okhttp_tls", "(Ljava/lang/String;)J", "parseUtcTime$okhttp_tls", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "", "p3", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "sequence", "(Ljava/lang/String;[Lokhttp3/tls/internal/der/DerAdapter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lokhttp3/tls/internal/der/BasicDerAdapter;", "usingTypeHint", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/AnyValue;", "ANY_VALUE", "Lokhttp3/tls/internal/der/DerAdapter;", "getANY_VALUE", "()Lokhttp3/tls/internal/der/DerAdapter;", "Lokhttp3/tls/internal/der/BitString;", "BIT_STRING", "Lokhttp3/tls/internal/der/BasicDerAdapter;", "getBIT_STRING", "()Lokhttp3/tls/internal/der/BasicDerAdapter;", "BOOLEAN", "getBOOLEAN", "GENERALIZED_TIME", "getGENERALIZED_TIME", "IA5_STRING", "getIA5_STRING", "Ljava/math/BigInteger;", "INTEGER_AS_BIG_INTEGER", "getINTEGER_AS_BIG_INTEGER", "INTEGER_AS_LONG", "getINTEGER_AS_LONG", "", "NULL", "getNULL", "OBJECT_IDENTIFIER", "getOBJECT_IDENTIFIER", "Lokio/ByteString;", "OCTET_STRING", "getOCTET_STRING", "PRINTABLE_STRING", "getPRINTABLE_STRING", "UTC_TIME", "getUTC_TIME", "UTF8_STRING", "getUTF8_STRING", "defaultAnyChoices", "Ljava/util/List;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Adapters {
    private static final DerAdapter<AnyValue> ANY_VALUE;
    private static final BasicDerAdapter<BitString> BIT_STRING;
    private static final BasicDerAdapter<Boolean> BOOLEAN;
    private static final BasicDerAdapter<Long> GENERALIZED_TIME;
    private static final BasicDerAdapter<String> IA5_STRING;
    public static final Adapters INSTANCE = new Adapters();
    private static final BasicDerAdapter<BigInteger> INTEGER_AS_BIG_INTEGER;
    private static final BasicDerAdapter<Long> INTEGER_AS_LONG;
    private static final BasicDerAdapter<Unit> NULL;
    private static final BasicDerAdapter<String> OBJECT_IDENTIFIER;
    private static final BasicDerAdapter<ByteString> OCTET_STRING;
    private static final BasicDerAdapter<String> PRINTABLE_STRING;
    private static final BasicDerAdapter<Long> UTC_TIME;
    private static final BasicDerAdapter<String> UTF8_STRING;
    private static final List<Pair<KClass<? extends Object>, DerAdapter<? extends Object>>> defaultAnyChoices;

    private Adapters() {
    }

    public final BasicDerAdapter<Boolean> getBOOLEAN() {
        return BOOLEAN;
    }

    static {
        BasicDerAdapter<Boolean> basicDerAdapter = new BasicDerAdapter<>("BOOLEAN", 0, 1L, new BasicDerAdapter.Codec<Boolean>() { // from class: okhttp3.tls.internal.der.Adapters$BOOLEAN$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Boolean bool) throws IOException {
                encode(derWriter, bool.booleanValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Boolean decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return Boolean.valueOf(p0.readBoolean());
            }

            public final void encode(DerWriter p0, boolean p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.writeBoolean(p1);
            }
        }, false, null, false, 112, null);
        BOOLEAN = basicDerAdapter;
        INTEGER_AS_LONG = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_LONG$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l) throws IOException {
                encode(derWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Long decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return Long.valueOf(p0.readLong());
            }

            public final void encode(DerWriter p0, long p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.writeLong(p1);
            }
        }, false, null, false, 112, null);
        BasicDerAdapter<BigInteger> basicDerAdapter2 = new BasicDerAdapter<>("INTEGER", 0, 2L, new BasicDerAdapter.Codec<BigInteger>() { // from class: okhttp3.tls.internal.der.Adapters$INTEGER_AS_BIG_INTEGER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final BigInteger decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readBigInteger();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, BigInteger p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeBigInteger(p1);
            }
        }, false, null, false, 112, null);
        INTEGER_AS_BIG_INTEGER = basicDerAdapter2;
        BasicDerAdapter<BitString> basicDerAdapter3 = new BasicDerAdapter<>("BIT STRING", 0, 3L, new BasicDerAdapter.Codec<BitString>() { // from class: okhttp3.tls.internal.der.Adapters$BIT_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final BitString decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readBitString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, BitString p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeBitString(p1);
            }
        }, false, null, false, 112, null);
        BIT_STRING = basicDerAdapter3;
        BasicDerAdapter<ByteString> basicDerAdapter4 = new BasicDerAdapter<>("OCTET STRING", 0, 4L, new BasicDerAdapter.Codec<ByteString>() { // from class: okhttp3.tls.internal.der.Adapters$OCTET_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final ByteString decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readOctetString();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, ByteString p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeOctetString(p1);
            }
        }, false, null, false, 112, null);
        OCTET_STRING = basicDerAdapter4;
        BasicDerAdapter<Unit> basicDerAdapter5 = new BasicDerAdapter<>("NULL", 0, 5L, new BasicDerAdapter.Codec<Unit>() { // from class: okhttp3.tls.internal.der.Adapters$NULL$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Unit decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return null;
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, Unit p1) {
                Intrinsics.checkNotNullParameter(p0, "");
            }
        }, false, null, false, 112, null);
        NULL = basicDerAdapter5;
        BasicDerAdapter<String> basicDerAdapter6 = new BasicDerAdapter<>("OBJECT IDENTIFIER", 0, 6L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$OBJECT_IDENTIFIER$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final String decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readObjectIdentifier();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, String p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeObjectIdentifier(p1);
            }
        }, false, null, false, 112, null);
        OBJECT_IDENTIFIER = basicDerAdapter6;
        BasicDerAdapter<String> basicDerAdapter7 = new BasicDerAdapter<>("UTF8", 0, 12L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$UTF8_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final String decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, String p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeUtf8(p1);
            }
        }, false, null, false, 112, null);
        UTF8_STRING = basicDerAdapter7;
        BasicDerAdapter<String> basicDerAdapter8 = new BasicDerAdapter<>("PRINTABLE STRING", 0, 19L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$PRINTABLE_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final String decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, String p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeUtf8(p1);
            }
        }, false, null, false, 112, null);
        PRINTABLE_STRING = basicDerAdapter8;
        BasicDerAdapter<String> basicDerAdapter9 = new BasicDerAdapter<>("IA5 STRING", 0, 22L, new BasicDerAdapter.Codec<String>() { // from class: okhttp3.tls.internal.der.Adapters$IA5_STRING$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final String decode(DerReader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return p0.readUtf8String();
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(DerWriter p0, String p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.writeUtf8(p1);
            }
        }, false, null, false, 112, null);
        IA5_STRING = basicDerAdapter9;
        BasicDerAdapter<Long> basicDerAdapter10 = new BasicDerAdapter<>("UTC TIME", 0, 23L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$UTC_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l) throws IOException {
                encode(derWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Long decode(DerReader p0) throws ProtocolException {
                Intrinsics.checkNotNullParameter(p0, "");
                return Long.valueOf(Adapters.INSTANCE.parseUtcTime$okhttp_tls(p0.readUtf8String()));
            }

            public final void encode(DerWriter p0, long p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.writeUtf8(Adapters.INSTANCE.formatUtcTime$okhttp_tls(p1));
            }
        }, false, null, false, 112, null);
        UTC_TIME = basicDerAdapter10;
        BasicDerAdapter<Long> basicDerAdapter11 = new BasicDerAdapter<>("GENERALIZED TIME", 0, 24L, new BasicDerAdapter.Codec<Long>() { // from class: okhttp3.tls.internal.der.Adapters$GENERALIZED_TIME$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final /* bridge */ /* synthetic */ void encode(DerWriter derWriter, Long l) throws IOException {
                encode(derWriter, l.longValue());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final Long decode(DerReader p0) throws ProtocolException {
                Intrinsics.checkNotNullParameter(p0, "");
                return Long.valueOf(Adapters.INSTANCE.parseGeneralizedTime$okhttp_tls(p0.readUtf8String()));
            }

            public final void encode(DerWriter p0, long p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                p0.writeUtf8(Adapters.INSTANCE.formatGeneralizedTime$okhttp_tls(p1));
            }
        }, false, null, false, 112, null);
        GENERALIZED_TIME = basicDerAdapter11;
        DerAdapter<AnyValue> derAdapter = new DerAdapter<AnyValue>() { // from class: okhttp3.tls.internal.der.Adapters$ANY_VALUE$1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<AnyValue>> asSequenceOf(String str, int i, long j) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i, j);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<AnyValue>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final AnyValue fromDer(ByteString byteString) {
                return (AnyValue) DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final ByteString toDer(AnyValue anyValue) {
                return DerAdapter.DefaultImpls.toDer(this, anyValue);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<AnyValue> withExplicitBox(int i, long j, Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i, j, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void toDer(final DerWriter p0, final AnyValue p1) throws IOException {
                Intrinsics.checkNotNullParameter(p0, "");
                Intrinsics.checkNotNullParameter(p1, "");
                p0.write("ANY", p1.getTagClass(), p1.getTag(), new Function1<RotationProviderListener, Unit>() { // from class: okhttp3.tls.internal.der.Adapters$ANY_VALUE$1$toDer$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(RotationProviderListener rotationProviderListener) throws IOException {
                        invoke2(rotationProviderListener);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(RotationProviderListener rotationProviderListener) throws IOException {
                        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
                        p0.writeOctetString(p1.getBytes());
                        p0.setConstructed(p1.getConstructed());
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final AnyValue fromDer(DerReader p0) throws ProtocolException {
                Intrinsics.checkNotNullParameter(p0, "");
                if (p0.hasNext()) {
                    DerHeader derHeader = p0.peekedHeader;
                    Intrinsics.checkNotNull(derHeader);
                    p0.peekedHeader = null;
                    long j = p0.limit;
                    boolean z = p0.constructed;
                    long byteCount = derHeader.getLength() != -1 ? p0.getByteCount() + derHeader.getLength() : -1L;
                    if (j == -1 || byteCount <= j) {
                        p0.limit = byteCount;
                        p0.constructed = derHeader.getConstructed();
                        p0.path.add("ANY");
                        try {
                            return new AnyValue(derHeader.getTagClass(), derHeader.getTag(), derHeader.getConstructed(), derHeader.getLength(), p0.readUnknown());
                        } finally {
                            p0.peekedHeader = null;
                            p0.limit = j;
                            p0.constructed = z;
                            p0.path.remove(p0.path.size() - 1);
                        }
                    }
                    throw new ProtocolException("enclosed object too large");
                }
                throw new ProtocolException("expected a value");
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean matches(DerHeader p0) {
                Intrinsics.checkNotNullParameter(p0, "");
                return true;
            }
        };
        ANY_VALUE = derAdapter;
        defaultAnyChoices = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(Reflection.getOrCreateKotlinClass(Boolean.TYPE), basicDerAdapter), TuplesKt.to(Reflection.getOrCreateKotlinClass(BigInteger.class), basicDerAdapter2), TuplesKt.to(Reflection.getOrCreateKotlinClass(BitString.class), basicDerAdapter3), TuplesKt.to(Reflection.getOrCreateKotlinClass(ByteString.class), basicDerAdapter4), TuplesKt.to(Reflection.getOrCreateKotlinClass(Unit.class), basicDerAdapter5), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter6), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter7), TuplesKt.to(Reflection.getOrCreateKotlinClass(String.class), basicDerAdapter8), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter9), TuplesKt.to(Reflection.getOrCreateKotlinClass(Void.class), basicDerAdapter10), TuplesKt.to(Reflection.getOrCreateKotlinClass(Long.TYPE), basicDerAdapter11), TuplesKt.to(Reflection.getOrCreateKotlinClass(AnyValue.class), derAdapter)});
    }

    public final BasicDerAdapter<Long> getINTEGER_AS_LONG() {
        return INTEGER_AS_LONG;
    }

    public final BasicDerAdapter<BigInteger> getINTEGER_AS_BIG_INTEGER() {
        return INTEGER_AS_BIG_INTEGER;
    }

    public final BasicDerAdapter<BitString> getBIT_STRING() {
        return BIT_STRING;
    }

    public final BasicDerAdapter<ByteString> getOCTET_STRING() {
        return OCTET_STRING;
    }

    public final BasicDerAdapter<Unit> getNULL() {
        return NULL;
    }

    public final BasicDerAdapter<String> getOBJECT_IDENTIFIER() {
        return OBJECT_IDENTIFIER;
    }

    public final BasicDerAdapter<String> getUTF8_STRING() {
        return UTF8_STRING;
    }

    public final BasicDerAdapter<String> getPRINTABLE_STRING() {
        return PRINTABLE_STRING;
    }

    public final BasicDerAdapter<String> getIA5_STRING() {
        return IA5_STRING;
    }

    public final BasicDerAdapter<Long> getUTC_TIME() {
        return UTC_TIME;
    }

    public final long parseUtcTime$okhttp_tls(String p0) throws ProtocolException {
        Intrinsics.checkNotNullParameter(p0, "");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            return simpleDateFormat.parse(p0).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException(Intrinsics.stringPlus("Failed to parse UTCTime ", p0));
        }
    }

    public final String formatUtcTime$okhttp_tls(long p0) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        String str = simpleDateFormat.format(Long.valueOf(p0));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final BasicDerAdapter<Long> getGENERALIZED_TIME() {
        return GENERALIZED_TIME;
    }

    public final DerAdapter<AnyValue> getANY_VALUE() {
        return ANY_VALUE;
    }

    public final long parseGeneralizedTime$okhttp_tls(String p0) throws ProtocolException {
        Intrinsics.checkNotNullParameter(p0, "");
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        try {
            return simpleDateFormat.parse(p0).getTime();
        } catch (ParseException unused) {
            throw new ProtocolException(Intrinsics.stringPlus("Failed to parse GeneralizedTime ", p0));
        }
    }

    public final String formatGeneralizedTime$okhttp_tls(long p0) {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        String str = simpleDateFormat.format(Long.valueOf(p0));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final <T> BasicDerAdapter<T> sequence(String p0, final DerAdapter<?>[] p1, final Function1<? super T, ? extends List<?>> p2, final Function1<? super List<?>, ? extends T> p3) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        return new BasicDerAdapter<>(p0, 0, 16L, new BasicDerAdapter.Codec<T>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1
            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final T decode(final DerReader p4) {
                Intrinsics.checkNotNullParameter(p4, "");
                final DerAdapter<?>[] derAdapterArr = p1;
                final Function1<List<?>, T> function1 = p3;
                return (T) p4.withTypeHint(new Function0<T>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1$decode$1
                    @Override // kotlin.jvm.functions.Function0
                    public final T invoke() throws ProtocolException {
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            int size = arrayList.size();
                            DerAdapter<?>[] derAdapterArr2 = derAdapterArr;
                            if (size >= derAdapterArr2.length) {
                                break;
                            }
                            arrayList.add(derAdapterArr2[arrayList.size()].fromDer(p4));
                        }
                        if (p4.hasNext()) {
                            StringBuilder sb = new StringBuilder("unexpected ");
                            sb.append(p4.peekHeader());
                            sb.append(" at ");
                            sb.append(p4);
                            throw new ProtocolException(sb.toString());
                        }
                        return function1.invoke(arrayList);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }
                });
            }

            @Override // okhttp3.tls.internal.der.BasicDerAdapter.Codec
            public final void encode(final DerWriter p4, T p5) {
                Intrinsics.checkNotNullParameter(p4, "");
                final List<?> listInvoke = p2.invoke(p5);
                final DerAdapter<?>[] derAdapterArr = p1;
                p4.withTypeHint(new Function0<Unit>() { // from class: okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1
                    private static final byte[] $$c = {106, -93, -11, -74};
                    private static final int $$f = 79;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static final byte[] $$d = {15, -9, 64, -81, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -11, -7, 15, -1, -6, -16, 5, -11, 6, 3, -73, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -14, -15, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -21, 4, 2, -13, 2, 2, -10, -33, 34, -11, 3, -14, 16, -18, 10, -68};
                    private static final int $$e = 151;
                    private static final byte[] $$a = {55, -64, 35, -71, -23, 37, -42, -11, 10, -18, 7, 0, -7, -7, -23, 44, -44, -10, 5, -6, -18};
                    private static final int $$b = 79;
                    private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                    private static long b = 714796327779237255L;

                    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
                        /*
                            int r8 = r8 + 1
                            byte[] r0 = okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.$$a
                            int r6 = r6 * 3
                            int r6 = r6 + 97
                            int r7 = r7 * 10
                            int r7 = 14 - r7
                            byte[] r1 = new byte[r8]
                            r2 = 0
                            if (r0 != 0) goto L14
                            r3 = r7
                            r4 = r2
                            goto L2a
                        L14:
                            r3 = r2
                        L15:
                            byte r4 = (byte) r6
                            r1[r3] = r4
                            int r3 = r3 + 1
                            if (r3 != r8) goto L24
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            r9[r2] = r6
                            return
                        L24:
                            r4 = r0[r7]
                            r5 = r3
                            r3 = r7
                            r7 = r4
                            r4 = r5
                        L2a:
                            int r7 = -r7
                            int r6 = r6 + r7
                            int r6 = r6 + (-5)
                            int r7 = r3 + 1
                            r3 = r4
                            goto L15
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.a(int, byte, byte, java.lang.Object[]):void");
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
                    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
                        /*
                            int r5 = r5 + 4
                            int r6 = r6 * 10
                            int r0 = 48 - r6
                            byte[] r1 = okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.$$d
                            int r7 = r7 * 15
                            int r7 = 99 - r7
                            byte[] r0 = new byte[r0]
                            int r6 = 47 - r6
                            r2 = 0
                            if (r1 != 0) goto L17
                            r3 = r7
                            r4 = r2
                            r7 = r6
                            goto L2b
                        L17:
                            r3 = r2
                        L18:
                            byte r4 = (byte) r7
                            int r5 = r5 + 1
                            r0[r3] = r4
                            int r4 = r3 + 1
                            if (r3 != r6) goto L29
                            java.lang.String r5 = new java.lang.String
                            r5.<init>(r0, r2)
                            r8[r2] = r5
                            return
                        L29:
                            r3 = r1[r5]
                        L2b:
                            int r7 = r7 + r3
                            int r7 = r7 + 3
                            r3 = r4
                            goto L18
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.d(int, byte, int, java.lang.Object[]):void");
                    }

                    private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
                        int i2 = 2 % 2;
                        abortCapture abortcapture = new abortCapture();
                        char[] cArrB = abortCapture.b(b ^ (-2687588926731523482L), cArr, i);
                        abortcapture.b = 4;
                        int i3 = $10 + 109;
                        $11 = i3 % 128;
                        int i4 = i3 % 2;
                        while (abortcapture.b < cArrB.length) {
                            int i5 = $10 + 37;
                            $11 = i5 % 128;
                            int i6 = i5 % 2;
                            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
                            int i7 = abortcapture.b;
                            try {
                                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(b)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (64838 - View.resolveSizeAndState(0, 0, 0)), 1356 - (Process.myTid() >> 22), 38 - View.resolveSize(0, 0), 894276454, false, $$g(b2, b3, b3), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                                }
                                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                Object[] objArr3 = {abortcapture, abortcapture};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.lastIndexOf("", '0', 0) + 47774), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 468, TextUtils.getCapsMode("", 0, 0) + 13, 896083767, false, "n", new Class[]{Object.class, Object.class});
                                }
                                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() throws Throwable {
                        int i = 2 % 2;
                        int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 41;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                        int i3 = i2 % 2;
                        invoke2();
                        Unit unit = Unit.INSTANCE;
                        int i4 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 105;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i4 % 128;
                        int i5 = i4 % 2;
                        return unit;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() throws Throwable {
                        Object[] objArr;
                        int i = 2 % 2;
                        int i2 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 93;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                        int i3 = i2 % 2;
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int pressedStateDuration = 876 - (ViewConfiguration.getPressedStateDuration() >> 16);
                            int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 10;
                            byte[] bArr = $$a;
                            byte b2 = bArr[11];
                            Object[] objArr2 = new Object[1];
                            a(b2, (byte) (b2 + 1), bArr[8], objArr2);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(offsetAfter, pressedStateDuration, i4, -1199417970, false, (String) objArr2[0], null);
                        }
                        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                        Object[] objArr3 = new Object[1];
                        c(new char[]{27910, 28007, 33343, 51148, 64159, 38320, 59498, 48462, 13037, 58044, 26440, 6727, 53857, 17194, 1678, 48054, 29683, 41902, 42576, 56068, 4987, 2, 17876, 30866, 45297, 24750}, 1 - (KeyEvent.getMaxKeyCode() >> 16), objArr3);
                        Class<?> cls = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        c(new char[]{56996, 57025, 26016, 52397, 34752, 29229, 58126, 49171, 33107, 1325, 27692, 26470, 25033, 42149, 3496, 50892, 49217, 17453, 44325}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr4);
                        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                            int i5 = 877 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                            int i6 = 10 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                            byte b3 = (byte) ($$b & 1);
                            byte b4 = $$a[11];
                            Object[] objArr5 = new Object[1];
                            a(b3, b4, b4, objArr5);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(touchSlop, i5, i6, 254769921, false, (String) objArr5[0], null);
                        }
                        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                int gidForName = Process.getGidForName("") + 877;
                                int deadChar = 10 - KeyEvent.getDeadChar(0, 0);
                                byte[] bArr2 = $$a;
                                byte b5 = bArr2[11];
                                Object[] objArr6 = new Object[1];
                                a(b5, b5, bArr2[10], objArr6);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cKeyCodeFromString, gidForName, deadChar, 1324201839, false, (String) objArr6[0], null);
                            }
                            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                            int iIdentityHashCode = System.identityHashCode(this);
                            int i7 = (((143013812 + (((~(636038993 | iIdentityHashCode)) | 135282726) * 104)) + ((~((~iIdentityHashCode) | (-94972498))) * (-104))) + ((iIdentityHashCode | 676349222) * 104)) - 1291174923;
                            int i8 = (i7 << 13) ^ i7;
                            int i9 = i8 ^ (i8 >>> 17);
                            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
                        } else {
                            Object[] objArr8 = new Object[1];
                            c(new char[]{8022, 7996, 15554, 55412, 10661, 11074, 63424, 28263, 16636, 23627, 30951, 51502, 41017, 64901, 6489, 26805, 425, 7515, 47595, 2085}, -ImageFormat.getBitsPerPixel(0), objArr8);
                            Class<?> cls2 = Class.forName((String) objArr8[0]);
                            Object[] objArr9 = new Object[1];
                            c(new char[]{64691, 64730, 50137, 4134, 40532, 54364, 16257, 55705, 41795, 41808, 45235, 32455, 17395, 724, 53560, 57178, 57980, 57950, 29099, 49107}, 1 - (ViewConfiguration.getScrollBarSize() >> 8), objArr9);
                            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
                            int i10 = $TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 101;
                            $TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i10 % 128;
                            int i11 = i10 % 2;
                            try {
                                Object[] objArr10 = {Integer.valueOf(iIntValue), -1291174923};
                                byte[] bArr3 = $$d;
                                byte b6 = bArr3[30];
                                byte b7 = (byte) (b6 + 1);
                                Object[] objArr11 = new Object[1];
                                d(b6, b7, b7, objArr11);
                                Class<?> cls3 = Class.forName((String) objArr11[0]);
                                byte b8 = (byte) (-bArr3[30]);
                                Object[] objArr12 = new Object[1];
                                d((byte) 46, b8, b8, objArr12);
                                objArr = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                    char offsetAfter2 = (char) TextUtils.getOffsetAfter("", 0);
                                    int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0');
                                    int i12 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                                    byte[] bArr4 = $$a;
                                    byte b9 = bArr4[11];
                                    Object[] objArr13 = new Object[1];
                                    a(b9, b9, bArr4[10], objArr13);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(offsetAfter2, iIndexOf, i12, 1324201839, false, (String) objArr13[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                                try {
                                    Object[] objArr14 = new Object[1];
                                    c(new char[]{27910, 28007, 33343, 51148, 64159, 38320, 59498, 48462, 13037, 58044, 26440, 6727, 53857, 17194, 1678, 48054, 29683, 41902, 42576, 56068, 4987, 2, 17876, 30866, 45297, 24750}, 1 - Color.blue(0), objArr14);
                                    Class<?> cls4 = Class.forName((String) objArr14[0]);
                                    Object[] objArr15 = new Object[1];
                                    c(new char[]{56996, 57025, 26016, 52397, 34752, 29229, 58126, 49171, 33107, 1325, 27692, 26470, 25033, 42149, 3496, 50892, 49217, 17453, 44325}, 1 - Drawable.resolveOpacity(0, 0), objArr15);
                                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                    Long lValueOf = Long.valueOf(jLongValue2);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                        char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 877;
                                        int i13 = 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                        byte b10 = (byte) ($$b & 1);
                                        byte b11 = $$a[11];
                                        Object[] objArr16 = new Object[1];
                                        a(b10, b11, b11, objArr16);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(fadingEdgeLength, iIndexOf2, i13, 254769921, false, (String) objArr16[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                        char c = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                        int iRgb = (-16776340) - Color.rgb(0, 0, 0);
                                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                                        byte[] bArr5 = $$a;
                                        byte b12 = bArr5[11];
                                        Object[] objArr17 = new Object[1];
                                        a(b12, (byte) (b12 + 1), bArr5[8], objArr17);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iRgb, jumpTapTimeout, -1199417970, false, (String) objArr17[0], null);
                                    }
                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                                } catch (Exception unused) {
                                    throw new RuntimeException();
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        if (((int[]) objArr[0])[0] != ((int[]) objArr[2])[0]) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr[3];
                            if (strArr == null) {
                                throw null;
                            }
                            for (String str : strArr) {
                                arrayList.add(str);
                            }
                            throw null;
                        }
                        int i14 = ((int[]) objArr[1])[0];
                        Object[] objArr18 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
                        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                        int i15 = ~elapsedCpuTime;
                        int i16 = i14 + 1461683252 + (((~((-612290718) | i15)) | 73941013 | (~(571980488 | i15))) * (-1136)) + (((~((-612290718) | elapsedCpuTime)) | (~(571980488 | elapsedCpuTime)) | (~((-33630785) | i15))) * (-568)) + (((~(elapsedCpuTime | (-73941014))) | (~(i15 | (-571980489))) | (~(612290717 | i15))) * 568);
                        int i17 = (i16 << 13) ^ i16;
                        int i18 = i17 ^ (i17 >>> 17);
                        ((int[]) objArr18[1])[0] = i18 ^ (i18 << 5);
                        int size = listInvoke.size();
                        int i19 = ((int[]) objArr18[1])[0];
                        int i20 = ((i19 * i19) - (~(-(579471538 * i19)))) - 1;
                        int i21 = -(i19 * 827689486);
                        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                        int i23 = (i22 ^ 1604838400) + ((1604838400 & i22) << 1);
                        int i24 = i23 >> 20;
                        int i25 = ((i24 ^ (-8191)) + ((i24 & (-8191)) << 1)) / 4096;
                        int i26 = (i25 & 1) + (i25 | 1);
                        int i27 = (i23 ^ i26) + ((i26 & i23) << 1);
                        int i28 = i23 >> 18;
                        int i29 = ((i28 & (-32767)) + (i28 | (-32767))) / 16384;
                        int i30 = -((((i29 | 1) << 1) - (i29 ^ 1)) ^ i27);
                        int i31 = (i30 ^ 8) + ((i30 & 8) << 1);
                        int i32 = i31 >> 21;
                        int i33 = ((i32 & (-4095)) + (i32 | (-4095))) / 2048;
                        int i34 = (i33 & 1) + (i33 | 1);
                        int i35 = $TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 89;
                        $TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i35 % 128;
                        int i36 = i35 % 2;
                        for (int i37 = 0 / (((-(((i34 | 1) << 1) - (i34 ^ 1))) & i31) * 1739); i37 < size; i37++) {
                            derAdapterArr[i37].toDer(p4, listInvoke.get(i37));
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
                    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    private static java.lang.String $$g(int r6, int r7, short r8) {
                        /*
                            byte[] r0 = okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.$$c
                            int r7 = r7 * 3
                            int r7 = 107 - r7
                            int r8 = r8 * 3
                            int r8 = 4 - r8
                            int r6 = r6 * 2
                            int r1 = r6 + 1
                            byte[] r1 = new byte[r1]
                            r2 = 0
                            if (r0 != 0) goto L16
                            r3 = r8
                            r4 = r2
                            goto L2b
                        L16:
                            r3 = r2
                        L17:
                            byte r4 = (byte) r7
                            r1[r3] = r4
                            if (r3 != r6) goto L22
                            java.lang.String r6 = new java.lang.String
                            r6.<init>(r1, r2)
                            return r6
                        L22:
                            int r3 = r3 + 1
                            r4 = r0[r8]
                            r5 = r8
                            r8 = r7
                            r7 = r4
                            r4 = r3
                            r3 = r5
                        L2b:
                            int r7 = r7 + r8
                            int r8 = r3 + 1
                            r3 = r4
                            goto L17
                        */
                        throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters$sequence$codec$1$encode$1.$$g(int, int, short):java.lang.String");
                    }
                });
            }
        }, false, null, false, 112, null);
    }

    public final DerAdapter<Pair<DerAdapter<?>, Object>> choice(final DerAdapter<?>... p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (DerAdapter) new DerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>>() { // from class: okhttp3.tls.internal.der.Adapters.choice.1
            private static final byte[] $$c = {106, -22, 107, 95};
            private static final int $$f = 110;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {49, 84, -120, 101, 18, 4, -57, 60, 3, 25, -13, 9, 17, -2, -51, 57, 19, -4, 20, 3, 0, 1, -48, 74, 9, -2, -57, 69, 8, -5, 7, 13, -56, 25, 40, 23, -5, 12, 5, -35, 55, -11, 15, 12, -74, 43, 11, 39, 11, -5, 3, 9, 0, 4, 25, -5, 12, 5, -21, 28, 1, 7, -28, 43, -1, 19, 6, -3, 13, -34, 39, 7, 1, 26, -3, 14, -74, 54, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, -12, 13, 11, -4, 11, 11, -1, -24, 43, -2, 12, -5, 25, -9, 19, -59, 39, -6, 17, -5, 12, 5, -24, 23, 30, -6, -2, 15, 12, -40, 50, -11, 12, 12, -2, 15, 12, 5, 3, -5, 4, 12, -2, 17, 3, 11, 4, 3, 11, -3, 5, 24, -7, 2, 24, -36, 40, -5, 7, 13, -2, 7, 7, 1, 26, -3, 14, -59};
            private static final int $$e = 161;
            private static final byte[] $$a = {19, 78, 114, 113, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
            private static final int $$b = 27;
            private static int TuitionPaymentFragmentbindingInflater1 = 0;
            private static int b = 1;
            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {59765, 59400, 59406, 59404, 59399, 59395, 59401, 59886, 59873, 59398, 59879, 59863, 59401, 59417, 59396, 59395, 59406, 59903, 59896, 59394, 59406, 59400, 59700, 59785, 59791, 59788, 59778, 59764, 59767, 59775, 59775, 59766, 59790, 59777, 59786, 59764, 59786, 59707, 59756, 59746, 59744, 59771, 59751, 59757, 59714, 59724, 59747, 59771, 59716, 59708, 59737, 59744, 59749, 59748, 59748, 59749, 59773, 59757, 59733, 59750, 59744, 59752, 59753, 59706, 59751, 59768, 59769, 59744, 59746, 59770, 59729, 59731, 59771, 59749, 59745, 59757, 59753, 59745, 59749, 59751, 59749};

            /* JADX WARN: Code duplicated, block: B:10:0x0027  */
            /* JADX WARN: Code duplicated, block: B:8:0x001f  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r7, short r8, short r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = okhttp3.tls.internal.der.Adapters.C08111.$$a
                    int r9 = r9 * 52
                    int r9 = r9 + 1
                    int r8 = r8 * 52
                    int r8 = 56 - r8
                    int r7 = r7 + 84
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2c
                L14:
                    r3 = r2
                    r6 = r8
                    r8 = r7
                    r7 = r6
                L18:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    if (r4 != r9) goto L27
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L27:
                    r3 = r0[r7]
                    r6 = r3
                    r3 = r7
                    r7 = r6
                L2c:
                    int r7 = -r7
                    int r8 = r8 + r7
                    int r8 = r8 + (-11)
                    int r7 = r3 + 1
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters.C08111.a(byte, short, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:10:0x002b  */
            /* JADX WARN: Code duplicated, block: B:8:0x0023  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
                /*
                    int r5 = r5 * 59
                    int r0 = 112 - r5
                    byte[] r1 = okhttp3.tls.internal.der.Adapters.C08111.$$d
                    int r6 = r6 * 15
                    int r6 = 99 - r6
                    int r7 = r7 * 111
                    int r7 = 114 - r7
                    byte[] r0 = new byte[r0]
                    int r5 = 111 - r5
                    r2 = 0
                    if (r1 != 0) goto L19
                    r3 = r6
                    r4 = r2
                    r6 = r5
                    goto L2d
                L19:
                    r3 = r2
                L1a:
                    byte r4 = (byte) r6
                    int r7 = r7 + 1
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r5) goto L2b
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    r8[r2] = r5
                    return
                L2b:
                    r3 = r1[r7]
                L2d:
                    int r6 = r6 + r3
                    int r6 = r6 + (-6)
                    r3 = r4
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters.C08111.d(int, int, byte, java.lang.Object[]):void");
            }

            /* JADX WARN: Code duplicated, block: B:68:0x0250  */
            /* JADX WARN: Code duplicated, block: B:72:0x026e  */
            /* JADX WARN: Code duplicated, block: B:89:0x025c A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x025c -> B:71:0x026b). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void c(int[] r26, boolean r27, byte[] r28, java.lang.Object[] r29) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 650
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters.C08111.c(int[], boolean, byte[], java.lang.Object[]):void");
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> asSequenceOf(String str, int i, long j) {
                int i2 = 2 % 2;
                int i3 = b + 119;
                TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                int i4 = i3 % 2;
                BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> basicDerAdapterAsSequenceOf = DerAdapter.DefaultImpls.asSequenceOf(this, str, i, j);
                int i5 = TuitionPaymentFragmentbindingInflater1 + 43;
                b = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 7 / 0;
                }
                return basicDerAdapterAsSequenceOf;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> asSetOf() {
                int i = 2 % 2;
                int i2 = b + 53;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                BasicDerAdapter<List<Pair<? extends DerAdapter<?>, ? extends Object>>> basicDerAdapterAsSetOf = DerAdapter.DefaultImpls.asSetOf(this);
                int i4 = b + 95;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return basicDerAdapterAsSetOf;
                }
                throw null;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ Pair<? extends DerAdapter<?>, ? extends Object> fromDer(DerReader derReader) throws IOException {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 17;
                b = i2 % 128;
                int i3 = i2 % 2;
                Pair<? extends DerAdapter<?>, ? extends Object> pairFromDer2 = fromDer(derReader);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 57;
                b = i4 % 128;
                if (i4 % 2 != 0) {
                    return pairFromDer2;
                }
                throw null;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ Pair<? extends DerAdapter<?>, ? extends Object> fromDer(ByteString byteString) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 93;
                b = i2 % 128;
                int i3 = i2 % 2;
                Pair<? extends DerAdapter<?>, ? extends Object> pairFromDer2 = fromDer(byteString);
                int i4 = b + 77;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 79 / 0;
                }
                return pairFromDer2;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Pair<? extends DerAdapter<?>, ? extends Object> fromDer(ByteString byteString) {
                int i = 2 % 2;
                int i2 = b + 101;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Pair<? extends DerAdapter<?>, ? extends Object> pair = (Pair) DerAdapter.DefaultImpls.fromDer(this, byteString);
                int i3 = TuitionPaymentFragmentbindingInflater1 + 17;
                b = i3 % 128;
                int i4 = i3 % 2;
                return pair;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ ByteString toDer(Pair<? extends DerAdapter<?>, ? extends Object> pair) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 105;
                b = i2 % 128;
                int i3 = i2 % 2;
                ByteString der2 = toDer2(pair);
                int i4 = b + 93;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                if (i4 % 2 == 0) {
                    return der2;
                }
                throw null;
            }

            /* JADX INFO: renamed from: toDer, reason: avoid collision after fix types in other method */
            public final ByteString toDer2(Pair<? extends DerAdapter<?>, ? extends Object> pair) {
                int i = 2 % 2;
                int i2 = b + 67;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                ByteString der = DerAdapter.DefaultImpls.toDer(this, pair);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 7;
                b = i4 % 128;
                int i5 = i4 % 2;
                return der;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final /* bridge */ /* synthetic */ void toDer(DerWriter derWriter, Pair<? extends DerAdapter<?>, ? extends Object> pair) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 41;
                b = i2 % 128;
                int i3 = i2 % 2;
                toDer2(derWriter, pair);
                int i4 = TuitionPaymentFragmentbindingInflater1 + 21;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 6 / 0;
                }
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<Pair<? extends DerAdapter<?>, ? extends Object>> withExplicitBox(int i, long j, Boolean bool) throws Throwable {
                Object[] objArr;
                int i2 = 2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char cAxisFromString = (char) ((-1) - MotionEvent.axisFromString(""));
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 11;
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a((byte) 14, bArr[5], bArr[7], objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cAxisFromString, edgeSlop, iIndexOf, 252381699, false, (String) objArr2[0], null);
                }
                Object obj = null;
                long j2 = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{0, 22, 156, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{22, 15, 25, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                    int iIndexOf2 = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int iAlpha = 10 - Color.alpha(0);
                    byte[] bArr2 = $$a;
                    byte b2 = bArr2[7];
                    byte b3 = bArr2[5];
                    Object[] objArr5 = new Object[1];
                    a(b2, b3, b3, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cKeyCodeFromString, iIndexOf2, iAlpha, 2009631821, false, (String) objArr5[0], null);
                }
                if (j2 == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 876;
                        int i3 = 11 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[0];
                        byte b5 = bArr3[7];
                        Object[] objArr6 = new Object[1];
                        a(b4, b5, b5, objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cCombineMeasuredStates, maximumDrawingCacheSize, i3, 256017550, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
                    int i4 = ~System.identityHashCode(this);
                    int i5 = (((-1139479900) + (((~((-33333043) | i4)) | (-6977187)) * (-933))) + (((~(i4 | (-6977187))) | 155776) * 933)) - 406051620;
                    int i6 = (i5 << 13) ^ i5;
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                } else {
                    Object[] objArr8 = new Object[1];
                    c(new int[]{37, 26, 0, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    Object[] objArr9 = new Object[1];
                    c(new int[]{63, 18, 0, 0}, false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, objArr9);
                    Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
                    if (applicationContext != null) {
                        int i8 = TuitionPaymentFragmentbindingInflater1 + 33;
                        b = i8 % 128;
                        if (i8 % 2 == 0) {
                            boolean z = applicationContext instanceof ContextWrapper;
                            obj.hashCode();
                            throw null;
                        }
                        applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
                    }
                    int i9 = b + 3;
                    TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                    int i10 = i9 % 2;
                    try {
                        Object[] objArr10 = {applicationContext, Integer.valueOf(i), 774245435};
                        byte[] bArr4 = $$d;
                        byte b6 = bArr4[20];
                        Object[] objArr11 = new Object[1];
                        d(b6, b6, bArr4[21], objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        byte b7 = bArr4[21];
                        Object[] objArr12 = new Object[1];
                        d(b7, b7, bArr4[20], objArr12);
                        objArr = (Object[]) cls3.getMethod((String) objArr12[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                        if (applicationContext != null) {
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                char c = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int mode = View.MeasureSpec.getMode(0) + 876;
                                int i11 = 11 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                byte[] bArr5 = $$a;
                                byte b8 = bArr5[0];
                                byte b9 = bArr5[7];
                                Object[] objArr13 = new Object[1];
                                a(b8, b9, b9, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, mode, i11, 256017550, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                            try {
                                Object[] objArr14 = new Object[1];
                                c(new int[]{0, 22, 156, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, objArr14);
                                Class<?> cls4 = Class.forName((String) objArr14[0]);
                                Object[] objArr15 = new Object[1];
                                c(new int[]{22, 15, 25, 0}, true, new byte[]{0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1}, objArr15);
                                long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr15[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue2);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                    char touchSlop = (char) (ViewConfiguration.getTouchSlop() >> 8);
                                    int defaultSize = 876 - View.getDefaultSize(0, 0);
                                    int gidForName = Process.getGidForName("") + 11;
                                    byte[] bArr6 = $$a;
                                    byte b10 = bArr6[7];
                                    byte b11 = bArr6[5];
                                    Object[] objArr16 = new Object[1];
                                    a(b10, b11, b11, objArr16);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(touchSlop, defaultSize, gidForName, 2009631821, false, (String) objArr16[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 877;
                                    int iArgb = 10 - Color.argb(0, 0, 0, 0);
                                    byte[] bArr7 = $$a;
                                    byte b12 = bArr7[5];
                                    byte b13 = bArr7[7];
                                    Object[] objArr17 = new Object[1];
                                    a((byte) 14, b12, b13, objArr17);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(maximumDrawingCacheSize2, iLastIndexOf, iArgb, 252381699, false, (String) objArr17[0], null);
                                }
                                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                int i12 = ((int[]) objArr[2])[0];
                int i13 = ((int[]) objArr[0])[0];
                if (i13 == i12) {
                    int i14 = TuitionPaymentFragmentbindingInflater1 + 13;
                    b = i14 % 128;
                    int i15 = i14 % 2;
                    int i16 = ((int[]) objArr[1])[0];
                    int i17 = ((int[]) objArr[0])[0];
                    int i18 = ((int[]) objArr[2])[0];
                    new int[1][0] = i17;
                    new int[1][0] = i18;
                    int i19 = ~i;
                    int i20 = i16 + 594138376 + (((~((-226022789) | i19)) | (-185712560)) * 519) + (((~(i19 | (-152081797))) | (~((-33630764) | i))) * (-519)) + (((~(i | (-185712560))) | 226022788) * 519);
                    int i21 = (i20 << 13) ^ i20;
                    int i22 = i21 ^ (i21 >>> 17);
                    int[] iArr = {i22 ^ (i22 << 5)};
                } else {
                    Toast.makeText((Context) null, i13 / (((i13 - 1) * i13) % 2), 0).show();
                    int i23 = ((int[]) objArr[1])[0];
                    int i24 = ((int[]) objArr[0])[0];
                    int i25 = ((int[]) objArr[2])[0];
                    new int[1][0] = i24;
                    new int[1][0] = i25;
                    int i26 = i23 + (-1566838116) + ((~((-100741762) | i)) * (-301)) + (((~(924268193 | i)) | (~((~i) | 964578422))) * (-301)) + ((924268193 | (~((-964578423) | i))) * 301);
                    int i27 = (i26 << 13) ^ i26;
                    int i28 = i27 ^ (i27 >>> 17);
                    int[] iArr2 = {i28 ^ (i28 << 5)};
                    int i29 = TuitionPaymentFragmentbindingInflater1 + 19;
                    b = i29 % 128;
                    int i30 = i29 % 2;
                }
                return DerAdapter.DefaultImpls.withExplicitBox(this, i, j, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Pair<? extends DerAdapter<?>, ? extends Object> fromDer(DerReader p1) throws IOException {
                Object obj;
                DerAdapter<?> derAdapter;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 59;
                b = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(p1, "");
                DerHeader derHeaderPeekHeader = p1.peekHeader();
                if (derHeaderPeekHeader == null) {
                    throw new ProtocolException(Intrinsics.stringPlus("expected a value at ", p1));
                }
                DerAdapter<?>[] derAdapterArr = p0;
                int length = derAdapterArr.length;
                int i4 = 0;
                while (true) {
                    obj = null;
                    if (i4 >= length) {
                        derAdapter = null;
                        break;
                    }
                    int i5 = TuitionPaymentFragmentbindingInflater1 + 19;
                    b = i5 % 128;
                    int i6 = i5 % 2;
                    derAdapter = derAdapterArr[i4];
                    if (derAdapter.matches(derHeaderPeekHeader)) {
                        break;
                    }
                    i4++;
                    int i7 = b + 3;
                    TuitionPaymentFragmentbindingInflater1 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if (derAdapter == null) {
                    StringBuilder sb = new StringBuilder("expected a matching choice but was ");
                    sb.append(derHeaderPeekHeader);
                    sb.append(" at ");
                    sb.append(p1);
                    throw new ProtocolException(sb.toString());
                }
                Pair<? extends DerAdapter<?>, ? extends Object> pair = TuplesKt.to(derAdapter, derAdapter.fromDer(p1));
                int i9 = b + 55;
                TuitionPaymentFragmentbindingInflater1 = i9 % 128;
                if (i9 % 2 == 0) {
                    return pair;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX INFO: renamed from: toDer, reason: avoid collision after fix types in other method */
            public final void toDer2(DerWriter p1, Pair<? extends DerAdapter<?>, ? extends Object> p2) {
                int i = 2 % 2;
                int i2 = b + 49;
                TuitionPaymentFragmentbindingInflater1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(p1, "");
                Intrinsics.checkNotNullParameter(p2, "");
                p2.component1().toDer(p1, p2.component2());
                int i4 = b + 31;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
            }

            public final String toString() {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 43;
                b = i2 % 128;
                int i3 = i2 % 2;
                String strJoinToString$default = ArraysKt.joinToString$default(p0, " OR ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                int i4 = b + 7;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return strJoinToString$default;
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean matches(DerHeader p1) {
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentbindingInflater1 + 13;
                b = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(p1, "");
                boolean z = i3 != 0;
                int i4 = b + 107;
                TuitionPaymentFragmentbindingInflater1 = i4 % 128;
                int i5 = i4 % 2;
                return z;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0021  */
            /* JADX WARN: Code duplicated, block: B:8:0x001b  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$g(byte r5, short r6, short r7) {
                /*
                    int r7 = r7 * 2
                    int r0 = r7 + 1
                    int r6 = r6 * 2
                    int r6 = r6 + 4
                    int r5 = 105 - r5
                    byte[] r1 = okhttp3.tls.internal.der.Adapters.C08111.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L15
                    r4 = r6
                    r5 = r7
                    r3 = r2
                    goto L25
                L15:
                    r3 = r2
                L16:
                    byte r4 = (byte) r5
                    r0[r3] = r4
                    if (r3 != r7) goto L21
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r0, r2)
                    return r5
                L21:
                    r4 = r1[r6]
                    int r3 = r3 + 1
                L25:
                    int r6 = r6 + 1
                    int r4 = -r4
                    int r5 = r5 + r4
                    goto L16
                */
                throw new UnsupportedOperationException("Method not decompiled: okhttp3.tls.internal.der.Adapters.C08111.$$g(byte, short, short):java.lang.String");
            }
        };
    }

    public final DerAdapter<Object> usingTypeHint(final Function1<Object, ? extends DerAdapter<?>> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.usingTypeHint.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Object>> asSequenceOf(String str, int i, long j) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i, j);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object fromDer(ByteString byteString) {
                return DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final ByteString toDer(Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<Object> withExplicitBox(int i, long j, Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i, j, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void toDer(DerWriter p1, Object p2) throws IOException {
                Intrinsics.checkNotNullParameter(p1, "");
                DerAdapter<?> derAdapterInvoke = p0.invoke(p1.getTypeHint());
                if (derAdapterInvoke != null) {
                    derAdapterInvoke.toDer(p1, p2);
                } else {
                    if (p2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okio.ByteString");
                    }
                    p1.writeOctetString((ByteString) p2);
                }
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object fromDer(DerReader p1) {
                Intrinsics.checkNotNullParameter(p1, "");
                DerAdapter<?> derAdapterInvoke = p0.invoke(p1.getTypeHint());
                if (derAdapterInvoke != null) {
                    return derAdapterInvoke.fromDer(p1);
                }
                return p1.readUnknown();
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean matches(DerHeader p1) {
                Intrinsics.checkNotNullParameter(p1, "");
                return true;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DerAdapter any$default(Adapters adapters, Pair[] pairArr, boolean z, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            Object[] array = defaultAnyChoices.toArray(new Pair[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            pairArr = (Pair[]) array;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return adapters.any(pairArr, z, obj);
    }

    public final DerAdapter<Object> any(final Pair<? extends KClass<?>, ? extends DerAdapter<?>>[] p0, final boolean p1, final Object p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new DerAdapter<Object>() { // from class: okhttp3.tls.internal.der.Adapters.any.1
            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Object>> asSequenceOf(String str, int i, long j) {
                return DerAdapter.DefaultImpls.asSequenceOf(this, str, i, j);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<List<Object>> asSetOf() {
                return DerAdapter.DefaultImpls.asSetOf(this);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object fromDer(ByteString byteString) {
                return DerAdapter.DefaultImpls.fromDer(this, byteString);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final ByteString toDer(Object obj) {
                return DerAdapter.DefaultImpls.toDer(this, obj);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final BasicDerAdapter<Object> withExplicitBox(int i, long j, Boolean bool) {
                return DerAdapter.DefaultImpls.withExplicitBox(this, i, j, bool);
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final void toDer(DerWriter p3, Object p4) {
                Intrinsics.checkNotNullParameter(p3, "");
                if (p1 && Intrinsics.areEqual(p4, p2)) {
                    return;
                }
                Pair<KClass<?>, DerAdapter<?>>[] pairArr = p0;
                int length = pairArr.length;
                int i = 0;
                while (i < length) {
                    Pair<KClass<?>, DerAdapter<?>> pair = pairArr[i];
                    i++;
                    KClass<?> kClassComponent1 = pair.component1();
                    DerAdapter<?> derAdapterComponent2 = pair.component2();
                    if (kClassComponent1.isInstance(p4) || (p4 == null && Intrinsics.areEqual(kClassComponent1, Reflection.getOrCreateKotlinClass(Unit.class)))) {
                        derAdapterComponent2.toDer(p3, p4);
                        return;
                    }
                }
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final Object fromDer(DerReader p3) throws IOException {
                Intrinsics.checkNotNullParameter(p3, "");
                if (p1 && !p3.hasNext()) {
                    return p2;
                }
                DerHeader derHeaderPeekHeader = p3.peekHeader();
                if (derHeaderPeekHeader == null) {
                    throw new ProtocolException(Intrinsics.stringPlus("expected a value at ", p3));
                }
                Pair<KClass<?>, DerAdapter<?>>[] pairArr = p0;
                int length = pairArr.length;
                int i = 0;
                while (i < length) {
                    Pair<KClass<?>, DerAdapter<?>> pair = pairArr[i];
                    i++;
                    DerAdapter<?> derAdapterComponent2 = pair.component2();
                    if (derAdapterComponent2.matches(derHeaderPeekHeader)) {
                        return derAdapterComponent2.fromDer(p3);
                    }
                }
                StringBuilder sb = new StringBuilder("expected any but was ");
                sb.append(derHeaderPeekHeader);
                sb.append(" at ");
                sb.append(p3);
                throw new ProtocolException(sb.toString());
            }

            @Override // okhttp3.tls.internal.der.DerAdapter
            public final boolean matches(DerHeader p3) {
                Intrinsics.checkNotNullParameter(p3, "");
                return true;
            }
        };
    }
}
