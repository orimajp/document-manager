package com.github.orimajp.docman.application.query.response.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 文書構造取得アプリケーションレスポンスクラス
 */
@Getter
@RequiredArgsConstructor
public class GetDocumentStructureAppResponse {

    /** トップドキュメントレイヤー */
    private final DocumentLayer documentLayer;

    /**
     * ドキュメントレイヤー
     */
    @RequiredArgsConstructor
    public static class DocumentLayer {

        // ページキー
        @Getter
        private final String pageKey;

        /** ページタイトル */
        @Getter
        private final String pageTitle;

        /** 順序 */
        @Getter
        private final Integer sequence;

        /** ドキュメントレイヤーリスト */
        private List<DocumentLayer> documentLayers = new ArrayList<>();

        public boolean isEmpty() {
            return documentLayers.isEmpty();
        }

        public void addDocumentLayer(DocumentLayer documentLayer) {
            documentLayers.add(documentLayer);
        }

        public List<DocumentLayer> getDocumentLayers() {
            return Collections.unmodifiableList(documentLayers);
        }

    }


}
