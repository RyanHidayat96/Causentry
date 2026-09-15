package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0002[\\B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0002\b\u001fH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0019\u0010 J\u0015\u0010!\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010#\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u0082\b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\u0003J\u0015\u0010&\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020\b2\u001b\u0010\u000b\u001a\u0017\u0012\b\u0012\u00060(R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0002\b\u001fH\u0086\b¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\b2\u001b\u0010\u000b\u001a\u0017\u0012\b\u0012\u00060(R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u001d¢\u0006\u0002\b\u001fH\u0086\b¢\u0006\u0004\b+\u0010*J3\u00102\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030,2\u0006\u0010\u000f\u001a\u00020-2\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u0013\u00104\u001a\u00020\u001a*\u00020\u001aH\u0002¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\nH\u0082\b¢\u0006\u0004\b6\u00107J\u001c\u00109\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u000ej\u0002`8H\u0082\b¢\u0006\u0004\b9\u0010$J\u001c\u0010<\u001a\u00020\u000e2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030:H\u0082\b¢\u0006\u0004\b;\u0010$J\u000f\u0010=\u001a\u00020\u001aH\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b?\u00105J\u001f\u0010@\u001a\u00020\u001a*\u00060(R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b@\u0010AJ\u001d\u0010C\u001a\u00020\u001a*\u0004\u0018\u00010B2\u0006\u0010\u000b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bC\u0010DJ'\u0010G\u001a\u00020\u001a\"\u0004\b\u0000\u0010E*\b\u0012\u0004\u0012\u00028\u00000F2\u0006\u0010\u000b\u001a\u00020\u001aH\u0002¢\u0006\u0004\bG\u0010HR\"\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0I8\u0000@\u0000X\u0080\u000e¢\u0006\f\n\u0004\bJ\u0010K\u0012\u0004\bL\u0010\u0003R\u0016\u0010M\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bR\u0010NR\u001e\u0010S\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0I8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bU\u0010NR\u0016\u0010V\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010NR\u0016\u0010W\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010NR\u0011\u0010Z\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bX\u0010Y"}, d2 = {"Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "<init>", "()V", "", "isEmpty", "()Z", "isNotEmpty", "", "clear", "Landroidx/compose/runtime/changelist/Operation;", "p0", "pushOp", "(Landroidx/compose/runtime/changelist/Operation;)V", "", "p1", "determineNewSize", "(II)I", "resizeOpCodes", "ensureIntArgsSizeAtLeast", "(I)V", "resizeIntArgs", "(II)V", "ensureObjectArgsSizeAtLeast", "resizeObjectArgs", "push", "", "exceptionMessageForOperationPushNoScope", "(Landroidx/compose/runtime/changelist/Operation;)Ljava/lang/String;", "Lkotlin/Function1;", "Landroidx/compose/runtime/changelist/Operations$WriteScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/changelist/Operation;Lkotlin/jvm/functions/Function1;)V", "ensureAllArgumentsPushedFor", "exceptionMessageForOperationPushWithScope", "createExpectedArgMask", "(I)I", "pop", "popInto", "(Landroidx/compose/runtime/changelist/Operations;)V", "Landroidx/compose/runtime/changelist/Operations$OpIterator;", "drain", "(Lkotlin/jvm/functions/Function1;)V", "forEach", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "p2", "Landroidx/compose/runtime/changelist/OperationErrorContext;", "p3", "executeAndFlushAllPendingOperations", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;Landroidx/compose/runtime/changelist/OperationErrorContext;)V", "indent", "(Ljava/lang/String;)Ljava/lang/String;", "peekOperation", "()Landroidx/compose/runtime/changelist/Operation;", "Landroidx/compose/runtime/changelist/IntParameter;", "topIntIndexOf", "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "topObjectIndexOf-31yXWZQ", "topObjectIndexOf", "toString", "()Ljava/lang/String;", "toDebugString", "currentOpToDebugString", "(Landroidx/compose/runtime/changelist/Operations$OpIterator;Ljava/lang/String;)Ljava/lang/String;", "", "formatOpArgumentToString", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "", "toCollectionString", "(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;", "", "opCodes", "[Landroidx/compose/runtime/changelist/Operation;", "getOpCodes$runtime$annotations", "opCodesSize", "I", "", "intArgs", "[I", "intArgsSize", "objectArgs", "[Ljava/lang/Object;", "objectArgsSize", "pushedIntMask", "pushedObjectMask", "getSize", "()I", "size", "WriteScope", "OpIterator"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Operations extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    public int intArgsSize;
    public int objectArgsSize;
    public int opCodesSize;
    private int pushedIntMask;
    private int pushedObjectMask;
    public Operation[] opCodes = new Operation[16];
    public int[] intArgs = new int[16];
    public Object[] objectArgs = new Object[16];

    private final int createExpectedArgMask(int p0) {
        return (p0 == 0 ? 0 : -1) >>> (32 - p0);
    }

    public static /* synthetic */ void getOpCodes$runtime$annotations() {
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean isEmpty() {
        return getOpCodesSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getOpCodesSize() != 0;
    }

    public final void clear() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        ArraysKt.fill(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
    }

    public final void pushOp(Operation p0) {
        if (this.opCodesSize == this.opCodes.length) {
            resizeOpCodes();
        }
        int ints = this.intArgsSize + p0.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            resizeIntArgs(length, ints);
        }
        int objects = this.objectArgsSize + p0.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            resizeObjectArgs(length2, objects);
        }
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        operationArr[i] = p0;
        this.intArgsSize += p0.getInts();
        this.objectArgsSize += p0.getObjects();
    }

    private final int determineNewSize(int p0, int p1) {
        return RangesKt.coerceAtLeast(p0 + RangesKt.coerceAtMost(p0, 1024), p1);
    }

    private final void resizeOpCodes() {
        int iCoerceAtMost = RangesKt.coerceAtMost(this.opCodesSize, 1024);
        int i = this.opCodesSize;
        Operation[] operationArr = new Operation[iCoerceAtMost + i];
        System.arraycopy(this.opCodes, 0, operationArr, 0, i);
        this.opCodes = operationArr;
    }

    private final void ensureIntArgsSizeAtLeast(int p0) {
        int length = this.intArgs.length;
        if (p0 > length) {
            resizeIntArgs(length, p0);
        }
    }

    private final void resizeIntArgs(int p0, int p1) {
        int[] iArr = new int[determineNewSize(p0, p1)];
        ArraysKt.copyInto(this.intArgs, iArr, 0, 0, p0);
        this.intArgs = iArr;
    }

    private final void ensureObjectArgsSizeAtLeast(int p0) {
        int length = this.objectArgs.length;
        if (p0 > length) {
            resizeObjectArgs(length, p0);
        }
    }

    private final void resizeObjectArgs(int p0, int p1) {
        Object[] objArr = new Object[determineNewSize(p0, p1)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, p0);
        this.objectArgs = objArr;
    }

    public final void push(Operation p0) {
        pushOp(p0);
    }

    private final String exceptionMessageForOperationPushNoScope(Operation p0) {
        StringBuilder sb = new StringBuilder("Cannot push ");
        sb.append(p0);
        sb.append(" without arguments because it expects ");
        sb.append(p0.getInts());
        sb.append(" ints and ");
        sb.append(p0.getObjects());
        sb.append(" objects.");
        return sb.toString();
    }

    public final void push(Operation p0, Function1<? super WriteScope, Unit> p1) {
        pushOp(p0);
        p1.invoke(WriteScope.m3597boximpl(WriteScope.m3598constructorimpl(this)));
        ensureAllArgumentsPushedFor(p0);
    }

    public final void ensureAllArgumentsPushedFor(Operation p0) {
        int i = this.pushedIntMask;
        int ints = p0.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            p0.getObjects();
        }
    }

    private final String exceptionMessageForOperationPushWithScope(Operation p0) {
        StringBuilder sb = new StringBuilder();
        int ints = p0.getInts();
        int i = 0;
        for (int i2 = 0; i2 < ints; i2++) {
            if (((1 << i2) & this.pushedIntMask) == 0) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(p0.intParamName(i2));
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        StringBuilder sb2 = new StringBuilder();
        int objects = p0.getObjects();
        int i3 = 0;
        for (int i4 = 0; i4 < objects; i4++) {
            if (((1 << i4) & this.pushedObjectMask) == 0) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(p0.mo3548objectParamName31yXWZQ(Operation.ObjectParameter.m3574constructorimpl(i4)));
                i3++;
            }
        }
        String string2 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        StringBuilder sb3 = new StringBuilder("Error while pushing ");
        sb3.append(p0);
        sb3.append(". Not all arguments were provided. Missing ");
        sb3.append(i);
        sb3.append(" int arguments (");
        sb3.append(string);
        sb3.append(") and ");
        sb3.append(i3);
        sb3.append(" object arguments (");
        sb3.append(string2);
        sb3.append(").");
        return sb3.toString();
    }

    public final void pop() {
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation = operationArr[i];
        operationArr[i] = null;
        int objects = operation.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            Object[] objArr = this.objectArgs;
            int i3 = this.objectArgsSize - 1;
            this.objectArgsSize = i3;
            objArr[i3] = null;
        }
        this.intArgsSize -= operation.getInts();
    }

    public final void popInto(Operations p0) {
        Operation[] operationArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        Operation operation = operationArr[i];
        operationArr[i] = null;
        p0.pushOp(operation);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = p0.objectArgs;
        int i2 = p0.objectArgsSize;
        int objects = operation.getObjects();
        int objects2 = this.objectArgsSize - operation.getObjects();
        System.arraycopy(objArr, objects2, objArr2, i2 - objects, this.objectArgsSize - objects2);
        ArraysKt.fill(this.objectArgs, (Object) null, this.objectArgsSize - operation.getObjects(), this.objectArgsSize);
        ArraysKt.copyInto(this.intArgs, p0.intArgs, p0.intArgsSize - operation.getInts(), this.intArgsSize - operation.getInts(), this.intArgsSize);
        this.objectArgsSize -= operation.getObjects();
        this.intArgsSize -= operation.getInts();
    }

    public final void forEach(Function1<? super OpIterator, Unit> p0) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                p0.invoke(opIterator);
            } while (opIterator.next());
        }
    }

    private final String indent(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        return sb.toString();
    }

    private final Operation peekOperation() {
        return this.opCodes[this.opCodesSize - 1];
    }

    private final int topIntIndexOf(int p0) {
        return (this.intArgsSize - this.opCodes[this.opCodesSize - 1].getInts()) + p0;
    }

    /* JADX INFO: renamed from: topObjectIndexOf-31yXWZQ, reason: not valid java name */
    private final int m3596topObjectIndexOf31yXWZQ(int p0) {
        return (this.objectArgsSize - this.opCodes[this.opCodesSize - 1].getObjects()) + p0;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\f\u001a\u00020\t2\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\u0011\u001a\u00020\t2\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010JL\u0010\u0011\u001a\u00020\t2\n\u0010\u0003\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001a\u00020\u00062\n\u0010\r\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000e\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0013\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0014J)\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\u00152\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001d\u001a\u00020\t\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\b\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u000e\u001a\u00028\u0001¢\u0006\u0004\b\u001b\u0010\u001cJa\u0010\u001d\u001a\u00020\t\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\b\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u000e\u001a\u00028\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u0002¢\u0006\u0004\b\u001f\u0010 J}\u0010\u001d\u001a\u00020\t\"\u0004\b\u0000\u0010\u0015\"\u0004\b\u0001\u0010\u001a\"\u0004\b\u0002\u0010\u001e\"\u0004\b\u0003\u0010!2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\b\u001a\u00028\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00162\u0006\u0010\u000e\u001a\u00028\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u00162\u0006\u0010\u0013\u001a\u00028\u00022\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00030\u00162\u0006\u0010#\u001a\u00028\u0003¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0011\u00103\u001a\u0002008G¢\u0006\u0006\u001a\u0004\b1\u00102\u0088\u0001.\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$WriteScope;", "", "Landroidx/compose/runtime/changelist/Operations;", "p0", "constructor-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operations;", "", "Landroidx/compose/runtime/changelist/IntParameter;", "p1", "", "setInt-impl", "(Landroidx/compose/runtime/changelist/Operations;II)V", "setInt", "p2", "p3", "setInts-impl", "(Landroidx/compose/runtime/changelist/Operations;IIII)V", "setInts", "p4", "p5", "(Landroidx/compose/runtime/changelist/Operations;IIIIII)V", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "setObject-DKhxnng", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;)V", "setObject", "U", "setObjects-4uCC6AY", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;)V", "setObjects", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "setObjects-t7hvbck", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", ExifInterface.LONGITUDE_WEST, "p6", "p7", "setObjects-OGa0p1M", "(Landroidx/compose/runtime/changelist/Operations;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "stack", "Landroidx/compose/runtime/changelist/Operations;", "Landroidx/compose/runtime/changelist/Operation;", "getOperation-impl", "(Landroidx/compose/runtime/changelist/Operations;)Landroidx/compose/runtime/changelist/Operation;", "operation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @JvmInline
    public static final class WriteScope {
        private final Operations stack;

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static Operations m3598constructorimpl(Operations operations) {
            return operations;
        }

        private /* synthetic */ WriteScope(Operations operations) {
            this.stack = operations;
        }

        /* JADX INFO: renamed from: setInt-impl, reason: not valid java name */
        public static final void m3603setIntimpl(Operations operations, int i, int i2) {
            operations.intArgs[(operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts()) + i] = i2;
        }

        /* JADX INFO: renamed from: setInts-impl, reason: not valid java name */
        public static final void m3604setIntsimpl(Operations operations, int i, int i2, int i3, int i4) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i2;
            iArr[ints + i3] = i4;
        }

        /* JADX INFO: renamed from: setInts-impl, reason: not valid java name */
        public static final void m3605setIntsimpl(Operations operations, int i, int i2, int i3, int i4, int i5, int i6) {
            int ints = operations.intArgsSize - operations.opCodes[operations.opCodesSize - 1].getInts();
            int[] iArr = operations.intArgs;
            iArr[i + ints] = i2;
            iArr[i3 + ints] = i4;
            iArr[ints + i5] = i6;
        }

        /* JADX INFO: renamed from: setObject-DKhxnng, reason: not valid java name */
        public static final <T> void m3606setObjectDKhxnng(Operations operations, int i, T t) {
            operations.objectArgs[(operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects()) + i] = t;
        }

        /* JADX INFO: renamed from: setObjects-4uCC6AY, reason: not valid java name */
        public static final <T, U> void m3607setObjects4uCC6AY(Operations operations, int i, T t, int i2, U u) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[objects + i2] = u;
        }

        /* JADX INFO: renamed from: setObjects-t7hvbck, reason: not valid java name */
        public static final <T, U, V> void m3609setObjectst7hvbck(Operations operations, int i, T t, int i2, U u, int i3, V v) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[objects + i3] = v;
        }

        /* JADX INFO: renamed from: setObjects-OGa0p1M, reason: not valid java name */
        public static final <T, U, V, W> void m3608setObjectsOGa0p1M(Operations operations, int i, T t, int i2, U u, int i3, V v, int i4, W w) {
            int objects = operations.objectArgsSize - operations.opCodes[operations.opCodesSize - 1].getObjects();
            Object[] objArr = operations.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[i3 + objects] = v;
            objArr[objects + i4] = w;
        }

        /* JADX INFO: renamed from: getOperation-impl, reason: not valid java name */
        public static final Operation m3601getOperationimpl(Operations operations) {
            return operations.opCodes[operations.opCodesSize - 1];
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WriteScope m3597boximpl(Operations operations) {
            return new WriteScope(operations);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3599equalsimpl(Operations operations, Object obj) {
            return (obj instanceof WriteScope) && Intrinsics.areEqual(operations, ((WriteScope) obj).getStack());
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3600equalsimpl0(Operations operations, Operations operations2) {
            return Intrinsics.areEqual(operations, operations2);
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3602hashCodeimpl(Operations operations) {
            return operations.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3610toStringimpl(Operations operations) {
            StringBuilder sb = new StringBuilder("WriteScope(stack=");
            sb.append(operations);
            sb.append(')');
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            return m3599equalsimpl(this.stack, p0);
        }

        public final int hashCode() {
            return m3602hashCodeimpl(this.stack);
        }

        public final String toString() {
            return m3610toStringimpl(this.stack);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ Operations getStack() {
            return this.stack;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0011\u0010\u001b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/runtime/changelist/Operations$OpIterator;", "Landroidx/compose/runtime/changelist/OperationArgContainer;", "<init>", "(Landroidx/compose/runtime/changelist/Operations;)V", "", "next", "()Z", "", "Landroidx/compose/runtime/changelist/IntParameter;", "p0", "getInt", "(I)I", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/changelist/Operation$ObjectParameter;", "getObject-31yXWZQ", "(I)Ljava/lang/Object;", "getObject", "", "currentOperationDebugString", "()Ljava/lang/String;", "opIdx", "I", "intIdx", "objIdx", "Landroidx/compose/runtime/changelist/Operation;", "getOperation", "()Landroidx/compose/runtime/changelist/Operation;", "operation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class OpIterator implements OperationArgContainer {
        private int intIdx;
        private int objIdx;
        private int opIdx;

        public OpIterator() {
        }

        public final boolean next() {
            if (this.opIdx >= Operations.this.opCodesSize) {
                return false;
            }
            Operation operation = getOperation();
            this.intIdx += operation.getInts();
            this.objIdx += operation.getObjects();
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < Operations.this.opCodesSize;
        }

        public final Operation getOperation() {
            return Operations.this.opCodes[this.opIdx];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        public final int getInt(int p0) {
            return Operations.this.intArgs[this.intIdx + p0];
        }

        @Override // androidx.compose.runtime.changelist.OperationArgContainer
        /* JADX INFO: renamed from: getObject-31yXWZQ */
        public final <T> T mo3595getObject31yXWZQ(int p0) {
            return (T) Operations.this.objectArgs[this.objIdx + p0];
        }

        public final String currentOperationDebugString() {
            Operations operations = Operations.this;
            StringBuilder sb = new StringBuilder("operation[");
            sb.append(this.opIdx);
            sb.append("] = ");
            sb.append(operations.currentOpToDebugString(this, ""));
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
    }

    @Deprecated(message = "toString() will return the default implementation from Any. Did you mean to use toDebugString()?", replaceWith = @ReplaceWith(expression = "toDebugString()", imports = {}))
    public final String toString() {
        return super.toString();
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public final String toDebugString(String p0) {
        StringBuilder sb = new StringBuilder();
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            int i = 0;
            while (true) {
                sb.append(p0);
                sb.append(i);
                sb.append(". ");
                sb.append(currentOpToDebugString(opIterator, p0));
                Intrinsics.checkNotNullExpressionValue(sb, "");
                sb.append('\n');
                Intrinsics.checkNotNullExpressionValue(sb, "");
                if (!opIterator.next()) {
                    break;
                }
                i++;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentOpToDebugString(OpIterator opIterator, String str) {
        Operation operation = opIterator.getOperation();
        if (operation.getInts() == 0 && operation.getObjects() == 0) {
            return operation.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(operation.getName());
        sb.append('(');
        String strIndent = indent(str);
        int ints = operation.getInts();
        boolean z = true;
        for (int i = 0; i < ints; i++) {
            String strIntParamName = operation.intParamName(i);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(strIndent);
            sb.append(strIntParamName);
            sb.append(" = ");
            sb.append(opIterator.getInt(i));
        }
        int objects = operation.getObjects();
        for (int i2 = 0; i2 < objects; i2++) {
            int iM3574constructorimpl = Operation.ObjectParameter.m3574constructorimpl(i2);
            String strMo3548objectParamName31yXWZQ = operation.mo3548objectParamName31yXWZQ(iM3574constructorimpl);
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append(strIndent);
            sb.append(strMo3548objectParamName31yXWZQ);
            sb.append(" = ");
            sb.append(formatOpArgumentToString(opIterator.mo3595getObject31yXWZQ(iM3574constructorimpl), strIndent));
        }
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "");
        sb.append(str);
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    private final String formatOpArgumentToString(Object obj, String str) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Object[]) {
            return toCollectionString(ArraysKt.asIterable((Object[]) obj), str);
        }
        if (obj instanceof int[]) {
            return toCollectionString(ArraysKt.asIterable((int[]) obj), str);
        }
        if (obj instanceof long[]) {
            return toCollectionString(ArraysKt.asIterable((long[]) obj), str);
        }
        if (obj instanceof float[]) {
            return toCollectionString(ArraysKt.asIterable((float[]) obj), str);
        }
        if (obj instanceof double[]) {
            return toCollectionString(ArraysKt.asIterable((double[]) obj), str);
        }
        if (obj instanceof Iterable) {
            return toCollectionString((Iterable) obj, str);
        }
        return obj instanceof OperationsDebugStringFormattable ? ((OperationsDebugStringFormattable) obj).toDebugString(str) : obj.toString();
    }

    private final <T> String toCollectionString(Iterable<? extends T> iterable, final String str) {
        return CollectionsKt.joinToString$default(iterable, ", ", "[", "]", 0, null, new Function1() { // from class: androidx.compose.runtime.changelist.Operations$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Operations.toCollectionString$lambda$14(this.f$0, str, obj);
            }
        }, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence toCollectionString$lambda$14(Operations operations, String str, Object obj) {
        return operations.formatOpArgumentToString(obj, str);
    }

    public final void drain(Function1<? super OpIterator, Unit> p0) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                p0.invoke(opIterator);
            } while (opIterator.next());
        }
        clear();
    }

    public final void executeAndFlushAllPendingOperations(Applier<?> p0, SlotWriter p1, RememberManager p2, OperationErrorContext p3) {
        if (isNotEmpty()) {
            OpIterator opIterator = new OpIterator();
            do {
                opIterator.getOperation().executeWithComposeStackTrace(opIterator, p0, p1, p2, p3);
            } while (opIterator.next());
        }
        clear();
    }
}
