package com.github.orimajp.docman.presentation.view.controller.asset;

import com.github.orimajp.docman.application.query.request.asset.GetAssetDataAppRequest;
import com.github.orimajp.docman.application.query.request.asset.GettAssetListAppRequest;
import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;
import com.github.orimajp.docman.application.query.response.asset.GetAssetListAppResponse;
import com.github.orimajp.docman.application.query.service.asset.AssetQueryService;
import com.github.orimajp.docman.presentation.view.response.asset.GetAssetDataResponse;
import com.github.orimajp.docman.presentation.view.response.asset.GetAssetListResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * アセット表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/assets")
public class AssetViewController {

    private final AssetQueryService assetQueryService;

    private final AssetViewConvertor assetViewConvertor;

    // アセットリスト取得
    @GetMapping
    public ResponseEntity<Object> getAssetList(@RequestParam("documentId") String documentId,
            @RequestParam("teamId") String teamId, @RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit) {
        // TODO

        final GettAssetListAppRequest gettAssetListAppRequest = GettAssetListAppRequest.builder()
                .documentId(documentId).tempId(teamId).page(page).limit(limit).build();
        final GetAssetListAppResponse getAssetListAppResponse = assetQueryService.getAssetList(gettAssetListAppRequest);
        final GetAssetListResponse response = assetViewConvertor.createGetAssetListResponse(getAssetListAppResponse);

        return ResponseEntity.ok(response);
    }

    // アセットデータ取得
    @GetMapping("{assetId}")
    public ResponseEntity<Object> getAssetData(@PathVariable("assetId") String assetId) {
        // TODO
        // TODO ダウンロード

        final GetAssetDataAppRequest getAssetDataAppRequest = GetAssetDataAppRequest.of(assetId);
        final GetAssetDataAppResponse getAssetDataAppResponse = assetQueryService.getAsset(getAssetDataAppRequest);
        final GetAssetDataResponse response = assetViewConvertor.createGetAssetDataResponse(getAssetDataAppResponse);

        return ResponseEntity.ok(response);
    }

}
