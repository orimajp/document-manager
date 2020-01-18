package com.github.orimajp.docman.presentation.view.response.asset;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

/**
 * アセットリスト取得レスポンス
 */
@Data
public class GetAssetListResponse {

    private List<Asset> assets;

    @Data
    public static class Asset {
        private final String assetId;

        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        private final LocalDateTime lastUpdate;
    }

}
