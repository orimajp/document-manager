package com.github.orimajp.docman.application.query.response.document;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * ページデータ取得アプリケーションレスポンスクラス
 */
@Data
public class GetDocumentPageDataAppResponse {

    /** ページキー */
    private String pageKey;

    /** ページタイトル */
    private String pageTitle;

    /** ページデータ */
    private String pageData;

    /** ドキュメントキー */
    private String documentKey;

    /** 作成日時 */
    private LocalDateTime createDateTime;

    /** 作成者名 */
    private String createUserName;

    /** 更新日時 */
    private LocalDateTime updateDateTime;

    /** 更新者名 */
    private String updateUserName;

    /** リビジョン */
    private Integer revision;

    /** バージョン */
    private Integer version;

}
