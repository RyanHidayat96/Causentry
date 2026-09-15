package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lkotlin/collections/builders/SerializedCollection;", "Ljava/io/Externalizable;", "", "p0", "", "p1", "<init>", "(Ljava/util/Collection;I)V", "()V", "Ljava/io/ObjectOutput;", "", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "readExternal", "(Ljava/io/ObjectInput;)V", "", "readResolve", "()Ljava/lang/Object;", "collection", "Ljava/util/Collection;", "tag", "I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;
    public static final int tagList = 0;
    public static final int tagSet = 1;
    private Collection<?> collection;
    private final int tag;

    public SerializedCollection(Collection<?> collection, int i) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.collection = collection;
        this.tag = i;
    }

    public SerializedCollection() {
        this(CollectionsKt.emptyList(), 0);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeByte(this.tag);
        p0.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            p0.writeObject(it.next());
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput p0) throws InvalidObjectException {
        List listBuild;
        Intrinsics.checkNotNullParameter(p0, "");
        byte b = p0.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            StringBuilder sb = new StringBuilder("Unsupported flags value: ");
            sb.append((int) b);
            sb.append('.');
            throw new InvalidObjectException(sb.toString());
        }
        int i2 = p0.readInt();
        if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder("Illegal size value: ");
            sb2.append(i2);
            sb2.append('.');
            throw new InvalidObjectException(sb2.toString());
        }
        int i3 = 0;
        if (i == 0) {
            List listCreateListBuilder = CollectionsKt.createListBuilder(i2);
            while (i3 < i2) {
                listCreateListBuilder.add(p0.readObject());
                i3++;
            }
            listBuild = CollectionsKt.build(listCreateListBuilder);
        } else if (i == 1) {
            Set setCreateSetBuilder = SetsKt.createSetBuilder(i2);
            while (i3 < i2) {
                setCreateSetBuilder.add(p0.readObject());
                i3++;
            }
            listBuild = SetsKt.build(setCreateSetBuilder);
        } else {
            StringBuilder sb3 = new StringBuilder("Unsupported collection type tag: ");
            sb3.append(i);
            sb3.append('.');
            throw new InvalidObjectException(sb3.toString());
        }
        this.collection = listBuild;
    }

    private final Object readResolve() {
        return this.collection;
    }
}
