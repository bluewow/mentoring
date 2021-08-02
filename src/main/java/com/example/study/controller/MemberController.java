package com.example.study.controller;

import com.example.study.controller.dto.JoinMember;
import com.example.study.controller.dto.ResponseMember;
import com.example.study.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"Member 컨트롤러"})
@RequiredArgsConstructor
@RestController
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join/member")
    public void join(@RequestBody JoinMember member) {
        memberService.join(member);
    }

    @PostMapping("/add/role")
    public void join(String roleName) {
        memberService.addRole(roleName);
    }

    @GetMapping("/member/get")
    public ResponseMember get(String name) {
        return memberService.get(name);
    }

    @GetMapping("/member/getAll")
    public List<ResponseMember> getAll() {
        return memberService.getAll();
    }
}
