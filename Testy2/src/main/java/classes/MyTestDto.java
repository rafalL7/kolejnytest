package classes;

import lombok.Builder;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Builder
class MyTestDto {
    // @Builder.Default
    private List<@Length String> footer;

    {
        footer = List.of();
    }

    // See: https://github.com/projectlombok/lombok/issues/3065
    public static class MyTestDtoBuilder {
        private List<@Length String> footer = List.of();
    }
}