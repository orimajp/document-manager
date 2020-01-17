package com.github.orimajp.docman.presentation.view.controller.asset;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * アセット表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api/view/asset")
public class AssetViewController {

    // アセット取得
    @GetMapping
    public ResponseEntity<Object> getAsset() {
        return ResponseEntity.noContent().build();
    }

}
