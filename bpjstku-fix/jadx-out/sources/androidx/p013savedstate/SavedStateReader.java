package androidx.p013savedstate;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.os.BundleCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0016\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\u0019\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\b\f\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b \u0010\u001eJ\u0015\u0010%\u001a\u00020\"2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010,\u001a\u00020)2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010/\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b-\u0010.J\u0015\u00103\u001a\u0002002\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u0004\u0018\u0001002\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b4\u00105J\u0015\u0010:\u001a\u0002072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b8\u00109J\u0017\u0010=\u001a\u0004\u0018\u0001072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b;\u0010<J/\u0010D\u001a\u00028\u0000\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0004\bB\u0010CJ$\u0010D\u001a\u00028\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bB\u0010EJ/\u0010G\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0004\bF\u0010CJ&\u0010G\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bF\u0010EJ/\u0010K\u001a\u00028\u0000\"\b\b\u0000\u0010?*\u00020H2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0004\bI\u0010JJ$\u0010K\u001a\u00028\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020H2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bI\u0010LJ/\u0010N\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010?*\u00020H2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0004\bM\u0010JJ&\u0010N\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010?\u0018\u0001*\u00020H2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bM\u0010LJ\u0017\u0010R\u001a\u00020O2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u0004\u0018\u00010O2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bS\u0010QJ\u0017\u0010X\u001a\u00020U2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bY\u0010WJ!\u0010^\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030[2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\\\u0010]J!\u0010`\u001a\u000e\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b_\u0010]J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\ba\u0010bJ\u0017\u0010e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bd\u0010bJ\u001d\u0010i\u001a\b\u0012\u0004\u0012\u0002000f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bg\u0010hJ\u001d\u0010k\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010f2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bj\u0010hJ\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001c0f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bl\u0010hJ\u001d\u0010o\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010f2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bn\u0010hJ!\u0010q\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bp\u0010hJ!\u0010s\u001a\u000e\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0018\u00010f2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\br\u0010hJ\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00070f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\bt\u0010hJ\u001d\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010f2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\bv\u0010hJ5\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000f\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0004\bx\u0010yJ*\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000f\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\bx\u0010hJ5\u0010|\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010f\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0004\b{\u0010yJ,\u0010|\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010f\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b{\u0010hJ\u0018\u0010\u0080\u0001\u001a\u00020}2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0082\u0001\u001a\u0004\u0018\u00010}2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0005\b\u0081\u0001\u0010\u007fJ\u001b\u0010\u0086\u0001\u001a\u00030\u0083\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001b\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0083\u00012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0085\u0001J \u0010\u008b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0[2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J \u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b\u008c\u0001\u0010\u008a\u0001J\u001b\u0010\u0091\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001b\u0010\u0093\u0001\u001a\u0005\u0018\u00010\u008e\u00012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0090\u0001J\u001b\u0010\u0097\u0001\u001a\u00030\u0094\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u001b\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0094\u00012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b\u0098\u0001\u0010\u0096\u0001J\u001b\u0010\u009d\u0001\u001a\u00030\u009a\u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001b\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009a\u00012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009c\u0001J\u001b\u0010£\u0001\u001a\u00030 \u00012\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u001b\u0010¥\u0001\u001a\u0005\u0018\u00010 \u00012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b¤\u0001\u0010¢\u0001J \u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070[2\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b¦\u0001\u0010§\u0001J \u0010ª\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010[2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b©\u0001\u0010§\u0001J8\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000[\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0006\b«\u0001\u0010¬\u0001J-\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000[\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b«\u0001\u0010®\u0001J8\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010[\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0006\b¯\u0001\u0010¬\u0001J/\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010[\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b¯\u0001\u0010®\u0001J9\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000±\u0001\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0006\b²\u0001\u0010³\u0001J.\u0010´\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000±\u0001\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b²\u0001\u0010µ\u0001J9\u0010·\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010±\u0001\"\b\b\u0000\u0010?*\u00020>2\u0006\u0010\u0004\u001a\u00020\u00072\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@¢\u0006\u0006\b¶\u0001\u0010³\u0001J0\u0010·\u0001\u001a\u000b\u0012\u0004\u0012\u00028\u0000\u0018\u00010±\u0001\"\n\b\u0000\u0010?\u0018\u0001*\u00020>2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\b¢\u0006\u0006\b¶\u0001\u0010µ\u0001J\u001e\u0010º\u0001\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0007¢\u0006\u0006\b¸\u0001\u0010¹\u0001J \u0010¼\u0001\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0006\b»\u0001\u0010¹\u0001J\u0010\u0010¿\u0001\u001a\u000200¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u0010\u0010Â\u0001\u001a\u00020\u000e¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0017\u0010Ä\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0005\bÃ\u0001\u0010\u0010J\u001a\u0010Æ\u0001\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0005\bÅ\u0001\u0010\u0010J\u001c\u0010É\u0001\u001a\u00020\u000e2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0010\u0010Ë\u0001\u001a\u000200¢\u0006\u0006\bÊ\u0001\u0010¾\u0001J\u0012\u0010Î\u0001\u001a\u00020\u0007H\u0007¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J!\u0010Ò\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ï\u0001H\u0007¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u001d\u0010Õ\u0001\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u0013\u0010×\u0001\u001a\u000200HÖ\u0001¢\u0006\u0006\bÖ\u0001\u0010¾\u0001J\u0013\u0010Ù\u0001\u001a\u00020\u0007HÖ\u0001¢\u0006\u0006\bØ\u0001\u0010Í\u0001R\u001b\u0010Ú\u0001\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0083\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001\u0088\u0001Ú\u0001\u0092\u0001\u00060\u0002j\u0002`\u0003"}, d2 = {"Landroidx/savedstate/SavedStateReader;", "", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p0", "constructor-impl", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "", "Landroid/os/IBinder;", "getBinder-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/IBinder;", "getBinder", "getBinderOrNull-impl", "getBinderOrNull", "", "getBoolean-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Z", "getBoolean", "getBooleanOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "getBooleanOrNull", "", "getChar-impl", "(Landroid/os/Bundle;Ljava/lang/String;)C", "getChar", "getCharOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Character;", "getCharOrNull", "", "getCharSequence-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/CharSequence;", "getCharSequence", "getCharSequenceOrNull-impl", "getCharSequenceOrNull", "", "getDouble-impl", "(Landroid/os/Bundle;Ljava/lang/String;)D", "getDouble", "getDoubleOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Double;", "getDoubleOrNull", "", "getFloat-impl", "(Landroid/os/Bundle;Ljava/lang/String;)F", "getFloat", "getFloatOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Float;", "getFloatOrNull", "", "getInt-impl", "(Landroid/os/Bundle;Ljava/lang/String;)I", "getInt", "getIntOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Integer;", "getIntOrNull", "", "getLong-impl", "(Landroid/os/Bundle;Ljava/lang/String;)J", "getLong", "getLongOrNull-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Long;", "getLongOrNull", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/reflect/KClass;", "p1", "getParcelable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/os/Parcelable;", "getParcelable", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "getParcelableOrNull-impl", "getParcelableOrNull", "Ljava/io/Serializable;", "getJavaSerializable-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/io/Serializable;", "getJavaSerializable", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "getJavaSerializableOrNull-impl", "getJavaSerializableOrNull", "Landroid/util/Size;", "getSize-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/Size;", "getSize", "getSizeOrNull-impl", "getSizeOrNull", "Landroid/util/SizeF;", "getSizeF-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SizeF;", "getSizeF", "getSizeFOrNull-impl", "getSizeFOrNull", "", "getSavedStateArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;", "getSavedStateArray", "getSavedStateArrayOrNull-impl", "getSavedStateArrayOrNull", "getString-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "getString", "getStringOrNull-impl", "getStringOrNull", "", "getIntList-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getIntList", "getIntListOrNull-impl", "getIntListOrNull", "getCharSequenceList-impl", "getCharSequenceList", "getCharSequenceListOrNull-impl", "getCharSequenceListOrNull", "getSavedStateList-impl", "getSavedStateList", "getSavedStateListOrNull-impl", "getSavedStateListOrNull", "getStringList-impl", "getStringList", "getStringListOrNull-impl", "getStringListOrNull", "getParcelableList-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/util/List;", "getParcelableList", "getParcelableListOrNull-impl", "getParcelableListOrNull", "", "getBooleanArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Z", "getBooleanArray", "getBooleanArrayOrNull-impl", "getBooleanArrayOrNull", "", "getCharArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[C", "getCharArray", "getCharArrayOrNull-impl", "getCharArrayOrNull", "getCharSequenceArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/CharSequence;", "getCharSequenceArray", "getCharSequenceArrayOrNull-impl", "getCharSequenceArrayOrNull", "", "getDoubleArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[D", "getDoubleArray", "getDoubleArrayOrNull-impl", "getDoubleArrayOrNull", "", "getFloatArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[F", "getFloatArray", "getFloatArrayOrNull-impl", "getFloatArrayOrNull", "", "getIntArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[I", "getIntArray", "getIntArrayOrNull-impl", "getIntArrayOrNull", "", "getLongArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[J", "getLongArray", "getLongArrayOrNull-impl", "getLongArrayOrNull", "getStringArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/lang/String;", "getStringArray", "getStringArrayOrNull-impl", "getStringArrayOrNull", "getParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)[Landroid/os/Parcelable;", "getParcelableArray", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "getParcelableArrayOrNull-impl", "getParcelableArrayOrNull", "Landroid/util/SparseArray;", "getSparseParcelableArray-impl", "(Landroid/os/Bundle;Ljava/lang/String;Lkotlin/reflect/KClass;)Landroid/util/SparseArray;", "getSparseParcelableArray", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/util/SparseArray;", "getSparseParcelableArrayOrNull-impl", "getSparseParcelableArrayOrNull", "getSavedState-impl", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Bundle;", "getSavedState", "getSavedStateOrNull-impl", "getSavedStateOrNull", "size-impl", "(Landroid/os/Bundle;)I", "size", "isEmpty-impl", "(Landroid/os/Bundle;)Z", "isEmpty", "isNull-impl", "isNull", "contains-impl", "contains", "contentDeepEquals-impl", "(Landroid/os/Bundle;Landroid/os/Bundle;)Z", "contentDeepEquals", "contentDeepHashCode-impl", "contentDeepHashCode", "contentDeepToString-impl", "(Landroid/os/Bundle;)Ljava/lang/String;", "contentDeepToString", "", "toMap-impl", "(Landroid/os/Bundle;)Ljava/util/Map;", "toMap", "equals-impl", "(Landroid/os/Bundle;Ljava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "toString-impl", "toString", "source", "Landroid/os/Bundle;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
public final class SavedStateReader {
    private final Bundle source;

    private /* synthetic */ SavedStateReader(Bundle bundle) {
        this.source = bundle;
    }

    /* JADX INFO: renamed from: getBinder-impl, reason: not valid java name */
    public static final IBinder m7375getBinderimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        IBinder binder = bundle.getBinder(str);
        if (binder != null) {
            return binder;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBinderOrNull-impl, reason: not valid java name */
    public static final IBinder m7376getBinderOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: getBoolean-impl, reason: not valid java name */
    public static final boolean m7377getBooleanimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return z;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBooleanOrNull-impl, reason: not valid java name */
    public static final Boolean m7380getBooleanOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean z = bundle.getBoolean(str, false);
        if (z || !bundle.getBoolean(str, true)) {
            return Boolean.valueOf(z);
        }
        return null;
    }

    /* JADX INFO: renamed from: getChar-impl, reason: not valid java name */
    public static final char m7381getCharimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        char c = bundle.getChar(str, (char) 0);
        if (c != 0 || bundle.getChar(str, CharCompanionObject.MAX_VALUE) != 65535) {
            return c;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharOrNull-impl, reason: not valid java name */
    public static final Character m7384getCharOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        char c = bundle.getChar(str, (char) 0);
        if (c == 0 && bundle.getChar(str, CharCompanionObject.MAX_VALUE) == 65535) {
            return null;
        }
        return Character.valueOf(c);
    }

    /* JADX INFO: renamed from: getCharSequence-impl, reason: not valid java name */
    public static final CharSequence m7385getCharSequenceimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence charSequence = bundle.getCharSequence(str);
        if (charSequence != null) {
            return charSequence;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharSequenceOrNull-impl, reason: not valid java name */
    public static final CharSequence m7390getCharSequenceOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getCharSequence(str);
    }

    /* JADX INFO: renamed from: getDouble-impl, reason: not valid java name */
    public static final double m7391getDoubleimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d != Double.MIN_VALUE || bundle.getDouble(str, Double.MAX_VALUE) != Double.MAX_VALUE) {
            return d;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getDoubleOrNull-impl, reason: not valid java name */
    public static final Double m7394getDoubleOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double d = bundle.getDouble(str, Double.MIN_VALUE);
        if (d == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
            return null;
        }
        return Double.valueOf(d);
    }

    /* JADX INFO: renamed from: getFloat-impl, reason: not valid java name */
    public static final float m7395getFloatimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f != Float.MIN_VALUE || bundle.getFloat(str, Float.MAX_VALUE) != Float.MAX_VALUE) {
            return f;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getFloatOrNull-impl, reason: not valid java name */
    public static final Float m7398getFloatOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        float f = bundle.getFloat(str, Float.MIN_VALUE);
        if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
            return null;
        }
        return Float.valueOf(f);
    }

    /* JADX INFO: renamed from: getInt-impl, reason: not valid java name */
    public static final int m7399getIntimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getIntOrNull-impl, reason: not valid java name */
    public static final Integer m7404getIntOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && bundle.getInt(str, Integer.MAX_VALUE) == Integer.MAX_VALUE) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: getLong-impl, reason: not valid java name */
    public static final long m7409getLongimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j != Long.MIN_VALUE || bundle.getLong(str, Long.MAX_VALUE) != Long.MAX_VALUE) {
            return j;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getLongOrNull-impl, reason: not valid java name */
    public static final Long m7412getLongOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
            return null;
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7414getParcelableimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        T t = (T) BundleCompat.getParcelable(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
        if (t != null) {
            return t;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getParcelable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7413getParcelableimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m7414getParcelableimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T m7424getParcelableOrNullimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return (T) BundleCompat.getParcelable(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    /* JADX INFO: renamed from: getParcelableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T m7423getParcelableOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m7424getParcelableOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7406getJavaSerializableimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        T t = (T) BundleCompat.getSerializable(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
        if (t != null) {
            return t;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getJavaSerializable-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7405getJavaSerializableimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m7406getJavaSerializableimpl(bundle, str, Reflection.getOrCreateKotlinClass(Serializable.class));
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final <T extends Serializable> T m7408getJavaSerializableOrNullimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return (T) BundleCompat.getSerializable(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    /* JADX INFO: renamed from: getJavaSerializableOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Serializable> T m7407getJavaSerializableOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) m7408getJavaSerializableOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Serializable.class));
    }

    /* JADX INFO: renamed from: getSize-impl, reason: not valid java name */
    public static final Size m7431getSizeimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Size size = bundle.getSize(str);
        if (size != null) {
            return size;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSizeOrNull-impl, reason: not valid java name */
    public static final Size m7434getSizeOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getSize(str);
    }

    /* JADX INFO: renamed from: getSizeF-impl, reason: not valid java name */
    public static final SizeF m7432getSizeFimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SizeF sizeF = bundle.getSizeF(str);
        if (sizeF != null) {
            return sizeF;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSizeFOrNull-impl, reason: not valid java name */
    public static final SizeF m7433getSizeFOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getSizeF(str);
    }

    /* JADX INFO: renamed from: getString-impl, reason: not valid java name */
    public static final String m7439getStringimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringOrNull-impl, reason: not valid java name */
    public static final String m7444getStringOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getString(str);
    }

    /* JADX INFO: renamed from: getIntList-impl, reason: not valid java name */
    public static final List<Integer> m7402getIntListimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getIntListOrNull-impl, reason: not valid java name */
    public static final List<Integer> m7403getIntListOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getIntegerArrayList(str);
    }

    /* JADX INFO: renamed from: getCharSequenceList-impl, reason: not valid java name */
    public static final List<CharSequence> m7388getCharSequenceListimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharSequenceListOrNull-impl, reason: not valid java name */
    public static final List<CharSequence> m7389getCharSequenceListOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getCharSequenceArrayList(str);
    }

    /* JADX INFO: renamed from: getStringList-impl, reason: not valid java name */
    public static final List<String> m7442getStringListimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList != null) {
            return stringArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringListOrNull-impl, reason: not valid java name */
    public static final List<String> m7443getStringListOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getStringArrayList(str);
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7420getParcelableListimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        ArrayList parcelableArrayList = BundleCompat.getParcelableArrayList(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getParcelableList-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7419getParcelableListimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m7420getParcelableListimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> List<T> m7422getParcelableListOrNullimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return BundleCompat.getParcelableArrayList(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    /* JADX INFO: renamed from: getParcelableListOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> List<T> m7421getParcelableListOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m7422getParcelableListOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getBooleanArray-impl, reason: not valid java name */
    public static final boolean[] m7378getBooleanArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getBooleanArrayOrNull-impl, reason: not valid java name */
    public static final boolean[] m7379getBooleanArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getBooleanArray(str);
    }

    /* JADX INFO: renamed from: getCharArray-impl, reason: not valid java name */
    public static final char[] m7382getCharArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = bundle.getCharArray(str);
        if (charArray != null) {
            return charArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharArrayOrNull-impl, reason: not valid java name */
    public static final char[] m7383getCharArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getCharArray(str);
    }

    /* JADX INFO: renamed from: getCharSequenceArray-impl, reason: not valid java name */
    public static final CharSequence[] m7386getCharSequenceArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        CharSequence[] charSequenceArray = bundle.getCharSequenceArray(str);
        if (charSequenceArray != null) {
            return charSequenceArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getCharSequenceArrayOrNull-impl, reason: not valid java name */
    public static final CharSequence[] m7387getCharSequenceArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getCharSequenceArray(str);
    }

    /* JADX INFO: renamed from: getDoubleArray-impl, reason: not valid java name */
    public static final double[] m7392getDoubleArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double[] doubleArray = bundle.getDoubleArray(str);
        if (doubleArray != null) {
            return doubleArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getDoubleArrayOrNull-impl, reason: not valid java name */
    public static final double[] m7393getDoubleArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getDoubleArray(str);
    }

    /* JADX INFO: renamed from: getFloatArray-impl, reason: not valid java name */
    public static final float[] m7396getFloatArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getFloatArrayOrNull-impl, reason: not valid java name */
    public static final float[] m7397getFloatArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getFloatArray(str);
    }

    /* JADX INFO: renamed from: getIntArray-impl, reason: not valid java name */
    public static final int[] m7400getIntArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getIntArrayOrNull-impl, reason: not valid java name */
    public static final int[] m7401getIntArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getIntArray(str);
    }

    /* JADX INFO: renamed from: getLongArray-impl, reason: not valid java name */
    public static final long[] m7410getLongArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getLongArrayOrNull-impl, reason: not valid java name */
    public static final long[] m7411getLongArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getLongArray(str);
    }

    /* JADX INFO: renamed from: getStringArray-impl, reason: not valid java name */
    public static final String[] m7440getStringArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getStringArrayOrNull-impl, reason: not valid java name */
    public static final String[] m7441getStringArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getStringArray(str);
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7416getParcelableArrayimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        T[] tArr = (T[]) m7418getParcelableArrayOrNullimpl(bundle, str, kClass);
        if (tArr != null) {
            return tArr;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7415getParcelableArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m7416getParcelableArrayimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> T[] m7418getParcelableArrayOrNullimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        T[] tArr = (T[]) BundleCompat.getParcelableArray(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
        if (tArr instanceof Parcelable[]) {
            return tArr;
        }
        return null;
    }

    /* JADX INFO: renamed from: getParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> T[] m7417getParcelableArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T[]) m7418getParcelableArrayOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7436getSparseParcelableArrayimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        SparseArray<T> sparseArrayM7438getSparseParcelableArrayOrNullimpl = m7438getSparseParcelableArrayOrNullimpl(bundle, str, kClass);
        if (sparseArrayM7438getSparseParcelableArrayOrNullimpl != null) {
            return sparseArrayM7438getSparseParcelableArrayOrNullimpl;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSparseParcelableArray-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7435getSparseParcelableArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m7436getSparseParcelableArrayimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final <T extends Parcelable> SparseArray<T> m7438getSparseParcelableArrayOrNullimpl(Bundle bundle, String str, KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(kClass, "");
        return BundleCompat.getSparseParcelableArray(bundle, str, JvmClassMappingKt.getJavaClass((KClass) kClass));
    }

    /* JADX INFO: renamed from: getSparseParcelableArrayOrNull-impl, reason: not valid java name */
    public static final /* synthetic */ <T extends Parcelable> SparseArray<T> m7437getSparseParcelableArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return m7438getSparseParcelableArrayOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Parcelable.class));
    }

    /* JADX INFO: renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m7425getSavedStateimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: getSavedStateOrNull-impl, reason: not valid java name */
    public static final Bundle m7430getSavedStateOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.getBundle(str);
    }

    /* JADX INFO: renamed from: size-impl, reason: not valid java name */
    public static final int m7448sizeimpl(Bundle bundle) {
        return bundle.size();
    }

    /* JADX INFO: renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7446isEmptyimpl(Bundle bundle) {
        return bundle.isEmpty();
    }

    /* JADX INFO: renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m7447isNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return m7369containsimpl(bundle, str) && bundle.get(str) == null;
    }

    /* JADX INFO: renamed from: contains-impl, reason: not valid java name */
    public static final boolean m7369containsimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return bundle.containsKey(str);
    }

    /* JADX INFO: renamed from: contentDeepEquals-impl, reason: not valid java name */
    public static final boolean m7370contentDeepEqualsimpl(Bundle bundle, Bundle bundle2) {
        Intrinsics.checkNotNullParameter(bundle2, "");
        return Bundle.contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(bundle, bundle2);
    }

    /* JADX INFO: renamed from: contentDeepHashCode-impl, reason: not valid java name */
    public static final int m7371contentDeepHashCodeimpl(Bundle bundle) {
        return Bundle.contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt(bundle);
    }

    /* JADX INFO: renamed from: contentDeepToString-impl, reason: not valid java name */
    public static final String m7372contentDeepToStringimpl(Bundle bundle) {
        StringBuilder sb = new StringBuilder((RangesKt.coerceAtMost(bundle.size(), 429496729) * 5) + 2);
        Bundle.contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt(bundle, sb, new ArrayList());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: renamed from: toMap-impl, reason: not valid java name */
    public static final Map<String, Object> m7449toMapimpl(Bundle bundle) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            Intrinsics.checkNotNull(str);
            mapCreateMapBuilder.put(str, bundle.get(str));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    /* JADX INFO: renamed from: getSavedStateArray-impl, reason: not valid java name */
    public static final Bundle[] m7426getSavedStateArrayimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Bundle[]) m7416getParcelableArrayimpl(bundle, str, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateArrayOrNull-impl, reason: not valid java name */
    public static final Bundle[] m7427getSavedStateArrayOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Bundle[]) m7418getParcelableArrayOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final List<Bundle> m7428getSavedStateListimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return m7420getParcelableListimpl(bundle, str, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: getSavedStateListOrNull-impl, reason: not valid java name */
    public static final List<Bundle> m7429getSavedStateListOrNullimpl(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return m7422getParcelableListOrNullimpl(bundle, str, Reflection.getOrCreateKotlinClass(Bundle.class));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SavedStateReader m7367boximpl(Bundle bundle) {
        return new SavedStateReader(bundle);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static Bundle m7368constructorimpl(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return bundle;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m7373equalsimpl(Bundle bundle, Object obj) {
        return (obj instanceof SavedStateReader) && Intrinsics.areEqual(bundle, ((SavedStateReader) obj).getSource());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7374equalsimpl0(Bundle bundle, Bundle bundle2) {
        return Intrinsics.areEqual(bundle, bundle2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m7445hashCodeimpl(Bundle bundle) {
        return bundle.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m7450toStringimpl(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SavedStateReader(source=");
        sb.append(bundle);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return m7373equalsimpl(this.source, obj);
    }

    public final int hashCode() {
        return m7445hashCodeimpl(this.source);
    }

    public final String toString() {
        return m7450toStringimpl(this.source);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ Bundle getSource() {
        return this.source;
    }
}
