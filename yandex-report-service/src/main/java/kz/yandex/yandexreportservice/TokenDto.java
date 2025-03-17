package kz.yandex.yandexreportservice;

import java.util.List;

public record TokenDto(
	List<String> roles,
	boolean isActive
) {
}
