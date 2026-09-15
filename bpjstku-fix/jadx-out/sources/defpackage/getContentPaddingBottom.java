package defpackage;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes4.dex */
public final class getContentPaddingBottom implements ContentHandler, Html.TagHandler {
    private Editable TuitionPaymentFragmentbindingInflater1;
    private getAudioEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ContentHandler TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getContentPaddingBottom(getAudioEnabled getaudioenabled) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getaudioenabled;
    }

    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            this.TuitionPaymentFragmentbindingInflater1 = editable;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = xMLReader.getContentHandler();
            xMLReader.setContentHandler(this);
        }
    }

    @Override // org.xml.sax.ContentHandler
    public final void setDocumentLocator(Locator locator) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public final void startPrefixMapping(String str, String str2) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.startPrefixMapping(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endPrefixMapping(String str) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(true, str2, this.TuitionPaymentFragmentbindingInflater1, attributes)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false, str2, this.TuitionPaymentFragmentbindingInflater1, null)) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public final void skippedEntity(String str) throws SAXException {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.skippedEntity(str);
    }
}
