package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\bv\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001a0\u0019H'¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001eH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H&¢\u0006\u0004\b#\u0010\bJ\u000f\u0010$\u001a\u00020\u0004H'¢\u0006\u0004\b$\u0010\bJ\u0017\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010\bJ\u000f\u0010*\u001a\u00020\u0004H'¢\u0006\u0004\b*\u0010\bJ#\u0010-\u001a\u00020\u0004\"\u0004\b\u0000\u0010+2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000,H'¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H'¢\u0006\u0004\b/\u0010\bJ\u000f\u00100\u001a\u00020\u0004H'¢\u0006\u0004\b0\u0010\bJ!\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b1\u0010\rJ\u000f\u00102\u001a\u00020\u0004H'¢\u0006\u0004\b2\u0010\bJ\u000f\u00103\u001a\u00020\u0004H'¢\u0006\u0004\b3\u0010\bJ\u000f\u00104\u001a\u00020\u0004H'¢\u0006\u0004\b4\u0010\bJ\u0017\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b5\u0010\u0006JB\u00109\u001a\u00020\u0004\"\u0004\b\u0000\u00106\"\u0004\b\u0001\u0010+2\u0006\u0010\u0003\u001a\u00028\u00002\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000407¢\u0006\u0002\b8H'¢\u0006\u0004\b9\u0010:J#\u0010;\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b;\u0010<J\u0011\u0010=\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b?\u0010@J\u0019\u0010A\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bA\u0010BJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%H'¢\u0006\u0004\bA\u0010CJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020DH'¢\u0006\u0004\bA\u0010EJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020FH'¢\u0006\u0004\bA\u0010GJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020HH'¢\u0006\u0004\bA\u0010IJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\bA\u0010JJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020KH'¢\u0006\u0004\bA\u0010LJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020MH'¢\u0006\u0004\bA\u0010NJ\u0017\u0010A\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020OH'¢\u0006\u0004\bA\u0010PJ\u0019\u0010Q\u001a\u00020%2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\bQ\u0010BJ\u0017\u0010S\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020RH'¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\bU\u0010VJ\u001d\u0010W\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040,H'¢\u0006\u0004\bW\u0010.J#\u0010Y\u001a\u00028\u0000\"\u0004\b\u0000\u0010+2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000XH'¢\u0006\u0004\bY\u0010ZJ#\u0010]\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\\0[H'¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H'¢\u0006\u0004\b_\u0010\bJ\u001b\u0010`\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\\H'¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0004H'¢\u0006\u0004\bb\u0010\bJ\u000f\u0010c\u001a\u00020\u0004H&¢\u0006\u0004\bc\u0010\bJ\u000f\u0010e\u001a\u00020dH'¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020\u0004H&¢\u0006\u0004\bg\u0010\bR\u001e\u0010l\u001a\u0006\u0012\u0002\b\u00030h8'X§\u0004¢\u0006\f\u0012\u0004\bk\u0010\b\u001a\u0004\bi\u0010jR\u001a\u0010p\u001a\u00020%8'X§\u0004¢\u0006\f\u0012\u0004\bo\u0010\b\u001a\u0004\bm\u0010nR\u001a\u0010s\u001a\u00020%8'X§\u0004¢\u0006\f\u0012\u0004\br\u0010\b\u001a\u0004\bq\u0010nR\u001a\u0010v\u001a\u00020%8'X§\u0004¢\u0006\f\u0012\u0004\bu\u0010\b\u001a\u0004\bt\u0010nR\u001c\u0010z\u001a\u0004\u0018\u00010R8'X§\u0004¢\u0006\f\u0012\u0004\by\u0010\b\u001a\u0004\bw\u0010xR\u001c\u0010}\u001a\u0004\u0018\u00010\u00018'X§\u0004¢\u0006\f\u0012\u0004\b|\u0010\b\u001a\u0004\b{\u0010>R\u001c\u0010\u0081\u0001\u001a\u00020\u00028WX\u0097\u0004¢\u0006\r\u0012\u0005\b\u0080\u0001\u0010\b\u001a\u0004\b~\u0010\u007fR#\u0010\u0086\u0001\u001a\u00070Mj\u0003`\u0082\u00018'X§\u0004¢\u0006\u000f\u0012\u0005\b\u0085\u0001\u0010\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u001d\u0010\u0089\u0001\u001a\u00020\u00028'X§\u0004¢\u0006\u000e\u0012\u0005\b\u0088\u0001\u0010\b\u001a\u0005\b\u0087\u0001\u0010\u007fR\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018'X¦\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001f\u0010\u0096\u0001\u001a\u00030\u0092\u00018gX§\u0004¢\u0006\u000f\u0012\u0005\b\u0095\u0001\u0010\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018gX¦\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0001\u0002\u009c\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "p0", "", "startReplaceableGroup", "(I)V", "endReplaceableGroup", "()V", "startReplaceGroup", "endReplaceGroup", "p1", "startMovableGroup", "(ILjava/lang/Object;)V", "endMovableGroup", "startDefaults", "endDefaults", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/MovableContent;", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "insertMovableContentReferences", "(Ljava/util/List;)V", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "skipToGroupEnd", "", "deactivateToEndGroup", "(Z)V", "skipCurrentGroup", "startNode", "startReusableNode", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function0;", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "rememberedValue", "()Ljava/lang/Object;", "updateRememberedValue", "(Ljava/lang/Object;)V", "changed", "(Ljava/lang/Object;)Z", "(Z)Z", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(I)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "changedInstance", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "shouldExecute", "(ZI)Z", "recordSideEffect", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "startProvider", "(Landroidx/compose/runtime/ProvidedValue;)V", "endProvider", "collectParameterInformation", "Landroidx/compose/runtime/CompositionContext;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", "disableSourceInformation", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "getInserting", "()Z", "getInserting$annotations", "inserting", "getSkipping", "getSkipping$annotations", "skipping", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "getRecomposeScope$annotations", "recomposeScope", "getRecomposeScopeIdentity", "getRecomposeScopeIdentity$annotations", "recomposeScopeIdentity", "getCompoundKeyHash", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "getCurrentMarker", "getCurrentMarker$annotations", "currentMarker", "Landroidx/compose/runtime/CompositionLocalMap;", "getCurrentCompositionLocalMap", "()Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalMap", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "composition", "Companion", "Landroidx/compose/runtime/ComposerImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Composer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @ComposeCompilerApi
    static /* synthetic */ void getApplier$annotations() {
    }

    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @Deprecated(message = "Prefer the higher-precision compositeKeyHashCode instead", replaceWith = @ReplaceWith(expression = "compositeKeyHashCode", imports = {}))
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getInserting$annotations() {
    }

    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    @ComposeCompilerApi
    static /* synthetic */ void getSkipping$annotations() {
    }

    @ComposeCompilerApi
    <V, T> void apply(V p0, Function2<? super T, ? super V, Unit> p1);

    CompositionContext buildContext();

    @ComposeCompilerApi
    boolean changed(Object p0);

    void collectParameterInformation();

    <T> T consume(CompositionLocal<T> p0);

    @ComposeCompilerApi
    <T> void createNode(Function0<? extends T> p0);

    @ComposeCompilerApi
    void deactivateToEndGroup(boolean p0);

    @ComposeCompilerApi
    void disableReusing();

    void disableSourceInformation();

    @ComposeCompilerApi
    void enableReusing();

    @ComposeCompilerApi
    void endDefaults();

    @ComposeCompilerApi
    void endMovableGroup();

    @ComposeCompilerApi
    void endNode();

    void endProvider();

    void endProviders();

    @ComposeCompilerApi
    void endReplaceGroup();

    @ComposeCompilerApi
    void endReplaceableGroup();

    @ComposeCompilerApi
    ScopeUpdateScope endRestartGroup();

    @ComposeCompilerApi
    void endReusableGroup();

    @ComposeCompilerApi
    void endToMarker(int p0);

    Applier<?> getApplier();

    CoroutineContext getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    ControlledComposition getComposition();

    CompositionData getCompositionData();

    CompositionLocalMap getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    RecomposeScope getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(MovableContent<?> p0, Object p1);

    void insertMovableContentReferences(List<Pair<MovableContentStateReference, MovableContentStateReference>> p0);

    @ComposeCompilerApi
    Object joinKey(Object p0, Object p1);

    void recordSideEffect(Function0<Unit> p0);

    void recordUsed(RecomposeScope p0);

    @ComposeCompilerApi
    Object rememberedValue();

    boolean shouldExecute(boolean p0, int p1);

    @ComposeCompilerApi
    void skipCurrentGroup();

    @ComposeCompilerApi
    void skipToGroupEnd();

    void sourceInformation(String p0);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int p0, String p1);

    @ComposeCompilerApi
    void startDefaults();

    @ComposeCompilerApi
    void startMovableGroup(int p0, Object p1);

    @ComposeCompilerApi
    void startNode();

    void startProvider(ProvidedValue<?> p0);

    void startProviders(ProvidedValue<?>[] p0);

    @ComposeCompilerApi
    void startReplaceGroup(int p0);

    @ComposeCompilerApi
    void startReplaceableGroup(int p0);

    @ComposeCompilerApi
    Composer startRestartGroup(int p0);

    @ComposeCompilerApi
    void startReusableGroup(int p0, Object p1);

    @ComposeCompilerApi
    void startReusableNode();

    @ComposeCompilerApi
    void updateRememberedValue(Object p0);

    @ComposeCompilerApi
    void useNode();

    default int getCompoundKeyHash() {
        return Long.hashCode(getCompositeKeyHashCode());
    }

    @ComposeCompilerApi
    default boolean changed(boolean p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(char p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(byte p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(short p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(int p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(float p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(long p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changed(double p0) {
        return changed(p0);
    }

    @ComposeCompilerApi
    default boolean changedInstance(Object p0) {
        return changed(p0);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/Composer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/CompositionTracer;", "p0", "", "setTracer", "(Landroidx/compose/runtime/CompositionTracer;)V", "", "setDiagnosticStackTraceEnabled", "(Z)V", "Empty", "Ljava/lang/Object;", "getEmpty", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Object Empty = new Object() { // from class: androidx.compose.runtime.Composer$Companion$Empty$1
            public final String toString() {
                return "Empty";
            }
        };

        private Companion() {
        }

        public final Object getEmpty() {
            return Empty;
        }

        public final void setTracer(CompositionTracer p0) {
            ComposerKt.compositionTracer = p0;
        }

        public final void setDiagnosticStackTraceEnabled(boolean p0) {
            ComposerKt.setComposeStackTraceEnabled(p0);
        }
    }
}
