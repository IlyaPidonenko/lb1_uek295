package ch.csbe.backendlb.resources.category.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "DTO für das Erstellen einer Kategorie")
public class CategoryCreateDto {
    @Getter
    @Schema(description = "Einzigartige Identifikationsnummer der Kategorie")
    private Long id;

    @Schema(description = "Aktivitätsstatus der Kategorie")
    private int active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Schema(description = "Name der Kategorie")
    private String name;
}
