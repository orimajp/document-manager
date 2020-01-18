package com.github.orimajp.docman.presentation.view.controller.team;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * チーム表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/teams")
public class TeamViewController {

    // チーム情報表示
    // チーム別ドキュメント一覧

    // チームリスト取得
    @GetMapping
    public ResponseEntity<Object> getTeamList(@RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit) {
        return ResponseEntity.noContent().build();
    }

    // チーム情報取得
    @GetMapping("{teamId}")
    public ResponseEntity<Object> getTeamData(@PathVariable("teamId") String teamId) {
        return ResponseEntity.noContent().build();
    }

}
