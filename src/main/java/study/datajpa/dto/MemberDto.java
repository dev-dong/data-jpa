package study.datajpa.dto;

import lombok.Data;
import study.datajpa.entity.Member;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }

    // member가 필드로 들어가는건 아니다.
    public MemberDto(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}
