package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 {*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002|{B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b \u0010!J;\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010#J+\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\b$\u0010%J?\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\b'\u0010(J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00012\u0006\u00102\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u00105JK\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00012\u0006\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b6\u00107JS\u00108\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u00101\u001a\u00028\u00012\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u00109J]\u0010;\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0006\u00101\u001a\u00028\u00002\u0006\u00102\u001a\u00028\u00012\u0006\u00103\u001a\u00020\u00042\b\u0010:\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b=\u0010.JA\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b@\u0010\u001fJ9\u0010A\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\bC\u0010DJ\u0019\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\bE\u0010FJ-\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\bG\u0010HJ?\u0010I\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ9\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010K\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0002¢\u0006\u0004\bK\u0010OJA\u0010M\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\bM\u0010JJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020P2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ[\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020P2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0004H\u0002¢\u0006\u0004\bU\u0010\u0013J#\u0010V\u001a\u00020\u00142\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\bV\u0010WJ%\u0010X\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\bX\u0010YJ'\u0010Z\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\bZ\u0010[JS\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020P2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0007¢\u0006\u0004\b\\\u0010]J;\u0010^\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b^\u0010_JO\u0010`\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&H\u0007¢\u0006\u0004\b`\u0010aJ3\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\bb\u0010cJW\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010eJG\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&¢\u0006\u0004\bf\u0010gJ_\u0010h\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u00101\u001a\u00020\tH\u0002¢\u0006\u0004\bh\u0010iJ;\u0010b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\bb\u0010jJO\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00020\u00042\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&¢\u0006\u0004\bf\u0010aJ`\u0010n\u001a\u00020m2O\u0010\u0005\u001aK\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\u0004\u0012\u00020m0kH\u0000¢\u0006\u0004\bn\u0010oJp\u0010p\u001a\u00020m2O\u0010\u0005\u001aK\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bl\u0012\u0004\u0012\u00020m0k2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\bp\u0010qR\u0016\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010t\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bt\u0010sR\u0016\u0010u\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010vR4\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010z"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "p0", "p1", "", "p2", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "p3", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asInsertResult", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "entryCount$runtime", "()I", "", "hasEntryAt$runtime", "(I)Z", "hasNodeAt", "entryKeyIndex$runtime", "(I)I", "nodeIndex$runtime", "keyAtIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", "nodeAtIndex$runtime", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeNodeAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p4", "p5", "p6", "bufferMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p7", "makeNode", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemoveEntryAtIndex", "mutableCollisionRemoveEntryAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableCollisionPutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAllFromOtherNodeCell", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "calculateSize", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "replaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableReplaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "", "accept$runtime", "(Lkotlin/jvm/functions/Function5;)V", "accept", "(Lkotlin/jvm/functions/Function5;II)V", "dataMap", "I", "nodeMap", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "buffer", "[Ljava/lang/Object;", "getBuffer$runtime", "()[Ljava/lang/Object;", "Companion", "ModificationResult"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJH\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0005\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00040\nH\u0087\b¢\u0006\u0004\b\u000b\u0010\fR.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p0", "", "p1", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Lkotlin/Function1;", "replaceNode", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "sizeDelta", "I", "getSizeDelta", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ModificationResult<K, V> {
        public static final int $stable = 8;
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(TrieNode<K, V> trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode<K, V> trieNode) {
            this.node = trieNode;
        }

        public final ModificationResult<K, V> replaceNode(Function1<? super TrieNode<K, V>, TrieNode<K, V>> p0) {
            setNode(p0.invoke(getNode()));
            return this;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    /* JADX INFO: renamed from: getBuffer$runtime, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.dataMap);
    }

    public final boolean hasEntryAt$runtime(int p0) {
        return (p0 & this.dataMap) != 0;
    }

    private final boolean hasNodeAt(int p0) {
        return (p0 & this.nodeMap) != 0;
    }

    public final int entryKeyIndex$runtime(int p0) {
        return Integer.bitCount((p0 - 1) & this.dataMap) * 2;
    }

    public final int nodeIndex$runtime(int p0) {
        return (this.buffer.length - 1) - Integer.bitCount((p0 - 1) & this.nodeMap);
    }

    private final K keyAtIndex(int p0) {
        return (K) this.buffer[p0];
    }

    private final V valueAtKeyIndex(int p0) {
        return (V) this.buffer[p0 + 1];
    }

    public final TrieNode<K, V> nodeAtIndex$runtime(int p0) {
        Object obj = this.buffer[p0];
        Intrinsics.checkNotNull(obj, "");
        return (TrieNode) obj;
    }

    private final TrieNode<K, V> insertEntryAt(int p0, K p1, V p2) {
        return new TrieNode<>(p0 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(p0), p1, p2));
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int p0, K p1, V p2, MutabilityOwnership p3) {
        int iEntryKeyIndex$runtime = entryKeyIndex$runtime(p0);
        if (this.ownedBy == p3) {
            this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime, p1, p2);
            this.dataMap = p0 | this.dataMap;
            return this;
        }
        return new TrieNode<>(p0 | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime, p1, p2), p3);
    }

    private final TrieNode<K, V> updateValueAtIndex(int p0, V p1) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0 + 1] = p1;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int p0, V p1, PersistentHashMapBuilder<K, V> p2) {
        if (this.ownedBy == p2.getOwnership()) {
            this.buffer[p0 + 1] = p1;
            return this;
        }
        p2.setModCount$runtime(p2.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0 + 1] = p1;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, p2.getOwnership());
    }

    private final TrieNode<K, V> updateNodeAtIndex(int p0, int p1, TrieNode<K, V> p2) {
        Object[] objArr = p2.buffer;
        if (objArr.length == 2 && p2.nodeMap == 0) {
            if (this.buffer.length == 1) {
                p2.dataMap = this.nodeMap;
                return p2;
            }
            return new TrieNode<>(this.dataMap ^ p1, p1 ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, p0, entryKeyIndex$runtime(p1), objArr[0], objArr[1]));
        }
        Object[] objArr2 = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = p2;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int p0, TrieNode<K, V> p1, MutabilityOwnership p2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && p1.buffer.length == 2 && p1.nodeMap == 0) {
            p1.dataMap = this.nodeMap;
            return p1;
        }
        if (this.ownedBy == p2) {
            objArr[p0] = p1;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        objArrCopyOf[p0] = p1;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, p2);
    }

    private final TrieNode<K, V> removeNodeAtIndex(int p0, int p1) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, p1 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, p0));
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int p0, int p1, MutabilityOwnership p2) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == p2) {
            this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, p0);
            this.nodeMap ^= p1;
            return this;
        }
        return new TrieNode<>(this.dataMap, p1 ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, p0), p2);
    }

    private final Object[] bufferMoveEntryToNode(int p0, int p1, int p2, K p3, V p4, int p5, MutabilityOwnership p6) {
        K kKeyAtIndex = keyAtIndex(p0);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, p0, nodeIndex$runtime(p1) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(p0), p2, p3, p4, p5 + 5, p6));
    }

    private final TrieNode<K, V> moveEntryToNode(int p0, int p1, int p2, K p3, V p4, int p5) {
        return new TrieNode<>(this.dataMap ^ p1, p1 | this.nodeMap, bufferMoveEntryToNode(p0, p1, p2, p3, p4, p5, null));
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int p0, int p1, int p2, K p3, V p4, int p5, MutabilityOwnership p6) {
        if (this.ownedBy == p6) {
            this.buffer = bufferMoveEntryToNode(p0, p1, p2, p3, p4, p5, p6);
            this.dataMap ^= p1;
            this.nodeMap |= p1;
            return this;
        }
        return new TrieNode<>(this.dataMap ^ p1, p1 | this.nodeMap, bufferMoveEntryToNode(p0, p1, p2, p3, p4, p5, p6), p6);
    }

    private final TrieNode<K, V> makeNode(int p0, K p1, V p2, int p3, K p4, V p5, int p6, MutabilityOwnership p7) {
        Object[] objArr;
        if (p6 > 30) {
            return new TrieNode<>(0, 0, new Object[]{p1, p2, p4, p5}, p7);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(p0, p6);
        int iIndexSegment2 = TrieNodeKt.indexSegment(p3, p6);
        if (iIndexSegment != iIndexSegment2) {
            if (iIndexSegment < iIndexSegment2) {
                objArr = new Object[]{p1, p2, p4, p5};
            } else {
                objArr = new Object[]{p4, p5, p1, p2};
            }
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, objArr, p7);
        }
        return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(p0, p1, p2, p3, p4, p5, p6 + 5, p7)}, p7);
    }

    private final TrieNode<K, V> removeEntryAtIndex(int p0, int p1) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(p1 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, p0));
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int p0, int p1, PersistentHashMapBuilder<K, V> p2) {
        p2.setSize(p2.size() - 1);
        p2.setOperationResult$runtime(valueAtKeyIndex(p0));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == p2.getOwnership()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, p0);
            this.dataMap ^= p1;
            return this;
        }
        return new TrieNode<>(p1 ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, p0), p2.getOwnership());
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int p0) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, p0));
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int p0, PersistentHashMapBuilder<K, V> p1) {
        p1.setSize(p1.size() - 1);
        p1.setOperationResult$runtime(valueAtKeyIndex(p0));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == p1.getOwnership()) {
            this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, p0);
            return this;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, p0), p1.getOwnership());
    }

    private final boolean collisionContainsKey(K p0) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K p0) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(p0, keyAtIndex(first))) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return valueAtKeyIndex(first);
    }

    private final ModificationResult<K, V> collisionPut(K p0, V p1) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            if (p1 == valueAtKeyIndex(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[first + 1] = p1;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, p0, p1)).asInsertResult();
    }

    private final TrieNode<K, V> mutableCollisionPut(K p0, V p1, PersistentHashMapBuilder<K, V> p2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            p2.setOperationResult$runtime(valueAtKeyIndex(first));
            if (this.ownedBy == p2.getOwnership()) {
                this.buffer[first + 1] = p1;
                return this;
            }
            p2.setModCount$runtime(p2.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
            objArrCopyOf[first + 1] = p1;
            return new TrieNode<>(0, 0, objArrCopyOf, p2.getOwnership());
        }
        p2.setSize(p2.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, p0, p1), p2.getOwnership());
    }

    private final TrieNode<K, V> collisionRemove(K p0) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return collisionRemoveEntryAtIndex(first);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K p0, PersistentHashMapBuilder<K, V> p1) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(p0, keyAtIndex(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(first, p1);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemove(K p0, V p1) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(p0, keyAtIndex(first)) && Intrinsics.areEqual(p1, valueAtKeyIndex(first))) {
                    return collisionRemoveEntryAtIndex(first);
                }
                if (first != last) {
                    first += step;
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K p0, V p1, PersistentHashMapBuilder<K, V> p2) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.areEqual(p0, keyAtIndex(first)) && Intrinsics.areEqual(p1, valueAtKeyIndex(first))) {
                    return mutableCollisionRemoveEntryAtIndex(first, p2);
                }
                if (first != last) {
                    first += step;
                }
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> p0, DeltaCounter p1, MutabilityOwnership p2) {
        CommonFunctionsKt.m3653assert(this.nodeMap == 0);
        CommonFunctionsKt.m3653assert(this.dataMap == 0);
        CommonFunctionsKt.m3653assert(p0.nodeMap == 0);
        CommonFunctionsKt.m3653assert(p0.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + p0.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        int length = this.buffer.length;
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, p0.buffer.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (!collisionContainsKey(p0.buffer[first])) {
                    Object[] objArr2 = p0.buffer;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    p1.setCount(p1.getCount() + 1);
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == p0.buffer.length) {
            return p0;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode<>(0, 0, objArrCopyOf, p2);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
        return new TrieNode<>(0, 0, objArrCopyOf2, p2);
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> p0, int p1, int p2, DeltaCounter p3, PersistentHashMapBuilder<K, V> p4) {
        if (hasNodeAt(p1)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(p1));
            if (p0.hasNodeAt(p1)) {
                return trieNodeNodeAtIndex$runtime.mutablePutAll(p0.nodeAtIndex$runtime(p0.nodeIndex$runtime(p1)), p2 + 5, p3, p4);
            }
            if (!p0.hasEntryAt$runtime(p1)) {
                return trieNodeNodeAtIndex$runtime;
            }
            int iEntryKeyIndex$runtime = p0.entryKeyIndex$runtime(p1);
            K kKeyAtIndex = p0.keyAtIndex(iEntryKeyIndex$runtime);
            V vValueAtKeyIndex = p0.valueAtKeyIndex(iEntryKeyIndex$runtime);
            int size = p4.size();
            TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, p2 + 5, p4);
            if (p4.size() == size) {
                p3.setCount(p3.getCount() + 1);
            }
            return trieNodeMutablePut;
        }
        if (p0.hasNodeAt(p1)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime2 = p0.nodeAtIndex$runtime(p0.nodeIndex$runtime(p1));
            if (!hasEntryAt$runtime(p1)) {
                return trieNodeNodeAtIndex$runtime2;
            }
            int iEntryKeyIndex$runtime2 = entryKeyIndex$runtime(p1);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime2);
            int i = p2 + 5;
            if (!trieNodeNodeAtIndex$runtime2.containsKey(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, i)) {
                return trieNodeNodeAtIndex$runtime2.mutablePut(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, valueAtKeyIndex(iEntryKeyIndex$runtime2), i, p4);
            }
            p3.setCount(p3.getCount() + 1);
            return trieNodeNodeAtIndex$runtime2;
        }
        int iEntryKeyIndex$runtime3 = entryKeyIndex$runtime(p1);
        K kKeyAtIndex3 = keyAtIndex(iEntryKeyIndex$runtime3);
        V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime3);
        int iEntryKeyIndex$runtime4 = p0.entryKeyIndex$runtime(p1);
        K kKeyAtIndex4 = p0.keyAtIndex(iEntryKeyIndex$runtime4);
        return makeNode(kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, vValueAtKeyIndex2, kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, p0.valueAtKeyIndex(iEntryKeyIndex$runtime4), p2 + 5, p4.getOwnership());
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += nodeAtIndex$runtime(i).calculateSize();
        }
        return iBitCount;
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> p0) {
        if (this == p0) {
            return true;
        }
        if (this.nodeMap != p0.nodeMap || this.dataMap != p0.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != p0.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsKey(int p0, K p1, int p2) {
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = this;
        while (true) {
            int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
            if (trieNodeNodeAtIndex$runtime.hasEntryAt$runtime(iIndexSegment)) {
                return Intrinsics.areEqual(p1, trieNodeNodeAtIndex$runtime.keyAtIndex(trieNodeNodeAtIndex$runtime.entryKeyIndex$runtime(iIndexSegment)));
            }
            if (!trieNodeNodeAtIndex$runtime.hasNodeAt(iIndexSegment)) {
                return false;
            }
            trieNodeNodeAtIndex$runtime = trieNodeNodeAtIndex$runtime.nodeAtIndex$runtime(trieNodeNodeAtIndex$runtime.nodeIndex$runtime(iIndexSegment));
            if (p2 == 30) {
                return trieNodeNodeAtIndex$runtime.collisionContainsKey(p1);
            }
            p2 += 5;
        }
    }

    public final V get(int p0, K p1, int p2) {
        TrieNode<K, V> trieNodeNodeAtIndex$runtime = this;
        while (true) {
            int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
            if (trieNodeNodeAtIndex$runtime.hasEntryAt$runtime(iIndexSegment)) {
                int iEntryKeyIndex$runtime = trieNodeNodeAtIndex$runtime.entryKeyIndex$runtime(iIndexSegment);
                if (Intrinsics.areEqual(p1, trieNodeNodeAtIndex$runtime.keyAtIndex(iEntryKeyIndex$runtime))) {
                    return trieNodeNodeAtIndex$runtime.valueAtKeyIndex(iEntryKeyIndex$runtime);
                }
                return null;
            }
            if (!trieNodeNodeAtIndex$runtime.hasNodeAt(iIndexSegment)) {
                return null;
            }
            trieNodeNodeAtIndex$runtime = trieNodeNodeAtIndex$runtime.nodeAtIndex$runtime(trieNodeNodeAtIndex$runtime.nodeIndex$runtime(iIndexSegment));
            if (p2 == 30) {
                return trieNodeNodeAtIndex$runtime.collisionGet(p1);
            }
            p2 += 5;
        }
    }

    public final TrieNode<K, V> mutablePutAll(TrieNode<K, V> p0, int p1, DeltaCounter p2, PersistentHashMapBuilder<K, V> p3) {
        if (this == p0) {
            p2.plusAssign(calculateSize());
            return this;
        }
        if (p1 > 30) {
            return mutableCollisionPutAll(p0, p2, p3.getOwnership());
        }
        int i = this.nodeMap | p0.nodeMap;
        int i2 = this.dataMap;
        int i3 = p0.dataMap;
        int i4 = (i2 ^ i3) & (~i);
        int i5 = i2 & i3;
        int i6 = i4;
        while (i5 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i5);
            if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime(iLowestOneBit)), p0.keyAtIndex(p0.entryKeyIndex$runtime(iLowestOneBit)))) {
                i6 |= iLowestOneBit;
            } else {
                i |= iLowestOneBit;
            }
            i5 ^= iLowestOneBit;
        }
        if ((i & i6) != 0) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode = (Intrinsics.areEqual(this.ownedBy, p3.getOwnership()) && this.dataMap == i6 && this.nodeMap == i) ? this : new TrieNode<>(i6, i, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i)]);
        int i7 = 0;
        int i8 = i;
        int i9 = 0;
        while (i8 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i8);
            Object[] objArr = trieNode.buffer;
            objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(p0, iLowestOneBit2, p1, p2, p3);
            i9++;
            i8 ^= iLowestOneBit2;
        }
        while (i6 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i6);
            int i10 = i7 * 2;
            if (!p0.hasEntryAt$runtime(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iLowestOneBit3);
                trieNode.buffer[i10] = keyAtIndex(iEntryKeyIndex$runtime);
                trieNode.buffer[i10 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime);
            } else {
                int iEntryKeyIndex$runtime2 = p0.entryKeyIndex$runtime(iLowestOneBit3);
                trieNode.buffer[i10] = p0.keyAtIndex(iEntryKeyIndex$runtime2);
                trieNode.buffer[i10 + 1] = p0.valueAtKeyIndex(iEntryKeyIndex$runtime2);
                if (hasEntryAt$runtime(iLowestOneBit3)) {
                    p2.setCount(p2.getCount() + 1);
                }
            }
            i7++;
            i6 ^= iLowestOneBit3;
        }
        if (elementsIdentityEquals(trieNode)) {
            return this;
        }
        return p0.elementsIdentityEquals(trieNode) ? p0 : trieNode;
    }

    public final ModificationResult<K, V> put(int p0, K p1, V p2, int p3) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime))) {
                if (valueAtKeyIndex(iEntryKeyIndex$runtime) == p2) {
                    return null;
                }
                return updateValueAtIndex(iEntryKeyIndex$runtime, p2).asUpdateResult();
            }
            return moveEntryToNode(iEntryKeyIndex$runtime, iIndexSegment, p0, p1, p2, p3).asInsertResult();
        }
        if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p3 == 30) {
                modificationResultPut = trieNodeNodeAtIndex$runtime.collisionPut(p1, p2);
                if (modificationResultPut == null) {
                    return null;
                }
            } else {
                modificationResultPut = trieNodeNodeAtIndex$runtime.put(p0, p1, p2, p3 + 5);
                if (modificationResultPut == null) {
                    return null;
                }
            }
            modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime, iIndexSegment, modificationResultPut.getNode()));
            return modificationResultPut;
        }
        return insertEntryAt(iIndexSegment, p1, p2).asInsertResult();
    }

    public final TrieNode<K, V> mutablePut(int p0, K p1, V p2, int p3, PersistentHashMapBuilder<K, V> p4) {
        TrieNode<K, V> trieNodeMutablePut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime))) {
                p4.setOperationResult$runtime(valueAtKeyIndex(iEntryKeyIndex$runtime));
                if (valueAtKeyIndex(iEntryKeyIndex$runtime) != p2) {
                    return mutableUpdateValueAtIndex(iEntryKeyIndex$runtime, p2, p4);
                }
            } else {
                p4.setSize(p4.size() + 1);
                return mutableMoveEntryToNode(iEntryKeyIndex$runtime, iIndexSegment, p0, p1, p2, p3, p4.getOwnership());
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p3 == 30) {
                trieNodeMutablePut = trieNodeNodeAtIndex$runtime.mutableCollisionPut(p1, p2, p4);
            } else {
                trieNodeMutablePut = trieNodeNodeAtIndex$runtime.mutablePut(p0, p1, p2, p3 + 5, p4);
            }
            if (trieNodeNodeAtIndex$runtime != trieNodeMutablePut) {
                return mutableUpdateNodeAtIndex(iNodeIndex$runtime, trieNodeMutablePut, p4.getOwnership());
            }
        } else {
            p4.setSize(p4.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, p1, p2, p4.getOwnership());
        }
        return this;
    }

    public final TrieNode<K, V> remove(int p0, K p1, int p2) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p2 == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime.collisionRemove(p1);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime.remove(p0, p1, p2 + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime, trieNodeRemove, iNodeIndex$runtime, iIndexSegment);
        }
        return this;
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> p0, TrieNode<K, V> p1, int p2, int p3) {
        if (p1 == null) {
            return removeNodeAtIndex(p2, p3);
        }
        return p0 != p1 ? updateNodeAtIndex(p2, p3, p1) : this;
    }

    public final TrieNode<K, V> mutableRemove(int p0, K p1, int p2, PersistentHashMapBuilder<K, V> p3) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p2);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment, p3);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p2 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableCollisionRemove(p1, p3);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableRemove(p0, p1, p2 + 5, p3);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime, trieNodeMutableRemove, iNodeIndex$runtime, iIndexSegment, p3.getOwnership());
        }
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> p0, TrieNode<K, V> p1, int p2, int p3, MutabilityOwnership p4) {
        if (p1 == null) {
            return mutableRemoveNodeAtIndex(p2, p3, p4);
        }
        return (this.ownedBy == p4 || p0 != p1) ? mutableUpdateNodeAtIndex(p2, p1, p4) : this;
    }

    public final TrieNode<K, V> remove(int p0, K p1, V p2, int p3) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime)) && Intrinsics.areEqual(p2, valueAtKeyIndex(iEntryKeyIndex$runtime))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p3 == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime.collisionRemove(p1, p2);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime.remove(p0, p1, p2, p3 + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime, trieNodeRemove, iNodeIndex$runtime, iIndexSegment);
        }
        return this;
    }

    public final TrieNode<K, V> mutableRemove(int p0, K p1, V p2, int p3, PersistentHashMapBuilder<K, V> p4) {
        TrieNode<K, V> trieNodeMutableRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(p0, p3);
        if (hasEntryAt$runtime(iIndexSegment)) {
            int iEntryKeyIndex$runtime = entryKeyIndex$runtime(iIndexSegment);
            if (Intrinsics.areEqual(p1, keyAtIndex(iEntryKeyIndex$runtime)) && Intrinsics.areEqual(p2, valueAtKeyIndex(iEntryKeyIndex$runtime))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime, iIndexSegment, p4);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime = nodeIndex$runtime(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime = nodeAtIndex$runtime(iNodeIndex$runtime);
            if (p3 == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableCollisionRemove(p1, p2, p4);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime.mutableRemove(p0, p1, p2, p3 + 5, p4);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime, trieNodeMutableRemove, iNodeIndex$runtime, iIndexSegment, p4.getOwnership());
        }
        return this;
    }

    public final void accept$runtime(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p0) {
        accept(p0, 0, 0);
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> p0, int p1, int p2) {
        p0.invoke(this, Integer.valueOf(p2), Integer.valueOf(p1), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i = this.nodeMap;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            nodeAtIndex$runtime(nodeIndex$runtime(iLowestOneBit)).accept(p0, (Integer.numberOfTrailingZeros(iLowestOneBit) << p2) + p1, p2 + 5);
            i -= iLowestOneBit;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
