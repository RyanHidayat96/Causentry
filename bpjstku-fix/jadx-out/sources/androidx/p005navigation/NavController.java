package androidx.p005navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStoreOwner;
import androidx.p005navigation.p008internal.Log;
import androidx.p005navigation.p008internal.NavContext;
import androidx.p005navigation.p008internal.NavControllerImpl;
import androidx.p005navigation.p009serialization.RouteSerializerKt;
import androidx.p013savedstate.SavedStateReader;
import androidx.p013savedstate.SavedStateWriter;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import defpackage.CameraController2;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.lambdastop4androidxcameravideointernalencoderEncoderImpl;
import defpackage.stopMediaCodec;
import defpackage.updateMirroringFlagInOutputFileOptions;
import defpackage.updatePreviewViewTransform;
import defpackage.videoProfileHdrFormatsToDynamicRangeEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 ¸\u00012\u00020\u0001:\u0006¹\u0001º\u0001¸\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00060\bR\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0015J'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0017J)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0019J.\u0010\u0011\u001a\u00020\u0010\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b\u0011\u0010\u001bJ9\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u001a*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u001dJ3\u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u001eJ)\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0013H\u0007¢\u0006\u0004\b \u0010\"J\u001c\u0010 \u001a\u00020\u0010\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u0001H\u0087\b¢\u0006\u0004\b \u0010\u0012J'\u0010 \u001a\u00020\u0010\"\b\b\u0000\u0010\u001a*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\b \u0010#J!\u0010 \u001a\u00020\u0010\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b \u0010$J\u000f\u0010%\u001a\u00020\u0010H\u0017¢\u0006\u0004\b%\u0010\u0012J\u000f\u0010&\u001a\u00020\u0010H\u0002¢\u0006\u0004\b&\u0010\u0012J\u000f\u0010'\u001a\u00020\u0010H\u0002¢\u0006\u0004\b'\u0010\u0012J\u0017\u0010(\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b(\u0010)J'\u0010(\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0017¢\u0006\u0004\b(\u0010,J'\u0010(\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020-2\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0017¢\u0006\u0004\b(\u0010.J\u000f\u0010/\u001a\u00020\u0010H\u0000¢\u0006\u0004\b/\u0010\u0012J\u0019\u00101\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u000100H\u0017¢\u0006\u0004\b1\u00102J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u000203H\u0007¢\u0006\u0004\b1\u00104J5\u00101\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u0002052\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0018\u00010*j\u0004\u0018\u0001`+062\u0006\u0010\u0016\u001a\u00020\u0010H\u0003¢\u0006\u0004\b1\u00107J\u0019\u00108\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u000205H\u0002¢\u0006\u0004\b8\u00109J%\u0010:\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b:\u0010;J1\u0010<\u001a\u0004\u0018\u00010\u0007*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b<\u0010=J\u0019\u0010:\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0018H\u0007¢\u0006\u0004\b:\u0010>J\u0017\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\b?\u0010)J'\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0017¢\u0006\u0004\b?\u0010,J1\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+2\b\u0010\u0016\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\b?\u0010AJ;\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+2\b\u0010\u0016\u001a\u0004\u0018\u00010@2\b\u0010C\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b?\u0010DJ\u0017\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020EH\u0017¢\u0006\u0004\b?\u0010FJ!\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020E2\b\u0010\u0014\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\b?\u0010GJ+\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020E2\b\u0010\u0014\u001a\u0004\u0018\u00010@2\b\u0010\u0016\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b?\u0010HJ\u0017\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u000203H\u0017¢\u0006\u0004\b?\u0010IJ!\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u0002032\b\u0010\u0014\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\b?\u0010JJ+\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u0002032\b\u0010\u0014\u001a\u0004\u0018\u00010@2\b\u0010\u0016\u001a\u0004\u0018\u00010BH\u0017¢\u0006\u0004\b?\u0010KJ#\u0010L\u001a\u00020\f2\u0006\u0010\u0003\u001a\u0002032\n\u0010\u0014\u001a\u00060*j\u0002`+H\u0000¢\u0006\u0004\bL\u0010MJ;\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+2\b\u0010\u0016\u001a\u0004\u0018\u00010@2\b\u0010C\u001a\u0004\u0018\u00010BH\u0003¢\u0006\u0004\b?\u0010NJ\u0017\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020OH\u0017¢\u0006\u0004\b?\u0010PJ!\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020O2\b\u0010\u0014\u001a\u0004\u0018\u00010@H\u0017¢\u0006\u0004\b?\u0010QJ\u001f\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020O2\u0006\u0010\u0014\u001a\u00020BH\u0017¢\u0006\u0004\b?\u0010RJ0\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00182\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\f0S¢\u0006\u0002\bUH\u0007¢\u0006\u0004\b?\u0010VJ/\u0010?\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00182\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010BH\u0007¢\u0006\u0004\b?\u0010WJ:\u0010?\u001a\u00020\f\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\f0S¢\u0006\u0002\bUH\u0007¢\u0006\u0004\b?\u0010XJ9\u0010?\u001a\u00020\f\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010BH\u0007¢\u0006\u0004\b?\u0010YJ\u000f\u0010[\u001a\u00020ZH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010]\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0017¢\u0006\u0004\b]\u0010^J\u001f\u0010_\u001a\u00020\f2\u000e\u0010\u0003\u001a\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0017¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020aH\u0017¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020dH\u0017¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0010H\u0017¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\fH\u0002¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020kH\u0017¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020n2\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\bo\u0010pJ\u0017\u0010r\u001a\u00020q2\u0006\u0010\u0003\u001a\u00020\u0013H\u0017¢\u0006\u0004\br\u0010sJ\u0017\u0010r\u001a\u00020q2\u0006\u0010\u0003\u001a\u00020\u0018H\u0007¢\u0006\u0004\br\u0010tJ\u001c\u0010r\u001a\u00020q\"\n\b\u0000\u0010\u001a\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\br\u0010uJ'\u0010r\u001a\u00020q\"\b\b\u0000\u0010\u001a*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0007¢\u0006\u0004\br\u0010vJ!\u0010r\u001a\u00020q\"\b\b\u0000\u0010\u001a*\u00020\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\br\u0010wR\u001a\u0010x\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u0080\u0001\u001a\u00020\u007f8\u0001X\u0081\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R(\u0010\u008d\u0001\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020-8W@WX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b(\u0010\u008c\u0001R'\u0010\u008e\u0001\u001a\u00020\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0016\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010\u0012\"\u0005\b\u0091\u0001\u0010hR\"\u0010\u0096\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020q0\u0093\u00010\u0092\u00018G¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\"\u0010\u0098\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020q0\u0093\u00010\u0092\u00018G¢\u0006\b\u001a\u0006\b\u0097\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u009b\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008f\u0001R+\u0010¤\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u0003\u001a\u00030\u009f\u00018W@WX\u0096\u000e¢\u0006\u0010\u001a\u0006\b \u0001\u0010¡\u0001\"\u0006\b¢\u0001\u0010£\u0001R\u0017\u0010§\u0001\u001a\u00020\u00138CX\u0082\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001R!\u0010¬\u0001\u001a\u00030\u0087\u00018WX\u0097\u0084\u0002¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u0019\u0010¯\u0001\u001a\u0004\u0018\u00010\u00078WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010±\u0001\u001a\u0004\u0018\u00010q8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010uR\u001b\u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020q0²\u00018G¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001R\u0018\u0010·\u0001\u001a\u0004\u0018\u00010q8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010u"}, d2 = {"Landroidx/navigation/NavController;", "", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavController$NavControllerNavigatorState;", "createNavControllerNavigatorState$navigation_runtime_release", "(Landroidx/navigation/Navigator;)Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "addOnDestinationChangedListener", "(Landroidx/navigation/NavController$OnDestinationChangedListener;)V", "removeOnDestinationChangedListener", "", "popBackStack", "()Z", "", "p1", "(IZ)Z", "p2", "(IZZ)Z", "", "(Ljava/lang/String;ZZ)Z", ExifInterface.GPS_DIRECTION_TRUE, "(ZZ)Z", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;ZZ)Z", "(Ljava/lang/Object;ZZ)Z", "popBackStackInternal", "clearBackStack", "(Ljava/lang/String;)Z", "(I)Z", "(Lkotlin/reflect/KClass;)Z", "(Ljava/lang/Object;)Z", "navigateUp", "tryRelaunchUpToExplicitStack", "tryRelaunchUpToGeneratedStack", "setGraph", "(I)V", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "(ILandroid/os/Bundle;)V", "Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V", "checkDeepLinkHandled$navigation_runtime_release", "Landroid/content/Intent;", "handleDeepLink", "(Landroid/content/Intent;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "", "", "([I[Landroid/os/Bundle;Z)Z", "findInvalidDestinationDisplayNameInDeepLink", "([I)Ljava/lang/String;", "findDestination", "(ILandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "findDestinationComprehensive", "(Landroidx/navigation/NavDestination;IZLandroidx/navigation/NavDestination;)Landroidx/navigation/NavDestination;", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "navigate", "Landroidx/navigation/NavOptions;", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;)V", "Landroidx/navigation/Navigator$Extras;", "p3", "(ILandroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroid/net/Uri;", "(Landroid/net/Uri;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;)V", "(Landroid/net/Uri;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Landroidx/navigation/NavDeepLinkRequest;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDeepLinkRequest;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "writeIntent$navigation_runtime_release", "(Landroidx/navigation/NavDeepLinkRequest;Landroid/os/Bundle;)V", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDirections;", "(Landroidx/navigation/NavDirections;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/NavOptions;)V", "(Landroidx/navigation/NavDirections;Landroidx/navigation/Navigator$Extras;)V", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "Landroidx/navigation/NavDeepLinkBuilder;", "createDeepLink", "()Landroidx/navigation/NavDeepLinkBuilder;", "saveState", "()Landroid/os/Bundle;", "restoreState", "(Landroid/os/Bundle;)V", "Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Landroidx/activity/OnBackPressedDispatcher;", "setOnBackPressedDispatcher", "(Landroidx/activity/OnBackPressedDispatcher;)V", "enableOnBackPressed", "(Z)V", "updateOnBackPressedCallbackEnabled", "()V", "Landroidx/lifecycle/ViewModelStore;", "setViewModelStore", "(Landroidx/lifecycle/ViewModelStore;)V", "Landroidx/lifecycle/ViewModelStoreOwner;", "getViewModelStoreOwner", "(I)Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/navigation/NavBackStackEntry;", "getBackStackEntry", "(I)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/String;)Landroidx/navigation/NavBackStackEntry;", "()Landroidx/navigation/NavBackStackEntry;", "(Lkotlin/reflect/KClass;)Landroidx/navigation/NavBackStackEntry;", "(Ljava/lang/Object;)Landroidx/navigation/NavBackStackEntry;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroidx/navigation/internal/NavControllerImpl;", "impl", "Landroidx/navigation/internal/NavControllerImpl;", "Landroidx/navigation/internal/NavContext;", "navContext", "Landroidx/navigation/internal/NavContext;", "getNavContext$navigation_runtime_release", "()Landroidx/navigation/internal/NavContext;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroidx/navigation/NavInflater;", "inflater", "Landroidx/navigation/NavInflater;", "getGraph", "()Landroidx/navigation/NavGraph;", "(Landroidx/navigation/NavGraph;)V", "graph", "deepLinkHandled", "Z", "getDeepLinkHandled$navigation_runtime_release", "setDeepLinkHandled$navigation_runtime_release", "LstopMediaCodec;", "", "getCurrentBackStack", "()LstopMediaCodec;", "currentBackStack", "getVisibleEntries", "visibleEntries", "onBackPressedDispatcher", "Landroidx/activity/OnBackPressedDispatcher;", "Landroidx/activity/OnBackPressedCallback;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "enableOnBackPressedCallback", "Landroidx/navigation/NavigatorProvider;", "getNavigatorProvider", "()Landroidx/navigation/NavigatorProvider;", "setNavigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigatorProvider", "getDestinationCountOnBackStack", "()I", "destinationCountOnBackStack", "navInflater$delegate", "Lkotlin/Lazy;", "getNavInflater", "()Landroidx/navigation/NavInflater;", "navInflater", "getCurrentDestination", "()Landroidx/navigation/NavDestination;", "currentDestination", "getCurrentBackStackEntry", "currentBackStackEntry", "LclampVideoBitrateIfNotSupported;", "getCurrentBackStackEntryFlow", "()LclampVideoBitrateIfNotSupported;", "currentBackStackEntryFlow", "getPreviousBackStackEntry", "previousBackStackEntry", "Companion", "OnDestinationChangedListener", "NavControllerNavigatorState"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class NavController {
    public static final String KEY_DEEP_LINK_ARGS = "android-support-nav:controller:deepLinkArgs";
    public static final String KEY_DEEP_LINK_EXTRAS = "android-support-nav:controller:deepLinkExtras";
    public static final String KEY_DEEP_LINK_HANDLED = "android-support-nav:controller:deepLinkHandled";
    public static final String KEY_DEEP_LINK_IDS = "android-support-nav:controller:deepLinkIds";
    public static final String KEY_DEEP_LINK_INTENT = "android-support-nav:controller:deepLinkIntent";
    private Activity activity;
    private final Context context;
    private boolean deepLinkHandled;
    private boolean enableOnBackPressedCallback;
    private final NavControllerImpl impl;
    private NavInflater inflater;
    private final NavContext navContext;

    /* JADX INFO: renamed from: navInflater$delegate, reason: from kotlin metadata */
    private final Lazy navInflater;
    private final OnBackPressedCallback onBackPressedCallback;
    private OnBackPressedDispatcher onBackPressedDispatcher;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean deepLinkSaveState = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/navigation/NavController$OnDestinationChangedListener;", "", "Landroidx/navigation/NavController;", "p0", "Landroidx/navigation/NavDestination;", "p1", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p2", "", "onDestinationChanged", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDestination;Landroid/os/Bundle;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController p0, NavDestination p1, Bundle p2);
    }

    public NavController(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.context = context;
        this.impl = new NavControllerImpl(this, new Function0() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavController.impl$lambda$0(this.f$0);
            }
        });
        this.navContext = new NavContext(context);
        for (Object obj : SequencesKt.generateSequence(context, (Function1<? super Context, ? extends Context>) new Function1() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return NavController.activity$lambda$1((Context) obj2);
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.activity = (Activity) obj;
                this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
                    {
                        super(false);
                    }

                    @Override // androidx.view.OnBackPressedCallback
                    public final void handleOnBackPressed() {
                        this.this$0.popBackStack();
                    }
                };
                this.enableOnBackPressedCallback = true;
                this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
                this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
                this.navInflater = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NavController.navInflater_delegate$lambda$10(this.f$0);
                    }
                });
            }
        }
        obj = null;
        this.activity = (Activity) obj;
        this.onBackPressedCallback = new OnBackPressedCallback() { // from class: androidx.navigation.NavController$onBackPressedCallback$1
            {
                super(false);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                this.this$0.popBackStack();
            }
        };
        this.enableOnBackPressedCallback = true;
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new NavGraphNavigator(this.impl.get_navigatorProvider$navigation_runtime_release()));
        this.impl.get_navigatorProvider$navigation_runtime_release().addNavigator(new ActivityNavigator(this.context));
        this.navInflater = LazyKt.lazy(new Function0() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NavController.navInflater_delegate$lambda$10(this.f$0);
            }
        });
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit impl$lambda$0(NavController navController) {
        navController.updateOnBackPressedCallbackEnabled();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: getNavContext$navigation_runtime_release, reason: from getter */
    public final NavContext getNavContext() {
        return this.navContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context activity$lambda$1(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (context instanceof ContextWrapper) {
            return ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public NavGraph getGraph() {
        return this.impl.getGraph$navigation_runtime_release();
    }

    public void setGraph(NavGraph navGraph) {
        Intrinsics.checkNotNullParameter(navGraph, "");
        this.impl.setGraph$navigation_runtime_release(navGraph);
    }

    /* JADX INFO: renamed from: getDeepLinkHandled$navigation_runtime_release, reason: from getter */
    public final boolean getDeepLinkHandled() {
        return this.deepLinkHandled;
    }

    public final void setDeepLinkHandled$navigation_runtime_release(boolean z) {
        this.deepLinkHandled = z;
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getCurrentBackStack() {
        return this.impl.getCurrentBackStack$navigation_runtime_release();
    }

    public final stopMediaCodec<List<NavBackStackEntry>> getVisibleEntries() {
        return this.impl.getVisibleEntries$navigation_runtime_release();
    }

    public NavigatorProvider getNavigatorProvider() {
        return this.impl.get_navigatorProvider();
    }

    public void setNavigatorProvider(NavigatorProvider navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "");
        this.impl.setNavigatorProvider$navigation_runtime_release(navigatorProvider);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0090\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/navigation/NavController$NavControllerNavigatorState;", "Landroidx/navigation/NavigatorState;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "p0", "<init>", "(Landroidx/navigation/NavController;Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavBackStackEntry;", "", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "addInternal", "Landroid/os/Bundle;", "Landroidx/savedstate/b;", "p1", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "markTransitionComplete", "prepareForTransition", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public class NavControllerNavigatorState extends NavigatorState {
        private final Navigator<? extends NavDestination> navigator;
        final /* synthetic */ NavController this$0;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            Intrinsics.checkNotNullParameter(navigator, "");
            this.this$0 = navController;
            this.navigator = navigator;
        }

        public final Navigator<? extends NavDestination> getNavigator() {
            return this.navigator;
        }

        @Override // androidx.p005navigation.NavigatorState
        public void push(NavBackStackEntry p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.this$0.impl.push$navigation_runtime_release(this, p0);
        }

        public final void addInternal(NavBackStackEntry p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            super.push(p0);
        }

        @Override // androidx.p005navigation.NavigatorState
        public NavBackStackEntry createBackStackEntry(NavDestination p0, Bundle p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            return this.this$0.impl.createBackStackEntry$navigation_runtime_release(p0, p1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit pop$lambda$0(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry, boolean z) {
            super.pop(navBackStackEntry, z);
            return Unit.INSTANCE;
        }

        @Override // androidx.p005navigation.NavigatorState
        public void pop(final NavBackStackEntry p0, final boolean p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.this$0.impl.pop$navigation_runtime_release(this, p0, p1, new Function0() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.pop$lambda$0(this.f$0, p0, p1);
                }
            });
        }

        @Override // androidx.p005navigation.NavigatorState
        public void popWithTransition(NavBackStackEntry p0, boolean p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            super.popWithTransition(p0, p1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit markTransitionComplete$lambda$1(NavControllerNavigatorState navControllerNavigatorState, NavBackStackEntry navBackStackEntry) {
            super.markTransitionComplete(navBackStackEntry);
            return Unit.INSTANCE;
        }

        @Override // androidx.p005navigation.NavigatorState
        public void markTransitionComplete(final NavBackStackEntry p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.this$0.impl.markTransitionComplete$navigation_runtime_release(this, p0, new Function0() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1(this.f$0, p0);
                }
            });
        }

        @Override // androidx.p005navigation.NavigatorState
        public void prepareForTransition(NavBackStackEntry p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            super.prepareForTransition(p0);
            this.this$0.impl.prepareForTransition$navigation_runtime_release(p0);
        }
    }

    public final NavControllerNavigatorState createNavControllerNavigatorState$navigation_runtime_release(Navigator<? extends NavDestination> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return new NavControllerNavigatorState(this, p0);
    }

    public void addOnDestinationChangedListener(OnDestinationChangedListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.addOnDestinationChangedListener$navigation_runtime_release(p0);
    }

    public void removeOnDestinationChangedListener(OnDestinationChangedListener p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.removeOnDestinationChangedListener$navigation_runtime_release(p0);
    }

    public boolean popBackStack() {
        return this.impl.popBackStack$navigation_runtime_release();
    }

    public boolean popBackStack(int p0, boolean p1) {
        return this.impl.popBackStack$navigation_runtime_release(p0, p1);
    }

    public boolean popBackStack(int p0, boolean p1, boolean p2) {
        return this.impl.popBackStack$navigation_runtime_release(p0, p1, p2);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return navController.popBackStack(str, z, z2);
    }

    public final boolean popBackStack(String p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.popBackStack$navigation_runtime_release(p0, p1, p2);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return navController.popBackStack(Reflection.getOrCreateKotlinClass(Object.class), z, z2);
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean p0, boolean p1) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class), p0, p1);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, KClass kClass, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return navController.popBackStack(kClass, z, z2);
    }

    public final <T> boolean popBackStack(KClass<T> p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.popBackStack$navigation_runtime_release((KClass) p0, p1, p2);
    }

    public static /* synthetic */ boolean popBackStack$default(NavController navController, Object obj, boolean z, boolean z2, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return navController.popBackStack(obj, z, z2);
    }

    public final <T> boolean popBackStack(T p0, boolean p1, boolean p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.popBackStack$navigation_runtime_release(p0, p1, p2);
    }

    static /* synthetic */ boolean popBackStackInternal$default(NavController navController, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return navController.popBackStackInternal(i, z, z2);
    }

    private final boolean popBackStackInternal(int p0, boolean p1, boolean p2) {
        return this.impl.popBackStackInternal$navigation_runtime_release(p0, p1, p2);
    }

    public final boolean clearBackStack(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.clearBackStack$navigation_runtime_release(p0);
    }

    public final boolean clearBackStack(int p0) {
        return this.impl.clearBackStack$navigation_runtime_release(p0);
    }

    public final /* synthetic */ <T> boolean clearBackStack() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return clearBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> boolean clearBackStack(KClass<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.clearBackStack$navigation_runtime_release((KClass) p0);
    }

    public final <T> boolean clearBackStack(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.clearBackStack$navigation_runtime_release(p0);
    }

    public boolean navigateUp() {
        Intent intent;
        if (getDestinationCountOnBackStack() == 1) {
            Activity activity = this.activity;
            Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
            if ((extras != null ? extras.getIntArray(KEY_DEEP_LINK_IDS) : null) != null) {
                return tryRelaunchUpToExplicitStack();
            }
            return tryRelaunchUpToGeneratedStack();
        }
        return popBackStack();
    }

    private final boolean tryRelaunchUpToExplicitStack() {
        Pair[] pairArr;
        int i = 0;
        if (!this.deepLinkHandled) {
            return false;
        }
        Activity activity = this.activity;
        Intrinsics.checkNotNull(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        int[] intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
        Intrinsics.checkNotNull(intArray);
        List<Integer> mutableList = ArraysKt.toMutableList(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS);
        if (mutableList.size() < 2) {
            return false;
        }
        int iIntValue = ((Number) CollectionsKt.removeLast(mutableList)).intValue();
        if (parcelableArrayList != null) {
        }
        NavDestination navDestinationFindDestinationComprehensive$default = findDestinationComprehensive$default(this, getGraph(), iIntValue, false, null, 4, null);
        if (navDestinationFindDestinationComprehensive$default instanceof NavGraph) {
            iIntValue = NavGraph.INSTANCE.findStartDestination((NavGraph) navDestinationFindDestinationComprehensive$default).getId();
        }
        NavDestination currentDestination = getCurrentDestination();
        if (currentDestination == null || iIntValue != currentDestination.getId()) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderCreateDeepLink = createDeepLink();
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        Intrinsics.checkNotNull(intent);
        SavedStateWriter.m7478putParcelableimpl(bundleM7454constructorimpl, KEY_DEEP_LINK_INTENT, intent);
        Bundle bundle = extras.getBundle(KEY_DEEP_LINK_EXTRAS);
        if (bundle != null) {
            SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundle);
        }
        navDeepLinkBuilderCreateDeepLink.setArguments(bundleBundleOf);
        for (Object obj : mutableList) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            navDeepLinkBuilderCreateDeepLink.addDestination(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i) : null);
            i++;
        }
        navDeepLinkBuilderCreateDeepLink.createTaskStackBuilder().startActivities();
        Activity activity2 = this.activity;
        if (activity2 == null) {
            return true;
        }
        activity2.finish();
        return true;
    }

    private final boolean tryRelaunchUpToGeneratedStack() {
        Pair[] pairArr;
        Bundle bundleAddInDefaultArgs;
        NavDestination currentDestination = getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        int id2 = currentDestination.getId();
        for (NavGraph parent = currentDestination.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getStartDestinationId() == id2) {
                id2 = parent.getId();
            } else {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
                Activity activity = this.activity;
                if (activity != null) {
                    Intrinsics.checkNotNull(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.activity;
                        Intrinsics.checkNotNull(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.activity;
                            Intrinsics.checkNotNull(activity3);
                            Intent intent = activity3.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent, "");
                            SavedStateWriter.m7478putParcelableimpl(bundleM7454constructorimpl, KEY_DEEP_LINK_INTENT, intent);
                            NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
                            Activity activity4 = this.activity;
                            Intrinsics.checkNotNull(activity4);
                            Intent intent2 = activity4.getIntent();
                            Intrinsics.checkNotNullExpressionValue(intent2, "");
                            NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(intent2), true, true, topGraph$navigation_runtime_release);
                            if ((deepLinkMatchMatchDeepLinkComprehensive != null ? deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs() : null) != null && (bundleAddInDefaultArgs = deepLinkMatchMatchDeepLinkComprehensive.getDestination().addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs())) != null) {
                                SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundleAddInDefaultArgs);
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.setDestination$default(new NavDeepLinkBuilder(this), parent.getId(), (Bundle) null, 2, (Object) null).setArguments(bundleBundleOf).createTaskStackBuilder().startActivities();
                Activity activity5 = this.activity;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
        }
        return false;
    }

    private final int getDestinationCountOnBackStack() {
        ArrayDeque<NavBackStackEntry> backQueue$navigation_runtime_release = this.impl.getBackQueue$navigation_runtime_release();
        int i = 0;
        if ((backQueue$navigation_runtime_release instanceof Collection) && backQueue$navigation_runtime_release.isEmpty()) {
            return 0;
        }
        Iterator<NavBackStackEntry> it = backQueue$navigation_runtime_release.iterator();
        while (it.hasNext()) {
            if (!(it.next().getDestination() instanceof NavGraph) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public NavInflater getNavInflater() {
        return (NavInflater) this.navInflater.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavInflater navInflater_delegate$lambda$10(NavController navController) {
        NavInflater navInflater = navController.inflater;
        return navInflater == null ? new NavInflater(navController.context, navController.impl.get_navigatorProvider$navigation_runtime_release()) : navInflater;
    }

    public void setGraph(int p0) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(p0), null);
    }

    public void setGraph(int p0, Bundle p1) {
        this.impl.setGraph$navigation_runtime_release(getNavInflater().inflate(p0), p1);
    }

    public void setGraph(NavGraph p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setGraph$navigation_runtime_release(p0, p1);
    }

    public final boolean checkDeepLinkHandled$navigation_runtime_release() {
        Activity activity;
        if (this.deepLinkHandled || (activity = this.activity) == null) {
            return false;
        }
        Intrinsics.checkNotNull(activity);
        return handleDeepLink(activity.getIntent());
    }

    public boolean handleDeepLink(Intent p0) {
        int[] intArray;
        Pair[] pairArr;
        NavGraph topGraph$navigation_runtime_release;
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive;
        Pair[] pairArr2;
        Bundle bundle;
        if (p0 == null) {
            return false;
        }
        Bundle extras = p0.getExtras();
        ArrayList arrayList = null;
        if (extras != null) {
            try {
                intArray = extras.getIntArray(KEY_DEEP_LINK_IDS);
            } catch (Exception e2) {
                Objects.toString(p0);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(KEY_DEEP_LINK_ARGS) : null;
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList2.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        Bundle bundle2 = extras != null ? extras.getBundle(KEY_DEEP_LINK_EXTRAS) : null;
        if (bundle2 != null) {
            SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), bundle2);
        }
        if ((intArray == null || intArray.length == 0) && (deepLinkMatchMatchDeepLinkComprehensive = (topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release()).matchDeepLinkComprehensive(NavControllerKt.NavDeepLinkRequest(p0), true, true, topGraph$navigation_runtime_release)) != null) {
            NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
            int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
            Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
            if (bundleAddInDefaultArgs != null) {
                SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), bundleAddInDefaultArgs);
            }
            intArray = iArrBuildDeepLinkIds$default;
        } else {
            arrayList = parcelableArrayList;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String strFindInvalidDestinationDisplayNameInDeepLink = findInvalidDestinationDisplayNameInDeepLink(intArray);
        if (strFindInvalidDestinationDisplayNameInDeepLink != null) {
            Log.Companion companion = Log.INSTANCE;
            StringBuilder sb = new StringBuilder("Could not find destination ");
            sb.append(strFindInvalidDestinationDisplayNameInDeepLink);
            sb.append(" in the navigation graph, ignoring the deep link from ");
            sb.append(p0);
            companion.i(NavControllerImpl.TAG, sb.toString());
            return false;
        }
        SavedStateWriter.m7478putParcelableimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), KEY_DEEP_LINK_INTENT, p0);
        int length = intArray.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList3.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList3.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf2);
            SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundleBundleOf);
            if (arrayList != null && (bundle = (Bundle) arrayList.get(i)) != null) {
                SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundle);
            }
            bundleArr[i] = bundleBundleOf2;
        }
        int flags = p0.getFlags();
        int i2 = 268435456 & flags;
        if (i2 != 0 && (flags & 32768) == 0) {
            p0.addFlags(32768);
            TaskStackBuilder taskStackBuilderAddNextIntentWithParentStack = TaskStackBuilder.create(this.context).addNextIntentWithParentStack(p0);
            Intrinsics.checkNotNullExpressionValue(taskStackBuilderAddNextIntentWithParentStack, "");
            taskStackBuilderAddNextIntentWithParentStack.startActivities();
            Activity activity = this.activity;
            if (activity != null) {
                activity.finish();
                activity.overridePendingTransition(0, 0);
            }
            return true;
        }
        return handleDeepLink(intArray, bundleArr, i2 != 0);
    }

    public final boolean handleDeepLink(NavDeepLinkRequest p0) {
        Pair[] pairArr;
        Pair[] pairArr2;
        Intrinsics.checkNotNullParameter(p0, "");
        NavGraph topGraph$navigation_runtime_release = this.impl.getTopGraph$navigation_runtime_release();
        NavDestination.DeepLinkMatch deepLinkMatchMatchDeepLinkComprehensive = topGraph$navigation_runtime_release.matchDeepLinkComprehensive(p0, true, true, topGraph$navigation_runtime_release);
        if (deepLinkMatchMatchDeepLinkComprehensive == null) {
            return false;
        }
        NavDestination destination = deepLinkMatchMatchDeepLinkComprehensive.getDestination();
        int[] iArrBuildDeepLinkIds$default = NavDestination.buildDeepLinkIds$default(destination, null, 1, null);
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle bundleM7454constructorimpl = SavedStateWriter.m7454constructorimpl(bundleBundleOf);
        Bundle bundleAddInDefaultArgs = destination.addInDefaultArgs(deepLinkMatchMatchDeepLinkComprehensive.getMatchingArgs());
        if (bundleAddInDefaultArgs != null) {
            SavedStateWriter.m7458putAllimpl(bundleM7454constructorimpl, bundleAddInDefaultArgs);
        }
        int length = iArrBuildDeepLinkIds$default.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            Map mapEmptyMap2 = MapsKt.emptyMap();
            if (mapEmptyMap2.isEmpty()) {
                pairArr2 = new Pair[0];
            } else {
                ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                for (Map.Entry entry2 : mapEmptyMap2.entrySet()) {
                    arrayList2.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                }
                pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
            }
            Bundle bundleBundleOf2 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
            SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf2), bundleBundleOf);
            bundleArr[i] = bundleBundleOf2;
        }
        return handleDeepLink(iArrBuildDeepLinkIds$default, bundleArr, true);
    }

    private final boolean handleDeepLink(int[] p0, Bundle[] p1, boolean p2) {
        NavGraph navGraphFindNode;
        NavGraph navGraph;
        if (p2) {
            if (!this.impl.getBackQueue$navigation_runtime_release().isEmpty()) {
                NavGraph navGraph2 = this.impl.get_graph();
                Intrinsics.checkNotNull(navGraph2);
                popBackStackInternal$default(this, navGraph2.getId(), true, false, 4, null);
            }
            for (int i = 0; i < p0.length; i++) {
                int i2 = p0[i];
                Bundle bundle = p1[i];
                final NavDestination navDestinationFindDestination$default = findDestination$default(this, i2, null, 2, null);
                if (navDestinationFindDestination$default == null) {
                    String displayName = NavDestination.INSTANCE.getDisplayName(this.navContext, i2);
                    StringBuilder sb = new StringBuilder("Deep Linking failed: destination ");
                    sb.append(displayName);
                    sb.append(" cannot be found from the current destination ");
                    sb.append(getCurrentDestination());
                    throw new IllegalStateException(sb.toString());
                }
                navigate(navDestinationFindDestination$default, bundle, NavOptionsBuilderKt.navOptions(new Function1() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavController.handleDeepLink$lambda$21(navDestinationFindDestination$default, this, (NavOptionsBuilder) obj);
                    }
                }), (Navigator.Extras) null);
            }
            this.deepLinkHandled = true;
            return true;
        }
        NavGraph navGraph3 = this.impl.get_graph();
        int length = p0.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = p0[i3];
            Bundle bundle2 = p1[i3];
            if (i3 == 0) {
                navGraphFindNode = this.impl.get_graph();
            } else {
                Intrinsics.checkNotNull(navGraph3);
                navGraphFindNode = navGraph3.findNode(i4);
            }
            if (navGraphFindNode == null) {
                String displayName2 = NavDestination.INSTANCE.getDisplayName(this.navContext, i4);
                StringBuilder sb2 = new StringBuilder("Deep Linking failed: destination ");
                sb2.append(displayName2);
                sb2.append(" cannot be found in graph ");
                sb2.append(navGraph3);
                throw new IllegalStateException(sb2.toString());
            }
            if (i3 != p0.length - 1) {
                if (navGraphFindNode instanceof NavGraph) {
                    while (true) {
                        navGraph = (NavGraph) navGraphFindNode;
                        Intrinsics.checkNotNull(navGraph);
                        if (!(navGraph.findNode(navGraph.getStartDestinationId()) instanceof NavGraph)) {
                            break;
                        }
                        navGraphFindNode = navGraph.findNode(navGraph.getStartDestinationId());
                    }
                    navGraph3 = navGraph;
                }
            } else {
                NavOptions.Builder builder = new NavOptions.Builder();
                NavGraph navGraph4 = this.impl.get_graph();
                Intrinsics.checkNotNull(navGraph4);
                navigate(navGraphFindNode, bundle2, NavOptions.Builder.setPopUpTo$default(builder, navGraph4.getId(), true, false, 4, (Object) null).setEnterAnim(0).setExitAnim(0).build(), (Navigator.Extras) null);
            }
        }
        this.deepLinkHandled = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21(NavDestination navDestination, NavController navController, NavOptionsBuilder navOptionsBuilder) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "");
        navOptionsBuilder.anim(new Function1() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NavController.handleDeepLink$lambda$21$lambda$18((AnimBuilder) obj);
            }
        });
        if (navDestination instanceof NavGraph) {
            for (NavDestination navDestination2 : NavDestination.INSTANCE.getHierarchy(navDestination)) {
                NavDestination currentDestination = navController.getCurrentDestination();
                if (Intrinsics.areEqual(navDestination2, currentDestination != null ? currentDestination.getParent() : null)) {
                }
            }
            if (deepLinkSaveState) {
                navOptionsBuilder.popUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), new Function1() { // from class: androidx.navigation.NavController$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NavController.handleDeepLink$lambda$21$lambda$20((PopUpToBuilder) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$18(AnimBuilder animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "");
        animBuilder.setEnter(0);
        animBuilder.setExit(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleDeepLink$lambda$21$lambda$20(PopUpToBuilder popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "");
        popUpToBuilder.setSaveState(true);
        return Unit.INSTANCE;
    }

    private final String findInvalidDestinationDisplayNameInDeepLink(int[] p0) {
        return this.impl.findInvalidDestinationDisplayNameInDeepLink$navigation_runtime_release(p0);
    }

    public NavDestination getCurrentDestination() {
        return this.impl.getCurrentDestination$navigation_runtime_release();
    }

    public static /* synthetic */ NavDestination findDestination$default(NavController navController, int i, NavDestination navDestination, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i2 & 2) != 0) {
            navDestination = null;
        }
        return navController.findDestination(i, navDestination);
    }

    public final NavDestination findDestination(int p0, NavDestination p1) {
        return this.impl.findDestination$navigation_runtime_release(p0, p1);
    }

    public static /* synthetic */ NavDestination findDestinationComprehensive$default(NavController navController, NavDestination navDestination, int i, boolean z, NavDestination navDestination2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i2 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.findDestinationComprehensive(navDestination, i, z, navDestination2);
    }

    public final NavDestination findDestinationComprehensive(NavDestination navDestination, int i, boolean z, NavDestination navDestination2) {
        Intrinsics.checkNotNullParameter(navDestination, "");
        return this.impl.findDestinationComprehensive$navigation_runtime_release(navDestination, i, z, navDestination2);
    }

    public final NavDestination findDestination(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.findDestination$navigation_runtime_release(p0);
    }

    public void navigate(int p0) {
        navigate(p0, (Bundle) null);
    }

    public void navigate(int p0, Bundle p1) {
        navigate(p0, p1, (NavOptions) null);
    }

    public void navigate(int p0, Bundle p1, NavOptions p2) {
        navigate(p0, p1, p2, (Navigator.Extras) null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1 A[LOOP:0: B:31:0x00cb->B:33:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0199  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fa  */
    public void navigate(int p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        NavOptions navOptions;
        int destinationId;
        Bundle bundleBundleOf;
        NavDestination navDestinationFindDestination$default;
        String displayName;
        Map mapEmptyMap;
        ArrayList arrayList;
        Pair[] pairArr;
        Pair[] pairArr2;
        NavGraph destination = this.impl.getBackQueue$navigation_runtime_release().isEmpty() ? this.impl.get_graph() : this.impl.getBackQueue$navigation_runtime_release().last().getDestination();
        if (destination == null) {
            StringBuilder sb = new StringBuilder("No current destination found. Ensure a navigation graph has been set for NavController ");
            sb.append(this);
            sb.append('.');
            throw new IllegalStateException(sb.toString());
        }
        NavAction action = destination.getAction(p0);
        if (action != null) {
            navOptions = p2 == null ? action.getNavOptions() : p2;
            destinationId = action.getDestinationId();
            Bundle defaultArguments = action.getDefaultArguments();
            if (defaultArguments != null) {
                Map mapEmptyMap2 = MapsKt.emptyMap();
                if (mapEmptyMap2.isEmpty()) {
                    pairArr2 = new Pair[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(mapEmptyMap2.size());
                    for (Map.Entry entry : mapEmptyMap2.entrySet()) {
                        arrayList2.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr2 = (Pair[]) arrayList2.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
                SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), defaultArguments);
            }
            if (p1 != null) {
                if (bundleBundleOf == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                    if (mapEmptyMap.isEmpty()) {
                        pairArr = new Pair[0];
                    } else {
                        arrayList = new ArrayList(mapEmptyMap.size());
                        for (Map.Entry entry2 : mapEmptyMap.entrySet()) {
                            arrayList.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                        }
                        pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                    }
                    bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                    SavedStateWriter.m7454constructorimpl(bundleBundleOf);
                }
                SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), p1);
            }
            if (destinationId == 0 || navOptions == null || (navOptions.getPopUpToId() == -1 && navOptions.getPopUpToRoute() == null && navOptions.getPopUpToRouteClass() == null)) {
                if (destinationId != 0) {
                    throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
                }
                navDestinationFindDestination$default = findDestination$default(this, destinationId, null, 2, null);
                if (navDestinationFindDestination$default == null) {
                    displayName = NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId);
                    if (action == null) {
                        StringBuilder sb2 = new StringBuilder("Navigation destination ");
                        sb2.append(displayName);
                        sb2.append(" referenced from action ");
                        sb2.append(NavDestination.INSTANCE.getDisplayName(this.navContext, p0));
                        sb2.append(" cannot be found from the current destination ");
                        sb2.append(destination);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                    StringBuilder sb3 = new StringBuilder("Navigation action/destination ");
                    sb3.append(displayName);
                    sb3.append(" cannot be found from the current destination ");
                    sb3.append(destination);
                    throw new IllegalArgumentException(sb3.toString());
                }
                navigate(navDestinationFindDestination$default, bundleBundleOf, navOptions, p3);
            }
            if (navOptions.getPopUpToRoute() != null) {
                String popUpToRoute = navOptions.getPopUpToRoute();
                Intrinsics.checkNotNull(popUpToRoute);
                popBackStack$default(this, popUpToRoute, navOptions.getPopUpToInclusive(), false, 4, (Object) null);
                return;
            }
            if (navOptions.getPopUpToRouteClass() != null) {
                KClass<?> popUpToRouteClass = navOptions.getPopUpToRouteClass();
                Intrinsics.checkNotNull(popUpToRouteClass);
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                videoProfileHdrFormatsToDynamicRangeEncoding[] videoprofilehdrformatstodynamicrangeencodingArr = new videoProfileHdrFormatsToDynamicRangeEncoding[0];
                Intrinsics.checkNotNullParameter(popUpToRouteClass, "");
                Intrinsics.checkNotNullParameter(videoprofilehdrformatstodynamicrangeencodingArr, "");
                videoProfileHdrFormatsToDynamicRangeEncoding videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = updateMirroringFlagInOutputFileOptions.TuitionPaymentFragmentbindingInflater1(JvmClassMappingKt.getJavaClass((KClass) popUpToRouteClass), (videoProfileHdrFormatsToDynamicRangeEncoding<Object>[]) Arrays.copyOf(videoprofilehdrformatstodynamicrangeencodingArr, 0));
                if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 == null) {
                    videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 = CameraController2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(popUpToRouteClass);
                }
                if (videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1 != null) {
                    popBackStack(RouteSerializerKt.generateHashCode(videoprofilehdrformatstodynamicrangeencodingTuitionPaymentFragmentbindingInflater1), navOptions.getPopUpToInclusive());
                    return;
                } else {
                    updatePreviewViewTransform.TuitionPaymentFragmentbindingInflater1(popUpToRouteClass);
                    throw new KotlinNothingValueException();
                }
            }
            if (navOptions.getPopUpToId() != -1) {
                popBackStack(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive());
                return;
            }
            return;
        }
        navOptions = p2;
        destinationId = p0;
        bundleBundleOf = null;
        if (p1 != null) {
            if (bundleBundleOf == null) {
                mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    arrayList = new ArrayList(mapEmptyMap.size());
                    while (r9.hasNext()) {
                        arrayList.add(TuplesKt.to((String) entry2.getKey(), entry2.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m7454constructorimpl(bundleBundleOf);
            }
            SavedStateWriter.m7458putAllimpl(SavedStateWriter.m7454constructorimpl(bundleBundleOf), p1);
        }
        if (destinationId == 0) {
        }
        if (destinationId != 0) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        navDestinationFindDestination$default = findDestination$default(this, destinationId, null, 2, null);
        if (navDestinationFindDestination$default == null) {
            displayName = NavDestination.INSTANCE.getDisplayName(this.navContext, destinationId);
            if (action == null) {
                StringBuilder sb4 = new StringBuilder("Navigation destination ");
                sb4.append(displayName);
                sb4.append(" referenced from action ");
                sb4.append(NavDestination.INSTANCE.getDisplayName(this.navContext, p0));
                sb4.append(" cannot be found from the current destination ");
                sb4.append(destination);
                throw new IllegalArgumentException(sb4.toString().toString());
            }
            StringBuilder sb5 = new StringBuilder("Navigation action/destination ");
            sb5.append(displayName);
            sb5.append(" cannot be found from the current destination ");
            sb5.append(destination);
            throw new IllegalArgumentException(sb5.toString());
        }
        navigate(navDestinationFindDestination$default, bundleBundleOf, navOptions, p3);
    }

    public void navigate(Uri p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null));
    }

    public void navigate(Uri p0, NavOptions p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null), p1);
    }

    public void navigate(Uri p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(new NavDeepLinkRequest(p0, null, null), p1, p2);
    }

    public void navigate(NavDeepLinkRequest p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(p0);
    }

    public void navigate(NavDeepLinkRequest p0, NavOptions p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(p0, p1);
    }

    public void navigate(NavDeepLinkRequest p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(p0, p1, p2);
    }

    public final void writeIntent$navigation_runtime_release(NavDeepLinkRequest p0, Bundle p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intent intent = new Intent();
        intent.setDataAndType(p0.getUri(), p0.getMimeType());
        intent.setAction(p0.getAction());
        SavedStateWriter.m7478putParcelableimpl(SavedStateWriter.m7454constructorimpl(p1), KEY_DEEP_LINK_INTENT, intent);
    }

    private final void navigate(NavDestination p0, Bundle p1, NavOptions p2, Navigator.Extras p3) {
        this.impl.navigate$navigation_runtime_release(p0, p1, p2, p3);
    }

    public void navigate(NavDirections p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate(p0.getActionId(), p0.getArguments(), (NavOptions) null);
    }

    public void navigate(NavDirections p0, NavOptions p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        navigate(p0.getActionId(), p0.getArguments(), p1);
    }

    public void navigate(NavDirections p0, Navigator.Extras p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        navigate(p0.getActionId(), p0.getArguments(), (NavOptions) null, p1);
    }

    public final void navigate(String p0, Function1<? super NavOptionsBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.impl.navigate$navigation_runtime_release(p0, p1);
    }

    public static /* synthetic */ void navigate$default(NavController navController, String str, NavOptions navOptions, Navigator.Extras extras, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate(str, navOptions, extras);
    }

    public final void navigate(String p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(p0, p1, p2);
    }

    public final <T> void navigate(T p0, Function1<? super NavOptionsBuilder, Unit> p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.impl.navigate$navigation_runtime_release(p0, p1);
    }

    public static /* synthetic */ void navigate$default(NavController navController, Object obj, NavOptions navOptions, Navigator.Extras extras, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i & 2) != 0) {
            navOptions = null;
        }
        if ((i & 4) != 0) {
            extras = null;
        }
        navController.navigate(obj, navOptions, extras);
    }

    public final <T> void navigate(T p0, NavOptions p1, Navigator.Extras p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.navigate$navigation_runtime_release(p0, p1, p2);
    }

    public NavDeepLinkBuilder createDeepLink() {
        return new NavDeepLinkBuilder(this);
    }

    public Bundle saveState() {
        Pair[] pairArr;
        Bundle bundleSaveState$navigation_runtime_release = this.impl.saveState$navigation_runtime_release();
        if (this.deepLinkHandled) {
            if (bundleSaveState$navigation_runtime_release == null) {
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                bundleSaveState$navigation_runtime_release = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                SavedStateWriter.m7454constructorimpl(bundleSaveState$navigation_runtime_release);
            }
            SavedStateWriter.m7460putBooleanimpl(SavedStateWriter.m7454constructorimpl(bundleSaveState$navigation_runtime_release), KEY_DEEP_LINK_HANDLED, this.deepLinkHandled);
        }
        return bundleSaveState$navigation_runtime_release;
    }

    public void restoreState(Bundle p0) {
        if (p0 != null) {
            p0.setClassLoader(this.context.getClassLoader());
        }
        this.impl.restoreState$navigation_runtime_release(p0);
        if (p0 != null) {
            Boolean boolM7380getBooleanOrNullimpl = SavedStateReader.m7380getBooleanOrNullimpl(SavedStateReader.m7368constructorimpl(p0), KEY_DEEP_LINK_HANDLED);
            this.deepLinkHandled = boolM7380getBooleanOrNullimpl != null ? boolM7380getBooleanOrNullimpl.booleanValue() : false;
        }
    }

    public void setLifecycleOwner(LifecycleOwner p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setLifecycleOwner$navigation_runtime_release(p0);
    }

    public void setOnBackPressedDispatcher(OnBackPressedDispatcher p0) throws Exception {
        Intrinsics.checkNotNullParameter(p0, "");
        if (Intrinsics.areEqual(p0, this.onBackPressedDispatcher)) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.impl.getLifecycleOwner();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.onBackPressedCallback.remove();
        this.onBackPressedDispatcher = p0;
        p0.addCallback(lifecycleOwner, this.onBackPressedCallback);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        lifecycle.removeObserver(this.impl.getLifecycleObserver());
        lifecycle.addObserver(this.impl.getLifecycleObserver());
    }

    public void enableOnBackPressed(boolean p0) {
        this.enableOnBackPressedCallback = p0;
        updateOnBackPressedCallbackEnabled();
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000d  */
    private final void updateOnBackPressedCallbackEnabled() {
        boolean z;
        OnBackPressedCallback onBackPressedCallback = this.onBackPressedCallback;
        if (this.enableOnBackPressedCallback) {
            z = getDestinationCountOnBackStack() > 1;
        }
        onBackPressedCallback.setEnabled(z);
    }

    public void setViewModelStore(ViewModelStore p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.impl.setViewModelStore$navigation_runtime_release(p0);
    }

    public ViewModelStoreOwner getViewModelStoreOwner(int p0) {
        return this.impl.getViewModelStoreOwner$navigation_runtime_release(p0);
    }

    public NavBackStackEntry getBackStackEntry(int p0) {
        return this.impl.getBackStackEntry$navigation_runtime_release(p0);
    }

    public final NavBackStackEntry getBackStackEntry(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.getBackStackEntry$navigation_runtime_release(p0);
    }

    public final /* synthetic */ <T> NavBackStackEntry getBackStackEntry() {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return getBackStackEntry((KClass) Reflection.getOrCreateKotlinClass(Object.class));
    }

    public final <T> NavBackStackEntry getBackStackEntry(KClass<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.getBackStackEntry$navigation_runtime_release((KClass) p0);
    }

    public final <T> NavBackStackEntry getBackStackEntry(T p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.impl.getBackStackEntry$navigation_runtime_release(p0);
    }

    public NavBackStackEntry getCurrentBackStackEntry() {
        return this.impl.getCurrentBackStackEntry$navigation_runtime_release();
    }

    public final clampVideoBitrateIfNotSupported<NavBackStackEntry> getCurrentBackStackEntryFlow() {
        return new lambdastop4androidxcameravideointernalencoderEncoderImpl(this.impl.get_currentBackStackEntryFlow$navigation_runtime_release());
    }

    public NavBackStackEntry getPreviousBackStackEntry() {
        return this.impl.getPreviousBackStackEntry$navigation_runtime_release();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0086T¢\u0006\f\n\u0004\b\r\u0010\u000b\u0012\u0004\b\u000e\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/navigation/NavController$Companion;", "", "<init>", "()V", "", "p0", "", "enableDeepLinkSaveState", "(Z)V", "", "KEY_DEEP_LINK_IDS", "Ljava/lang/String;", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_EXTRAS", "getKEY_DEEP_LINK_EXTRAS$annotations", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_INTENT", "deepLinkSaveState", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getKEY_DEEP_LINK_EXTRAS$annotations() {
        }

        private Companion() {
        }

        @JvmStatic
        public final void enableDeepLinkSaveState(boolean p0) {
            NavController.deepLinkSaveState = p0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final /* synthetic */ <T> boolean popBackStack(boolean z) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return popBackStack((KClass) Reflection.getOrCreateKotlinClass(Object.class), z, false);
    }

    @JvmStatic
    public static final void enableDeepLinkSaveState(boolean z) {
        INSTANCE.enableDeepLinkSaveState(z);
    }

    public final <T> void navigate(T t) {
        Intrinsics.checkNotNullParameter(t, "");
        navigate$default(this, t, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public final <T> void navigate(T t, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(t, "");
        navigate$default(this, t, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public final void navigate(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        navigate$default(this, str, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
    }

    public final void navigate(String str, NavOptions navOptions) {
        Intrinsics.checkNotNullParameter(str, "");
        navigate$default(this, str, navOptions, (Navigator.Extras) null, 4, (Object) null);
    }

    public final <T> boolean popBackStack(T t, boolean z) {
        Intrinsics.checkNotNullParameter(t, "");
        return popBackStack$default(this, (Object) t, z, false, 4, (Object) null);
    }

    public final boolean popBackStack(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return popBackStack$default(this, str, z, false, 4, (Object) null);
    }

    public final <T> boolean popBackStack(KClass<T> kClass, boolean z) {
        Intrinsics.checkNotNullParameter(kClass, "");
        return popBackStack$default(this, (KClass) kClass, z, false, 4, (Object) null);
    }
}
